package com.example.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActResultado extends AppCompatActivity {

    private ImageButton ibVoltar;
    private ImageView ivResultado;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_resultado);

        ibVoltar = findViewById(R.id.act_resultado_ib_voltar);
        ivResultado = findViewById(R.id.act_resultado_iv_resultado);


        recuperandoResultado();
        configurandoBotaoVoltar();


    }

    public void configurandoBotaoVoltar(){
        ibVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActTelaInicial.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void recuperandoResultado(){
        Bundle dados = getIntent().getExtras();
        numero = dados.getInt("numero");
        if(numero == 0)
            ivResultado.setImageResource(R.drawable.moeda_cara);
        else
            ivResultado.setImageResource(R.drawable.moeda_coroa);
    }
}