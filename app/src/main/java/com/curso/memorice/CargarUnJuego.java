package com.curso.memorice;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.curso.memorice.tableros.Carta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

public class CargarUnJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargar_un_juego);

    }

    public void escribirCarta() throws IOException {

        Carta c = new Carta((Button)findViewById(R.id.botonEscribir), 1);

        String filename = "test.txt";
        ObjectOutput out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream(new File(getFilesDir(),"")+File.separator+filename));
            out.writeObject(c);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void leerCarta() throws IOException, ClassNotFoundException {
        ObjectInputStream input;
        String filename = "test.txt";
        Carta m = null;
        Log.d("DIR",getFilesDir().toString() );
        try {
            input = new ObjectInputStream(new FileInputStream(new File(new File(getFilesDir(),"")+File.separator+filename)));
            m = (Carta) input.readObject();
            Log.v("serialization","Person a="+m.getBotonCarta());
            input.close();
        } catch (StreamCorruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        TextView t = findViewById(R.id.objetoTexto);
        String s = " "+ m.getBotonCarta();
        t.setText(s);
    }

    public void m1 (View view) throws IOException, ClassNotFoundException {
        leerCarta();
    }

    public void m2 (View view) throws IOException {
        escribirCarta();
    }

}
