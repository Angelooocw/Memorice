package com.curso.memorice.tableros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;


import com.curso.memorice.R;
import com.curso.memorice.tableros.Carta;

import java.util.Collections;
import java.util.Vector;

public class Tablero4x6 extends AppCompatActivity {

    Vector<Carta> cartasEnMesa = new Vector<>();
    Vector<Button> botonesCarta = new Vector<>();
    int imagenesSource[]= new int[12];
    Vector<Integer> distribucionDeImagenes =  new Vector();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero4x6);

        imagenesSource = new int[]{
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
        Log.v("Size vecotr", " " +botonesCarta.size());
        for(int i=0 ; i < 24;i++){
            String nameButton = "botonCarta" + Integer.toString((i+1));
            Button aux = findViewById(getResources().getIdentifier(nameButton, "id", getPackageName()));
            Log.d("Id button", " "+aux.getId());
            botonesCarta.add(aux);
        }

        Log.d("Size", " "+botonesCarta.size());
        generarImagenesRandomCarta();
        generarCartas();
        //Generar un orden aleatorio de las imagenes
    }

    public void generarImagenesRandomCarta(){
        int j=0;
        for(int i=0;i<imagenesSource.length*2;i++){
            if(j==imagenesSource.length) j=0;
            distribucionDeImagenes.add(imagenesSource[j]);
            j++;
        }

        Collections.shuffle(distribucionDeImagenes);
        }

        public void generarCartas(){
            for(int i=0; i < 24 ; i++){
                Log.d("ID","id boton "+ botonesCarta.elementAt(0));
                Log.d("ID"," Tama dist im "+ distribucionDeImagenes.size());
                Log.d("ID","element at 0"+ distribucionDeImagenes.elementAt(i));
                Log.d("ID","ej id"+R.drawable.dino1);
                Carta aux = new Carta(botonesCarta.elementAt(i), i);
                aux.setImagenCarta(distribucionDeImagenes.elementAt(i));
                aux.getBotonCarta().setBackgroundResource(aux.getImagenCarta());
            }

        }
}