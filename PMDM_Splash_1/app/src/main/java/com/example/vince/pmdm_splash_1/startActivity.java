package com.example.vince.pmdm_splash_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Timer;
import java.util.TimerTask;

import static com.example.vince.pmdm_splash_1.R.layout.activity_start;

public class startActivity extends Activity {

    private long SPLASH_DELAY = 6000; //6 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_start);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(mainIntent);
                //Destruimos esta activity para prevenit
                //que el usuario retorne aqui presionando el boton Atras.
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, SPLASH_DELAY);



    }




}
