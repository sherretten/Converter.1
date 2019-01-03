package com.example.becca.calculator20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Binary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);

        Button Calculate = findViewById(R.id.Calculate);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Binary_ET = findViewById(R.id.Binary_ET);
                EditText Hex_ET = findViewById(R.id.editText2);
                TextView textView = findViewById(R.id.textView);
                TextView textView2 = findViewById(R.id.textView3);

                int binary = Integer.parseInt(Binary_ET.getText().toString());
                int tobinary = Integer.parseInt(Hex_ET.getText().toString());
                textView.setText(binary);
            }
        });
    }
}
