package com.example.trabajogrupal1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);
    }

    public void agente(View view){startActivity(new Intent(this, AgenteActivity.class));}

    public void solicitante(View view){startActivity(new Intent(this, SolicitanteActivity.class));}

    //hola
}