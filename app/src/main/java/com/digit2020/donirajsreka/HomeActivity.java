package com.digit2020.donirajsreka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button btnDoniraj;
    private Button btnPomogni;
    private Button btnStatistika;
    private Button btnKontakt;
    private Button btnZaNas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnDoniraj = (Button) findViewById(R.id.btnDoniraj);
        btnPomogni = (Button) findViewById(R.id.btnPomogni);
        btnStatistika = (Button) findViewById(R.id.btnStatistika);
        btnKontakt = (Button) findViewById(R.id.btnKontakt);
        btnZaNas = (Button) findViewById(R.id.btnZaNas);

        btnDoniraj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openDonirajActivity();
            }
        });

        btnPomogni.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPomogniActivity();
            }
        });

        btnStatistika.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openStatistikaActivity();
            }
        });

        btnKontakt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openKontaktActivity();
            }
        });

        btnZaNas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openZaNasActivity();
            }
        });
    }

    private void openZaNasActivity() {
        Intent intent = new Intent(this, ZaNasActivity.class);
        startActivity(intent);
    }

    private void openKontaktActivity() {
        Intent intent = new Intent(this, KontaktActivity.class);
        startActivity(intent);
    }

    private void openStatistikaActivity() {
        Intent intent = new Intent(this, StaristikaActivity.class);
        startActivity(intent);
    }

    private void openPomogniActivity() {
        Intent intent = new Intent(this, PomogniActivity.class);
        startActivity(intent);
    }

    private void openDonirajActivity() {
        Intent intent = new Intent(this,DonirajActivity.class);
        startActivity(intent);
    }


}