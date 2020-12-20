package com.digit2020.donirajsreka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PomogniActivity extends AppCompatActivity {

    private Button btnVolontiraj;
    private Button btnPlatiSmetka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomogni);

        btnVolontiraj = (Button) findViewById(R.id.btnVolontiraj);
        btnPlatiSmetka = (Button) findViewById(R.id.buttonPlatiSmetka);

        btnVolontiraj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openVolontirajActivity();
            }
        });

        btnPlatiSmetka.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPlatiSmetkaActivity();
            }
        });
    }

    private void openPlatiSmetkaActivity() {
        Intent intent = new Intent(this, PlatiSmetkaActivity.class);
        startActivity(intent);
    }

    private void openVolontirajActivity() {
        Intent intent = new Intent(this, VolontirajActivity.class);
        startActivity(intent);
    }
}