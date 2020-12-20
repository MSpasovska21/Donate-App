package com.digit2020.donirajsreka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonirajActivity extends AppCompatActivity {

    private Button btnHrana;
    private Button btnObleka;
    private Button btnLekovi;
    private Button btnTehnika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doniraj);

        btnHrana = (Button) findViewById(R.id.btnHrana);
        btnObleka = (Button) findViewById(R.id.buttonObleka);
        btnLekovi = (Button) findViewById(R.id.btnLekovi);
        btnTehnika = (Button) findViewById(R.id.btnTehnika);

        btnHrana.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openHranaActivity();
            }
        });

        btnObleka.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openOblekaActivity();
            }
        });

        btnLekovi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openLekoviActivity();
            }
        });

        btnTehnika.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openTehnikaActivity();
            }
        });

    }

    private void openTehnikaActivity() {
        Intent intent = new Intent(this, TehnikaActivity.class);
        startActivity(intent);
    }

    private void openLekoviActivity() {
        Intent intent = new Intent(this, LekoviActivity.class);
        startActivity(intent);
    }

    private void openOblekaActivity() {
        Intent intent = new Intent(this, OblekaActivity.class);
        startActivity(intent);
    }

    private void openHranaActivity() {
        Intent intent = new Intent(this, HranaActivity.class);
        startActivity(intent);
    }
}