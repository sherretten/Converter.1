package com.example.becca.calculator20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Length extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);

        Button Calculate = findViewById(R.id.Calculate);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Creates the edit texts and the answer boxes.
                EditText MilesET = findViewById(R.id.MilesET);
                EditText KilometersET = findViewById(R.id.KilometersET);
                TextView Miles_TV = findViewById(R.id.Miles_TV);
                TextView Kilometers_TV = findViewById(R.id.Kilometers_TV);

                //Grabs the values of kilometers and miles.
                int miles = Integer.parseInt(MilesET.getText().toString());
                int kilometers = Integer.parseInt(KilometersET.getText().toString());

                //Converts them to the opposing.
                double MiletoKM = miles * 1.609;
                double KMtoMile = kilometers * 0.621;

                //Turns them back into strings and adds stuff
                String KM = String.valueOf(MiletoKM).concat(" KM");
                String Mile = String.valueOf(KMtoMile).concat(" Mile(s)");

                //Puts the values into the strings
                Miles_TV.setText(KM);
                Kilometers_TV.setText(Mile);

            }
        });
    }

}
