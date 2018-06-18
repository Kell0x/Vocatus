package com.erwan.vocatus;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FullscreenActivity extends AppCompatActivity {

        private static final boolean AUTO_HIDE = true;

        private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

        private static final int UI_ANIMATION_DELAY = 300;
        private final Handler mHideHandler = new Handler();
        private View mContentView;
        private final Runnable mHidePart2Runnable = new Runnable() {
            @SuppressLint("InlinedApi")
            @Override
            public void run() {
                // Delayed removal of status and navigation bar

                // Note that some of these constants are new as of API 16 (Jelly Bean)
                // and API 19 (KitKat). It is safe to use them, as they are inlined
                // at compile-time and do nothing on earlier devices.
                mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
            }
        };
        private View mControlsView;
        private final Runnable mShowPart2Runnable = new Runnable() {
            @Override
            public void run() {
                // Delayed display of UI elements
                mControlsView.setVisibility(View.VISIBLE);
            }
        };
        private boolean mVisible;
        private final Runnable mHideRunnable = new Runnable() {
            @Override
            public void run() {
                hide();
            }
        };
        /**
         * Touch listener to use for in-layout UI controls to delay hiding the
         * system UI. This is to prevent the jarring behavior of controls going away
         * while interacting with activity UI.
         */
        private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (AUTO_HIDE) {
                    delayedHide(AUTO_HIDE_DELAY_MILLIS);
                }
                return false;
            }
        };

        private static final int CAMERA_PIC_REQUEST = 1111;
        private ImageView mImage;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.activity_fullscreen);

            MobileAds.initialize(this, "ca-app-pub-5273829862765432~8551228196");

            Button buttonTag = findViewById(R.id.buttonTags);
            Button buttonList = findViewById(R.id.buttonList);
            Button buttonCock = findViewById(R.id.buttonCocktails);

            Toast.makeText(getBaseContext(), "Vocatus atque non vocatus", Toast.LENGTH_SHORT).show();
            Toast.makeText(getBaseContext(), "Deus aderit", Toast.LENGTH_SHORT).show();

            mVisible = false;
            mControlsView = findViewById(R.id.fullscreen_content_controls);
            mContentView = findViewById(R.id.fullscreen_content);

            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }


            // Set up the user interaction to manually show or hide the system UI.
            mContentView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    toggle();
                }
            });

            buttonTag.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tagsView(view);
                }
            });
            buttonList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listView(view);
                }
            });
            buttonCock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cockView(view);
                }
            });

            Button b = (Button) findViewById(R.id.button1);
            b.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (isExternalStorageWritable()) {
                        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        try {
                            File f = createImageFile();
                            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                            intent.putExtra(MediaStore.EXTRA_OUTPUT, FileProvider.getUriForFile(getBaseContext(), getApplicationContext().getPackageName() + ".com.erwan.vocatus.provider", f));
                            startActivityForResult(intent, CAMERA_PIC_REQUEST);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

            Button c = (Button) findViewById(R.id.button2);
            c.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (isExternalStorageReadable()) {
                        Intent intent = new Intent();
                        intent.setAction(android.content.Intent.ACTION_VIEW);
                        intent.setType(getPublicAlbumStorageDir("Vocatus") + File.separator + "*");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }
            });
        }

        String mCurrentPhotoPath;

        private File createImageFile() throws IOException {
            // Create an image file name
            String timeStamp =
                    new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String imageFileName = "" + timeStamp + "_";
            File image = File.createTempFile(
                    imageFileName,
                    ".jpg",
                    getPublicAlbumStorageDir("Vocatus")
            );
            mCurrentPhotoPath = image.getAbsolutePath();
            return image;
        }

        public File getPublicAlbumStorageDir(String albumName) {
            // Get the directory for the user's public pictures directory.
            File file = new File(Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_PICTURES), albumName);
            if (!file.mkdirs()) {
                Toast.makeText(this, "Directory not created", Toast.LENGTH_SHORT).show();
            }
            return file;
        }

        /* Checks if external storage is available for read and write */
        public boolean isExternalStorageWritable() {
            String state = Environment.getExternalStorageState();
            if (Environment.MEDIA_MOUNTED.equals(state)) {
                return true;
            }
            Toast.makeText(this, "External Storage not writable", Toast.LENGTH_SHORT).show();
            return false;
        }

        /* Checks if external storage is available to at least read */
        public boolean isExternalStorageReadable() {
            String state = Environment.getExternalStorageState();
            if (Environment.MEDIA_MOUNTED.equals(state) ||
                    Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
                return true;
            }
            Toast.makeText(this, "External Storage not readable", Toast.LENGTH_SHORT).show();
            return false;
        }

        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == CAMERA_PIC_REQUEST) {
                Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
                mImage.setImageBitmap(thumbnail);
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                thumbnail.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
                File file = new File(getPublicAlbumStorageDir("Vocatus") + File.separator + "image.jpg");
                try {
                    file.createNewFile();
                    FileOutputStream fo = new FileOutputStream(file);
                    fo.write(bytes.toByteArray());
                    fo.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        @Override
        protected void onPostCreate(Bundle savedInstanceState) {
            super.onPostCreate(savedInstanceState);

            // Trigger the initial hide() shortly after the activity has been
            // created, to briefly hint to the user that UI controls
            // are available.
            delayedHide(100);
        }

        private void toggle() {
            if (mVisible) {
                hide();
            } else {
                show();
            }
        }

        private void hide() {
            // Hide UI first
            mControlsView.setVisibility(View.GONE);
            mVisible = false;

            // Schedule a runnable to remove the status and navigation bar after a delay
            mHideHandler.removeCallbacks(mShowPart2Runnable);
            mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
        }

        @SuppressLint("InlinedApi")
        private void show() {
            // Show the system bar
            //mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            //        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
            mVisible = true;

            // Schedule a runnable to display UI elements after a delay
            mHideHandler.removeCallbacks(mHidePart2Runnable);
            mHideHandler.postDelayed(mShowPart2Runnable, UI_ANIMATION_DELAY);
        }

        private void delayedHide(int delayMillis) {
            mHideHandler.removeCallbacks(mHideRunnable);
            mHideHandler.postDelayed(mHideRunnable, delayMillis);
        }

        public void tagsView(View view) {
            Intent intent = new Intent(this, TagsActivity.class);
            startActivity(intent);

        }

        public void listView(View view) {
            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
        }

        public void cockView(View view) {
            Intent intent = new Intent(this, CockActivity.class);
            startActivity(intent);
        }
}