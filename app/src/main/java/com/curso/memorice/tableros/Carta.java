package com.curso.memorice.tableros;

import android.widget.Button;

public class Carta {
    Button botonCarta;
    int imagenCarta;
    int id;

    public Carta(Button b, int id){
        this.botonCarta = b;
        this.id = id;
    }

    public void setImagenCarta(int imagen){
        this.imagenCarta = imagen;

    }


}
