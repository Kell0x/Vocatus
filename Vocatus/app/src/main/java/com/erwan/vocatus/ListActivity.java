package com.erwan.vocatus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {

    boolean mVisible = false;

    //ImageView ImageViewAloha = findViewById(R.id.imageViewAloha);
    //ImageButton button1 = findViewById(R.id.imageButton33);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        /*ImageViewAloha.setVisibility(View.GONE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mVisible){
                    ImageViewAloha.setVisibility(View.GONE);
                    mVisible = false;
                } else {
                    ImageViewAloha.setVisibility(View.VISIBLE);
                    mVisible = true;
                }
            }
        });*/
    }
}
