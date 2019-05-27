package com.example.palabrapalindroma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button verificar = findViewById(R.id.btnVerificar);
        final EditText palabra = findViewById(R.id.txt1);
        final TextView txtpal = findViewById(R.id.txtPalindroma);
        final TextView txtLongitud = findViewById(R.id.txtLongitud);
        final TextView txtInvertida = findViewById(R.id.txtInver);
        final TextView txtRepetidas = findViewById(R.id.txtRepit);



        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pal = palabra.getText().toString();
                char[] arrayCadena;
                char caracter;
                char letra = ' ';

                if(!pal.isEmpty()){
                    StringBuffer palArray = new StringBuffer(pal);
                    txtInvertida.setText(palArray.reverse());
                    String inver = txtInvertida.getText().toString();
                    if(!inver.equals(pal)){
                        txtpal.setText("NO");

                    }else{
                        txtpal.setText("SI");
                    }
                    txtLongitud.setText(String.valueOf(pal.length()));

                    arrayCadena = pal.toCharArray();
                    for(int i=0; i<pal.length();i++){
                        caracter = arrayCadena[i];
                        int count = 0;
                        for (int j=0; j<arrayCadena.length;j++){
                            if(arrayCadena[j]==caracter){
                                count++;
                            }
                        }
                        letra = caracter;
                    }
                    String letras = Character.toString(letra);
                    txtRepetidas.setText(letras);
                }else{
                    Toast.makeText(getApplicationContext(), "Campo vacío", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
