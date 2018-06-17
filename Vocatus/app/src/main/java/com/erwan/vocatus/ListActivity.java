package com.erwan.vocatus;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ListActivity extends AppCompatActivity {

    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    ImageButton button8;
    ImageButton button9;
    ImageButton button10;
    ImageButton button11;
    ImageButton button12;
    ImageButton button13;
    ImageButton button14;
    ImageButton button15;
    ImageButton button16;
    ImageButton button17;
    ImageButton button18;
    ImageButton button19;
    ImageButton button20;
    ImageButton button21;
    ImageButton button22;
    ImageButton button23;
    ImageButton button24;
    ImageButton button25;
    ImageButton button26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        button1 = findViewById(R.id.imageButton1);
        button2 = findViewById(R.id.imageButton2);
        button3 = findViewById(R.id.imageButton3);
        button4 = findViewById(R.id.imageButton4);
        button5 = findViewById(R.id.imageButton5);
        button6 = findViewById(R.id.imageButton6);
        button7 = findViewById(R.id.imageButton7);
        button8 = findViewById(R.id.imageButton8);
        button9 = findViewById(R.id.imageButton9);
        button10 = findViewById(R.id.imageButton10);
        button11 = findViewById(R.id.imageButton11);
        button12 = findViewById(R.id.imageButton12);
        button13 = findViewById(R.id.imageButton13);
        button14 = findViewById(R.id.imageButton14);
        button15 = findViewById(R.id.imageButton15);
        button16 = findViewById(R.id.imageButton16);
        button17 = findViewById(R.id.imageButton17);
        button18 = findViewById(R.id.imageButton18);
        button19 = findViewById(R.id.imageButton19);
        button20 = findViewById(R.id.imageButton20);
        button21 = findViewById(R.id.imageButton21);
        button22 = findViewById(R.id.imageButton22);
        button23 = findViewById(R.id.imageButton23);
        button24 = findViewById(R.id.imageButton24);
        button25 = findViewById(R.id.imageButton25);
        button26 = findViewById(R.id.imageButton26);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de Gin\n2cl de triple sec\n1 trait de jus d'ananas")
                        .setTitle("Aloha");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de liqueur de café\n2cl de Bailey's\n2cl de triple sec\nfaire flamber et boire à la paille")
                        .setTitle("B-52");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de Baileys\n4cl de get 27")
                        .setTitle("Blowjob 2");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1cl de sirop de grenadine\n1cl de Baileys\n3cl de vodka")
                        .setTitle("Cervelle de singe");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1/3 de vodka\n1/3 de tequila\n1/3 de curaçao")
                        .setTitle("Cocaïne liquide");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de liqueur de café\n2cl de Baileys\n2cl de jus d'ananas")
                        .setTitle("Cochonne");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("4cl de tequila\n2cl de liqueur de café\nfaire flamber et boire à la paille")
                        .setTitle("Cucaracha");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1/3 de triple sec\n1/3 de Baileys\n1/3 de gin\nfaire flamber et boire à la paille")
                        .setTitle("G-52");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de vodka ou de tequila\n4cl d'abscinthe")
                        .setTitle("Head Shock");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("3cl de get 27\n3cl de Baileys\n3cl de triple sec")
                        .setTitle("Irish Flag");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1/3 de sirop de fraise\n1/3 de rhum blanc ou de vodka\n1/3 de curaçao")
                        .setTitle("M.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de vodka\n2cl d'eau-de-vie\n2cl de Malibu\n1 trait de grenadine")
                        .setTitle("Morsure de vampire");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de vodka\n0,5cl d'abscinthe\ncitron\nsucre\ncanelle")
                        .setTitle("Kalachnikov");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de vodka\n2cl de triple-sec\n2cl de jus de citron vert")
                        .setTitle("Kamikaze");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de vodka\n2cl de curaçao\n2cl de jus de citron")
                        .setTitle("Kamikaze Blue");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("3cl de vodka\n2cl de get 31\n0,5cl de curaçao")
                        .setTitle("Kiss Cool");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de vodka\n2cl d'abscinthe\n2cl de jus de citron  vert")
                        .setTitle("Little Boy");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1cl de get 27\n2cl de Tequila\n2cl de Baileys")
                        .setTitle("Orgasm");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("3cl de crème de cassis\n3cl de vodka\n1 trait de tabasco")
                        .setTitle("Sweet Spice");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de tequila\n2cl de gin\n2cl de vodka\n1 trait de curaçao")
                        .setTitle("TGV");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de triple sec\n2cl de vodka\n5 gouttes de curaçao")
                        .setTitle("Thin blue line");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de gin\n2cl de vodka\n1cl de citron vert")
                        .setTitle("Tomakazi");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl d'energy drink\n2cl de vodka\n2cl de jus d'orange")
                        .setTitle("Vitamine C bomb shot");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de liqueur de café\n2cl de malibu\n2cl de rhum")
                        .setTitle("Voodoo");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de get 27\n2cl de vodka\nfaire flamber et boire à la paille")
                        .setTitle("Waf Waf");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl de vodka\n1cl de curaçao\n1cl de triple sec\n1 trait de citron vert")
                        .setTitle("Windex");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
