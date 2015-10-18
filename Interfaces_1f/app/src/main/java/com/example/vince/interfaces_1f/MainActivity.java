package com.example.vince.interfaces_1f;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // this.setContentView(R.layout.activity_main);

            //creo widget de webview
        final WebView miWebView = (WebView) this.findViewById(R.id.webView);

            // creo el campo de texto del que recojo la URL
        final EditText campodetexto = (EditText) findViewById(R.id.campoURL);


        // creo boton IR , aplico listener que dara valor a "cargarurl"
       final  Button botonIR = (Button) findViewById(R.id.botonIR);
        botonIR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                miWebView.loadUrl(String.valueOf(campodetexto.getText()));


            }
        });


                //fin onCreate
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
