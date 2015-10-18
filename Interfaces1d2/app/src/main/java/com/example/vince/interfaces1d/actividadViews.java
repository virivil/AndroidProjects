package com.example.vince.interfaces1d;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class actividadViews extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_views);


        final ToggleButton button = (ToggleButton) findViewById(R.id.BCambioFondo);
        final RatingBar Barraestrellas = (RatingBar) findViewById(R.id.ratingBar);
        final FrameLayout Frame = (FrameLayout) findViewById(R.id.Frame);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button.isChecked()) {
                    Frame.setBackgroundColor(Color.RED);
                } else {

                    Frame.setBackgroundColor(Color.WHITE);

                }

            }
        });

        final CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox1);
        checkbox.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (checkbox.isChecked()) {
                    String message = getResources().getString(R.string.men_oculto);
                    checkbox.setText(message);
                } else {
                    String message = getResources().getString(R.string.men);
                    checkbox.setText(message);
                }
            }
        });


       //final RelativeLayout LayRelative = (RelativeLayout) findViewById(R.id.relative);
        final TextView textview = (TextView) findViewById(R.id.textView);
        textview.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
            Toast.makeText(getApplicationContext(), "Muchas gracias", Toast.LENGTH_LONG).show();
                return true;
        }
    });




        //final
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_views, menu);
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
