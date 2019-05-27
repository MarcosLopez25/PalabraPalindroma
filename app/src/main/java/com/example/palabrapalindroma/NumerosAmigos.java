package com.example.palabrapalindroma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NumerosAmigos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_amigos);

        final Button btnCalculo = (Button) findViewById(R.id.btnCalcular);
        final EditText Numero1 = (EditText) findViewById(R.id.txtNum1);
        final EditText Numero2 = (EditText) findViewById(R.id.txtNum2);

        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(Numero1.getText().toString());
                int valor2 = Integer.parseInt(Numero2.getText().toString());
                int count =0;

                for(int i=1; i<valor1;i++){
                    if(valor1%i==0){
                        count = count + i;
                    }
                }
                if(count == valor2){
                    count = 0;
                    for (int i=1; i<valor2;i++){
                        if(valor2%i == 0){
                            count = count + i;
                        }
                    }
                    if(count == valor1){
                        Toast.makeText(getApplicationContext(),"El número "+valor1+" es amigo del número "+valor2, Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(getApplicationContext(),"Los números no son amigos", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Los números no son amigos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
