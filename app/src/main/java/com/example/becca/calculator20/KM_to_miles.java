package com.example.becca.calculator20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KM_to_miles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.km_to_miles);

        Button Calculate = findViewById(R.id.Calculate);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText KilometersET = findViewById(R.id.KilometersET);
                TextView Kilometers_TV = findViewById(R.id.Kilometers_TV);

                //Grabs the value
                double kilometers = Integer.parseInt(KilometersET.getText().toString());

                //Converts to miles and turns into a string
                String Mile = String.valueOf(Convert_to_miles(kilometers)).concat(" Mile(s)");

                //Updates the page
                Kilometers_TV.setText(Mile);

            }
        });
    }
    public double Convert_to_miles(double kilometers){
        if(kilometers == 0) return 0;

        kilometers *= 1.609;
        return kilometers;
    }
}
