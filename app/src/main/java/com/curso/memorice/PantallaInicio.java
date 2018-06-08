package com.curso.memorice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PantallaInicio extends AppCompatActivity {
Button botonNuevoJuego;
Button botonCargarJuego;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicio);

        botonNuevoJuego = findViewById(R.id.buttonEmpezarJuego);
        botonCargarJuego = findViewById(R.id.buttonCargarJuego);

    }

    public void irACreditos(){
        Intent i = new Intent(getApplicationContext(), Creditos.class);
        startActivity(i);
    }

    public void irAyuda(){
        Intent i = new Intent(getApplicationContext(), Ayuda.class);
        startActivity(i);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_creditos:
                this.irACreditos();
                return true;
            case R.id.action_ayuda:
                irAyuda();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


        public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_inicio, menu);
        return true;
    }

    public void empezarJuego(View view){
        Intent i = new Intent(getApplicationContext(), EscogerNuevoJuego.class);
        startActivity(i);
    }

    public void cargarJuego(View view){
        Intent i = new Intent(getApplicationContext(), CargarUnJuego.class);
        startActivity(i);
    }


    }

