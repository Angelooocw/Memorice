package com.curso.memorice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton im11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im11= (ImageButton)findViewById(R.id.imageButton11);
    }

    public void onClick(View v){
        v.setBackgroundResource(R.drawable.fortnite);
    }

}
