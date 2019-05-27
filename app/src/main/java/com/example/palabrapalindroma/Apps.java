package com.example.palabrapalindroma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Apps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);

        final Button btnNumeros = (Button) findViewById(R.id.btnNum);
        final Button btnPalabras = (Button) findViewById(R.id.btnPal);

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPal = new Intent(Apps.this, MainActivity.class);
                startActivity(intentPal);
            }
        });

        btnNumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNum = new Intent(Apps.this, NumerosAmigos.class);
                startActivity(intentNum);
            }
        });
    }
}
