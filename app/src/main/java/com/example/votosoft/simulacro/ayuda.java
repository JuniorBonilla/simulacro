package com.example.votosoft.simulacro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ayuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);
    }

    public void mtdRegistrar(){
        Intent intent= new Intent(this, registrar_persona.class);
        startActivity(intent);
    }
}
