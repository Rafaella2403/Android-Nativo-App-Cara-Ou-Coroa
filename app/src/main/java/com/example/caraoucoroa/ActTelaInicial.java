package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class ActTelaInicial extends AppCompatActivity {

    private ImageButton ibJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_inicial);

        ibJogar = findViewById(R.id.act_tela_inicial_ib_jogar);

        configurandoBotaoJogar();

    }

    public void configurandoBotaoJogar(){
        ibJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActResultado.class);
                int numero = new Random().nextInt(2);
                intent.putExtra("numero", numero);
                startActivity(intent);
                finish();
            }
        });
    }

}