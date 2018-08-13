package com.example.votosoft.simulacro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class lista_categorias extends AppCompatActivity {
    CardView Que_Hacer = (CardView)findViewById(R.id.que_hacer);
    CardView Que_Visitar = (CardView)findViewById(R.id.que_visitar);
    CardView Donde_Dormir = (CardView)findViewById(R.id.donde_dormir);
    CardView Donde_Comer = (CardView)findViewById(R.id.donde_comer);
    CardView Servicios_Turisticos = (CardView)findViewById(R.id.servicios_turisticos);
    CardView Llamadas= (CardView)findViewById(R.id.llamadas);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_categorias);
        Que_Hacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent uno = new Intent(lista_categorias.this,items_que_hacer.class);
               startActivity(uno);
            }
        });
        Que_Visitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(lista_categorias.this,items_que_visitar.class);
                startActivity(uno);
            }
        });
        Donde_Dormir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(lista_categorias.this,items_donde_dormir.class);
                startActivity(uno);
            }
        });
        Donde_Comer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(lista_categorias.this,items_donde_comer.class);
                startActivity(uno);
            }
        });
        Servicios_Turisticos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(lista_categorias.this,items_servicios_turisticos.class);
                startActivity(uno);
            }
        });
        Llamadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uno = new Intent(lista_categorias.this,items_llamadas.class);
                startActivity(uno);
            }
        });

    }
}
