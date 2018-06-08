package com.curso.memorice.tableros;

import android.util.Log;
import android.widget.Button;

public class Carta {
    private Button botonCarta;
    private int imagenCarta;
    private int id;

    public Carta(Button b, int id){
        this.botonCarta = b;
        this.id = id;
    }

    public void setImagenCarta(int imagen){
        this.imagenCarta = imagen;
    }

    public Button getBotonCarta() {
        return botonCarta;
    }

    public void setBotonCarta(Button botonCarta) {
        this.botonCarta = botonCarta;
    }

    public int getImagenCarta() {
        return imagenCarta;
    }
}
