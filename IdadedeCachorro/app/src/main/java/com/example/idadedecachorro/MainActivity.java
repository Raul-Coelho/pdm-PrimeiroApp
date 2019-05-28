package com.example.idadedecachorro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoCalcular;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        caixaTexto = findViewById(R.id.inputNumero);
        botaoCalcular = findViewById(R.id.botaoCalcular);
//        resultadoIdade = findViewById(R.id.textoSaida);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar input
                String textoDigitado = caixaTexto.getText().toString();
                if(textoDigitado.isEmpty()){
                    //String Vazia
                    Toast.makeText(MainActivity.this,"Nenhum numero Digitado !!", Toast.LENGTH_SHORT).show();
                }else {
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultado = valorDigitado * 7;

                    Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
                    Bundle parametros = new Bundle();
                    parametros.putInt("resultadoIdade",resultado);
                    intent.putExtras(parametros);
                    startActivity(intent);

                }
            }
        });

    }
}
