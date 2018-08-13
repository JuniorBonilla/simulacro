package com.example.votosoft.simulacro;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class registrar_persona extends AppCompatActivity {

    Sensor sensor;
    SensorManager sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_persona);
        //sensor=(Sensor)
                //sm=(SensorManager)
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        sensor=sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        //sm.registerListener(savedInstanceState, Sensor.REPORTING_MODE_CONTINUOUS);
        /*
        sensor=sm.getDefaultSensor(savedInstanceState.getBinder(Sensor.STRING_TYPE_PROXIMITY));
        sensor=(Sensor)savedInstanceState.getBinder(Sensor.STRING_TYPE_PROXIMITY);
        sm=sensor.getFifoMaxEventCount()
                sm.registerListener();*/
    }


}
