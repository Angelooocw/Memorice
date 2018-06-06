package com.curso.memorice;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;
import java.util.Vector;

public class Tablero1 extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    TextView tx;
    int imagenes[]= new int[12];
    Button botones[];
    Vector<Integer> aux= new Vector<>(24);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero1);
        tx=(TextView)findViewById(R.id.txv);

        imagenes = new int[]{
                R.drawable.calculadora,
                R.drawable.estadistica,
                R.drawable.globo,
                R.drawable.grafico,
                R.drawable.grafo,
                R.drawable.iman,
                R.drawable.icono_matraz,
                R.drawable.lupa,
                R.drawable.med,
                R.drawable.microscopio,
                R.drawable.molecula,
                R.drawable.petri,
                /*R.drawable.sist,
                R.drawable.satelite,
                R.drawable.telescopio,
                R.drawable.tubo*/
        };

        botones = new Button[]{
                b1=(Button)findViewById(R.id.button1),
                b2=(Button)findViewById(R.id.button2),
                b3=(Button)findViewById(R.id.button3),
                b4=(Button)findViewById(R.id.button4),
                b5=(Button)findViewById(R.id.button5),
                b6=(Button)findViewById(R.id.button6),
                b7=(Button)findViewById(R.id.button7),
                b8=(Button)findViewById(R.id.button8),
                b9=(Button)findViewById(R.id.button9),
                b10=(Button)findViewById(R.id.button10),
                b11=(Button)findViewById(R.id.button11),
                b12=(Button)findViewById(R.id.button12),
                b13=(Button)findViewById(R.id.button13),
                b14=(Button)findViewById(R.id.button14),
                b15=(Button)findViewById(R.id.button15),
                b16=(Button)findViewById(R.id.button16),
                b17=(Button)findViewById(R.id.button17),
                b18=(Button)findViewById(R.id.button18),
                b19=(Button)findViewById(R.id.button19),
                b20=(Button)findViewById(R.id.button20),
                b21=(Button)findViewById(R.id.button21),
                b22=(Button)findViewById(R.id.button22),
                b23=(Button)findViewById(R.id.button23),
                b24=(Button)findViewById(R.id.button24),
        };
        //Definir id de los botones para que sea mas facil acceder al arreglo asociado a los botones e imagenes
        b1.setId(0);b2.setId(1);b3.setId(2);b4.setId(3);b5.setId(4);b6.setId(5);b7.setId(6);b8.setId(7);b9.setId(8);b10.setId(9);b11.setId(10);b12.setId(11);
        b13.setId(12);b14.setId(13);b15.setId(14);b16.setId(15);b17.setId(16);b18.setId(17);b19.setId(18);b20.setId(19);b21.setId(20);b22.setId(21);b23.setId(22);b24.setId(23);
        GenerarTablero();
    }
//Se encarga de generar la distribucion de imagenes en el tablero
    public void GenerarTablero(){
        int j=0;
        for(int i=0;i<imagenes.length*2;i++){
            if(j==imagenes.length) j=0;
            aux.add(j);
            j++;
        }
        Collections.shuffle(aux);
    }


    public void onClick(View v){
        int id_boton=v.getId();
        String xx= Integer.toString(id_boton);

        tx.setText(xx);
        v.setBackgroundResource(imagenes[aux.get(id_boton)]);

    }
}
