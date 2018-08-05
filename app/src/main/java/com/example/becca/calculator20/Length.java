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
                TextView Miles_TV = findViewById(R.id.Miles_TV);

                //Grabs the values of kilometers and miles. Then converts
                double miles = Integer.parseInt(MilesET.getText().toString());

                //Turns them back into strings and adds stuff
                String KM = String.valueOf(Convert_to_kilometers(miles)).concat(" KM");

                //Puts the values into the strings
                Miles_TV.setText(KM);

            }
        });
    }
    protected double Convert_to_kilometers(double miles){
        miles *= 0.621;
        return miles;
    }
}
