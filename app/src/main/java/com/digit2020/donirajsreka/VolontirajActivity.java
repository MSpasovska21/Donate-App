package com.digit2020.donirajsreka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class VolontirajActivity extends AppCompatActivity {

    private RelativeLayout parent;
    private Button btnPrijaviSe;
    private TextView editTextImePrezime;
    private TextView editTextMeil;
    private TextView editTextOpstina;
    private TextView editTextPoraka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volontiraj);

        parent = findViewById(R.id.parent_Volontiraj);
        btnPrijaviSe = (Button)findViewById(R.id.btnPrijaviSe);

        editTextImePrezime = findViewById(R.id.editTextImePrezime);
        editTextMeil = findViewById(R.id.editTextMeil);
        editTextOpstina = findViewById(R.id.editTextOpstina);
        editTextPoraka = findViewById(R.id.editTextPoraka);

        btnPrijaviSe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                submit();
            }
        });
    }

    private void submit() {
        editTextImePrezime.setText("");
        editTextMeil.setText("");
        editTextOpstina.setText("");
        editTextPoraka.setText("");

        Toast.makeText(VolontirajActivity.this, "Испратено", Toast.LENGTH_SHORT).show();
    }
}