package com.erwan.vocatus;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class CockActivity extends AppCompatActivity {

    ImageButton button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cock);

        button1 = findViewById(R.id.imageButton1);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("6cl de vodka\n1cl de jus de citron\nGinger Beer")
                        .setTitle("Moscow Mule");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }


}
