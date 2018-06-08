package com.curso.memorice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.curso.memorice.tableros.Tablero4x6;

public class EscogerNuevoJuego extends AppCompatActivity {

    Button tablerotipo1;
    Button tablerotipo2;
    Button tablerotipo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoger_nuevo_juego);
    tablerotipo1 = findViewById(R.id.buttonJuego4x6);
    }


    public void juego4x6(View view){
        Intent i = new Intent(getApplicationContext(), Tablero4x6.class);
        startActivity(i);
    }
}
