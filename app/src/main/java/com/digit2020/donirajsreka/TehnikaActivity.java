package com.digit2020.donirajsreka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class TehnikaActivity extends AppCompatActivity {

    private RelativeLayout parent;
    private Button btnKontaktTehnikaShowSnackbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tehnika);

        parent = findViewById(R.id.parent_Tehnika);
        btnKontaktTehnikaShowSnackbar1 = findViewById(R.id.btnKontaktCardTehnika1);

        btnKontaktTehnikaShowSnackbar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showSnackbar("077123456");
            }
        });
    }


    private void showSnackbar(String number) {
        Snackbar.make(parent,"Number "+number, Snackbar.LENGTH_LONG)
                .setAction("Copy", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(TehnikaActivity.this, "Number copied on keyboard", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}