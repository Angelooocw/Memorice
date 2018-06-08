package com.curso.memorice;
import com.curso.memorice.tableros.Carta;

import java.util.Vector;

public class JuegoGuardado {

    String name;
    Vector<Carta> cartas;
    int tablero;

    public JuegoGuardado (String name, Vector<Carta> cartas, int tablero) {
        this.name = name;
        this.cartas = cartas;
        this.tablero = tablero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(Vector<Carta> cartas) {
        this.cartas = cartas;
    }

    public int getTablero() {
        return tablero;
    }

    public void setTablero(int tablero) {
        this.tablero = tablero;
    }
}
