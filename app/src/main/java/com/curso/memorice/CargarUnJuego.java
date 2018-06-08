package com.curso.memorice;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CargarUnJuego extends AppCompatActivity {

    String[] prueba = {
            "rojo",
            "amarillo"
    };

    String[] Saves;

    String datos = "archivo.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargar_un_juego);

        ListView lista;

        ArrayAdapter<String> adaptador;

        lista = (ListView) findViewById(R.id.listView2);
        lista.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, prueba);
        lista.setAdapter(adaptador);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //DisplayToast("Eligio el color "+ prueba[i-1]);
                try {
                    FileInputStream fis = openFileInput(datos);
                    DataInputStream dis = new DataInputStream(fis);
                    String su = dis.readUTF();
                    DisplayToast(su);
                    startActivity(new Intent("tablero1"));
                    dis.close();
                } catch (FileNotFoundException e) {
                    DisplayToast("Error: archivo no existente");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    private void DisplayToast(String s) {
        Toast.makeText(getBaseContext(), s, Toast.LENGTH_SHORT).show();
    }

    public void onClickSaveData(View view) {
        try {
            FileOutputStream fos = openFileOutput(datos, MODE_PRIVATE);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF("Esto es SPARTA");
            dos.flush();
            dos.close();
        } catch (FileNotFoundException e) {
            DisplayToast("Error: archivo no existente");
        } catch (IOException e) {
            e.printStackTrace();
        }
        DisplayToast("Partida Guardada");
    }

    public void onClickLoadData(View view) {
        try {
            FileInputStream fis = openFileInput(datos);
            DataInputStream dis = new DataInputStream(fis);
            String su = dis.readUTF();
            DisplayToast(su);
            dis.close();
        } catch (FileNotFoundException e) {
            DisplayToast("Error: archivo no existente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
