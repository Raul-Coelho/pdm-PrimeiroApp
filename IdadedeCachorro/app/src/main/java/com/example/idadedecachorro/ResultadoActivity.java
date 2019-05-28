package com.example.idadedecachorro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView resultaoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultaoIdade = findViewById(R.id.resultadoIdade);

        Intent receberIntent = getIntent();
        Bundle parametros = receberIntent.getExtras();

        if (parametros != null){
            int resultado = (int) parametros.get("resultadoIdade");

            resultaoIdade.setText(resultado+" Anos");
        }
    }
}
