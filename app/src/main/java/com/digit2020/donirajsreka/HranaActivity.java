package com.digit2020.donirajsreka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class HranaActivity extends AppCompatActivity {

    private RelativeLayout parent;
    private Button btnKontaktHranaShowSnackbar1;
    private Button btnKontaktHranaShowSnackbar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hrana);

        parent = findViewById(R.id.parent_Hrana);
        btnKontaktHranaShowSnackbar1 = findViewById(R.id.btnKontaktCardHrana1);
        btnKontaktHranaShowSnackbar2 = findViewById(R.id.btnKontaktCardHrana2);

        btnKontaktHranaShowSnackbar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showSnackbar("077123456");
            }
        });

        btnKontaktHranaShowSnackbar2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showSnackbar("070999888");
            }
        });
    }

    private void showSnackbar(String number) {
        Snackbar.make(parent,"Number "+number, Snackbar.LENGTH_LONG)
                .setAction("Copy", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(HranaActivity.this, "Number copied on keyboard", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

}