package com.example.diego.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        // setContentView(0x7f09001b)

        // constructor. "this" es un contexto
        // (contexto: AppCompactActivity -> MainActivity -> context (this)
        TextView myText = new TextView(this);

        // setText() metodo de TextView
        myText.setText("Hola AMIGUITOSSSS");

        // vista que visualizará la actividad
        setContentView(myText);



    }
}
