package com.erwan.vocatus;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**Déclaration des boutons**/

public class CockActivity extends AppCompatActivity {

    ImageButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cock);

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

/**Activation des boutons**/

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage( "6 cl "+getText(R.string.vodka)+"\n1 cl "+getText(R.string.jus_citron)+"\nGinger Beer")
                        .setTitle("Moscow Mule");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("6 cl "+getText(R.string.rhum_cubain)+"\n3 cl "+getText(R.string.jus_citron_verts)+"\n7 "+getText(R.string.menthe)+"\n"+getText(R.string.eau_bulle)+"\n2 cl "+getText(R.string.sirop_sucre_canne))
                        .setTitle("Mojito");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("0.5 cl "+getText(R.string.sucre)+"\n3 cl "+getText(R.string.jus_citron)+"\n4 cl "+getText(R.string.rhum_blanc)+"\n"+getText(R.string.limonade))
                        .setTitle("Rhum Collins");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("6 cl "+getText(R.string.rhum_cubain)+"\n4 cl "+getText(R.string.jus_citron)+"\n15 cl "+getText(R.string.cola))
                        .setTitle("Cuba Libre");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("4 cl "+getText(R.string.rhum_blanc)+"\n2 cl "+getText(R.string.rhum_ambré)+"\n12 cl "+getText(R.string.jus_ananas)+"\n4 cl "+getText(R.string.lait_coco))
                        .setTitle("Pina Colada");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("5 cl "+getText(R.string.tequila)+"\n3 cl "+getText(R.string.triple_sec)+"\n2 cl "+getText(R.string.jus_citron_verts))
                        .setTitle("Margarita");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("3 cl "+getText(R.string.vodka)+"\n2 cl "+getText(R.string.sirop_melon)+"\n2 cl "+getText(R.string.chambord)+"\n5 cl "+getText(R.string.jus_ananas)+"\n6 cl "+getText(R.string.jus_cranberry))
                        .setTitle("Sex on the beach");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("6 cl "+getText(R.string.cachaça)+"\n1 "+getText(R.string.citron_vert)+"\n1 "+getText(R.string.cuillère_sucre))
                        .setTitle("Caipirinha");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("4 cl "+getText(R.string.vodka)+"\n2 cl "+getText(R.string.triple_sec)+"\n2 cl "+getText(R.string.jus_cranberry)+"\n1 cl "+getText(R.string.jus_citron_verts))
                        .setTitle("Cosmopolitan");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("4 cl "+getText(R.string.vodka)+"\n3 cl "+getText(R.string.curaçao_bleu)+"\n2 cl "+getText(R.string.jus_citron))
                        .setTitle("Blue Lagoon");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("6 cl "+getText(R.string.tequila)+"\n12 cl "+getText(R.string.jus_orange)+"\n2 cl "+getText(R.string.grenadine))
                        .setTitle("Tequila Sunrise");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("4 cl "+getText(R.string.rhum_cubain)+"\n2 cl "+getText(R.string.jus_citron_verts)+"\n1 cl "+getText(R.string.sirop_sucre_canne))
                        .setTitle("Daiquiri");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1 "+getText(R.string.louche)+" "+getText(R.string.triple_sec)+"\n1 "+getText(R.string.champagne)+"\n1 "+getText(R.string.louche)+" "+getText(R.string.jus_citron_verts)+"\n1 "+getText(R.string.louche)+" "+getText(R.string.sirop_sucre_canne))
                        .setTitle("Soupe de Champagne");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2 cl "+getText(R.string.vermouth_rouge)+"\n4 cl "+getText(R.string.campari)+"\n "+getText(R.string.eau_bulle))
                        .setTitle("Americano");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("6 cl "+getText(R.string.gin)+"\n4 cl "+getText(R.string.jus_citron)+"\n2 cl "+getText(R.string.sirop_sucre_canne)+"\n12 cl "+getText(R.string.eau_bulle))
                        .setTitle("Gin Fizz");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("6 cl "+getText(R.string.rhum_blanc)+"\n2 cl "+getText(R.string.sirop_sucre_canne)+"\n1 "+getText(R.string.tranche)+" "+getText(R.string.citron_vert))
                        .setTitle("Ti' punch");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("4 cl "+getText(R.string.vodka)+"\n4 cl "+getText(R.string.liqueur_café)+"\n2 cl "+getText(R.string.lait)+"\n2 cl "+getText(R.string.crème_fraiche))
                        .setTitle("White Russian");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("7 cl "+getText(R.string.vin_blanc)+"\n2 cl "+getText(R.string.limonade2)+"\n1 cl "+getText(R.string.grenadine))
                        .setTitle("Jacqueline");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("7 cl "+getText(R.string.vodka)+"\n5 "+getText(R.string.vermouth_dry))
                        .setTitle("Vodka martini (Vodkatini)");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage(getText(R.string.tonic)+"\n3 cl "+getText(R.string.gin))
                        .setTitle("Gin Tonic");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }


}
