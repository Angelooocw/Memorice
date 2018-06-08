package com.curso.memorice.tableros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


import com.curso.memorice.R;
import com.curso.memorice.tableros.Carta;

import java.util.Vector;

public class Tablero4x6 extends AppCompatActivity {

    Vector<Carta> cartasEnMesa = new Vector<>(24);
    Vector<Button> botonesCarta = new Vector<>(24);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero4x6);

        imagenes = new int[]{
                R.drawable.dino1,
                R.drawable.dino2,
                R.drawable.dino3,
                R.drawable.dino4,
                R.drawable.dino5,
                R.drawable.dino6,
                R.drawable.dino7,
                R.drawable.dino8,
                R.drawable.dino9,
                R.drawable.dino10,
                R.drawable.dino11,
                R.drawable.dino12
                /*R.drawable.sist,
                R.drawable.satelite,
                R.drawable.telescopio,
                R.drawable.tubo*/
        };
    }
}
