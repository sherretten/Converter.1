package com.example.becca.calculator20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight);

        Button Calculate = findViewById(R.id.Calculate);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText poundsET = findViewById(R.id.editText2);
                TextView KGTV = findViewById(R.id.textView);

                double pounds = Integer.parseInt(poundsET.getText().toString());
                pounds *= .453;
                String kg = String.valueOf(pounds).concat(" kg");
                KGTV.setText(kg);

            }
        });
    }
}
