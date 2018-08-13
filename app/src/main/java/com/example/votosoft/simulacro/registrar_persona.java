package com.example.votosoft.simulacro;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class registrar_persona extends AppCompatActivity implements SensorEventListener{

    Sensor sensor;
    SensorManager sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_persona);

        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        sensor=sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);


        sm.registerListener( this ,sensor,SensorManager.SENSOR_DELAY_NORMAL);

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        String text = String.valueOf(event.values[0]);
        float valor=Float.parseFloat(text);


        if (valor==0){
           //Toast.makeText(this, "largo"+text, Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(this, acerca_de.class);
           // startActivity(intent);


        }else{
           // Toast.makeText(this, "corto"+text, Toast.LENGTH_SHORT).show();

            for (int i=0; i<1;i++){
                Intent intent = new Intent(this, acerca_de.class);
                startActivity(intent);

            }


        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
