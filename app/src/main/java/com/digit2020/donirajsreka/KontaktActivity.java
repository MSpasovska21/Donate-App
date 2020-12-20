package com.digit2020.donirajsreka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class KontaktActivity extends AppCompatActivity {

    private RelativeLayout parent;
    private Button btnIsprati;
    private TextView editTextImePrezime;
    private TextView editTextMeil;
    private TextView editTextBroj;
    private TextView editTextPoraka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakt);

        parent = findViewById(R.id.parent_Kontakt);
        btnIsprati = (Button)findViewById(R.id.btnIsprati);

        editTextImePrezime = findViewById(R.id.editTextImePrezime2);
        editTextMeil = findViewById(R.id.editTextMeil2);
        editTextBroj = findViewById(R.id.editTextBroj2);
        editTextPoraka = findViewById(R.id.editTextPoraka2);

        btnIsprati.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });
    }

    private void submitForm() {
        editTextImePrezime.setText("");
        editTextMeil.setText("");
        editTextBroj.setText("");
        editTextPoraka.setText("");

        Toast.makeText(KontaktActivity.this, "Испратено", Toast.LENGTH_SHORT).show();
    }
}