package com.digit2020.donirajsreka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class OblekaActivity extends AppCompatActivity {

    private RelativeLayout parent;
    private Button btnKontaktOblekaShowSnackbar1;
    private Button btnKontaktOblekaShowSnackbar2;
    private Button btnKontaktOblekaShowSnackbar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obleka);

        parent = findViewById(R.id.parent_Obleka);
        btnKontaktOblekaShowSnackbar1 = findViewById(R.id.btnKontaktCardObleka1);
        btnKontaktOblekaShowSnackbar2 = findViewById(R.id.btnKontaktCardObleka2);
        btnKontaktOblekaShowSnackbar3 = findViewById(R.id.btnKontaktCardObleka3);

        btnKontaktOblekaShowSnackbar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showSnackbar("077655645");
            }
        });

        btnKontaktOblekaShowSnackbar2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showSnackbar("070455864");
            }
        });

        btnKontaktOblekaShowSnackbar3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showSnackbar("070111111");
            }
        });

    }

    private void showSnackbar(String number) {
        Snackbar.make(parent,"Number "+number, Snackbar.LENGTH_LONG)
                .setAction("Copy", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(OblekaActivity.this, "Number copied on keyboard", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}