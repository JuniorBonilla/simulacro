package com.example.votosoft.simulacro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void onclick(View view){
        Intent splash = new Intent(this, lista_categorias.class );
        startActivity(splash);
    }
}
