package com.example.vince.helloworldprimeract;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewDebug.IntToString;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    public int contador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;

        final Button button = (Button) findViewById(R.id.button_presioname);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                contador = contador + 1;

                Toast.makeText(getApplicationContext(), String.valueOf(contador), Toast.LENGTH_SHORT).show();
            }
        });




    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
