package com.erwan.vocatus;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**Déclaration des Boutons**/

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
    ImageButton button27;
    ImageButton button28;

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
        button27 = findViewById(R.id.imageButton27);
        button28 = findViewById(R.id.imageButton28);

/**Activation des boutons**/

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.gin)+"\n2cl "+getText(R.string.triple_sec)+"\n1 "+getText(R.string.trait)+" "+getText(R.string.jus_ananas))
                        .setTitle("Aloha");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("Erreur")
                        .setTitle("After Eight Shot");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.liqueur_café)+"\n2cl "+getText(R.string.bailey)+"\n2cl "+getText(R.string.triple_sec)+"\n"+getText(R.string.flamber_boire))
                        .setTitle("B-52");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("Erreur")
                        .setTitle("Bazooka");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.bailey)+"\n4cl "+getText(R.string.get_27))
                        .setTitle("Blowjob 2");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1cl "+getText(R.string.grenadine)+"\n1cl "+getText(R.string.bailey)+"\n3cl "+getText(R.string.vodka))
                        .setTitle("Cervelle de singe");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1/3 "+getText(R.string.vodka)+"\n1/3 "+getText(R.string.tequila)+"\n1/3 "+getText(R.string.curaçao))
                        .setTitle("Cocaïne liquide");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.liqueur_café)+"\n2cl "+getText(R.string.bailey)+"\n2cl "+getText(R.string.jus_ananas))
                        .setTitle("Cochonne");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("4cl "+getText(R.string.tequila)+"\n2cl "+getText(R.string.liqueur_café)+"\n"+getText(R.string.flamber_boire))
                        .setTitle("Cucaracha");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1/3 "+getText(R.string.triple_sec)+"\n1/3 "+getText(R.string.bailey)+"\n1/3 "+getText(R.string.gin)+"\n"+getText(R.string.flamber_boire))
                        .setTitle("G-52");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.vodka)+" "+getText(R.string.ou)+" "+getText(R.string.tequila)+"\n4cl "+getText(R.string.abscinthe))
                        .setTitle("Head Shock");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("3cl "+getText(R.string.get_27)+"\n3cl "+getText(R.string.bailey)+"\n3cl "+getText(R.string.triple_sec))
                        .setTitle("Irish Flag");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1/3 "+getText(R.string.sirop_fraise)+"\n1/3 "+getText(R.string.rhum_blanc)+" "+getText(R.string.ou)+" "+getText(R.string.vodka)+"\n1/3 "+getText(R.string.curaçao))
                        .setTitle("M.");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.vodka)+"\n2cl "+getText(R.string.eau_vie)+"\n2cl "+getText(R.string.malibu)+"\n1 "+getText(R.string.trait)+" "+getText(R.string.grenadine))
                        .setTitle("Morsure de vampire");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.vodka)+"\n0,5cl "+getText(R.string.abscinthe)+"\n"+getText(R.string.citron)+"\n"+getText(R.string.sucre2)+"\n"+getText(R.string.cannelle))
                        .setTitle("Kalachnikov");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.vodka)+"\n2cl "+getText(R.string.triple_sec)+"\n2cl "+getText(R.string.jus_citron_verts))
                        .setTitle("Kamikaze");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.vodka)+"\n2cl "+getText(R.string.curaçao)+"\n2cl "+getText(R.string.jus_citron))
                        .setTitle("Kamikaze Blue");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("3cl "+getText(R.string.vodka)+"\n2cl "+getText(R.string.get_31)+"\n0,5cl "+getText(R.string.curaçao))
                        .setTitle("Kiss Cool");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.vodka)+"\n2cl "+getText(R.string.abscinthe)+"\n2cl "+getText(R.string.jus_citron_verts))
                        .setTitle("Little Boy");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("1cl "+getText(R.string.get_27)+"\n2cl "+getText(R.string.tequila)+"\n2cl "+getText(R.string.bailey))
                        .setTitle("Orgasm");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("3cl "+getText(R.string.crème_cassis)+"\n3cl "+getText(R.string.vodka)+"\n1 "+getText(R.string.trait)+" "+getText(R.string.tabasco))
                        .setTitle("Sweet Spice");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.tequila)+"\n2cl "+getText(R.string.gin)+"\n2cl "+getText(R.string.vodka)+"\n1 "+getText(R.string.trait)+" "+getText(R.string.curaçao))
                        .setTitle("TGV");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.triple_sec)+"\n2cl "+getText(R.string.vodka)+"\n5 "+getText(R.string.gouttes)+" "+getText(R.string.curaçao))
                        .setTitle("Thin blue line");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.gin)+"\n2cl "+getText(R.string.vodka)+"\n1cl "+getText(R.string.citron_vert))
                        .setTitle("Tomakazi");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.energy_drink)+"\n2cl "+getText(R.string.vodka)+"\n2cl "+getText(R.string.jus_orange))
                        .setTitle("Vitamine C bomb shot");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.liqueur_café)+"\n2cl "+getText(R.string.malibu)+"\n2cl "+getText(R.string.rhum))
                        .setTitle("Voodoo");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.get_27)+"\n2cl "+getText(R.string.vodka)+"\n"+getText(R.string.flamber_boire))
                        .setTitle("Waf Waf");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                builder.setMessage("2cl "+getText(R.string.vodka)+"\n1cl "+getText(R.string.curaçao)+"\n1cl "+getText(R.string.triple_sec)+"\n1 "+getText(R.string.trait)+" "+getText(R.string.citron_vert))
                        .setTitle("Windex");
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
