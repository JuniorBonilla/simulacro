package com.example.votosoft.simulacro;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(MainActivity.this, nombre_item.class);
                startActivity(splash);
            }

        },3000);
    }

    public void onclick(View view) {
        Intent splash2 = new Intent(this, registrar_persona.class);
        startActivity(splash2);
    }
}
