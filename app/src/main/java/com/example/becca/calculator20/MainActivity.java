package com.example.becca.calculator20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//For the button switch statement we need to add "implements View.OnClickListener"
//Then click the red light bulb and press enter. Then it will create a new function where you will
//put the switch statement
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //Setting Buttons to their id's as a reference. So the variables are activated when clicked
        Button BinaryBtn = findViewById(R.id.BinaryBtn);
        Button HexBtn = findViewById(R.id.HexBtn);
        Button LengthBtn = findViewById(R.id.LengthBtn);
        Button WeightBtn = findViewById(R.id.WeightBtn);

        //Need this for the switch statement
        BinaryBtn.setOnClickListener(this);
        HexBtn.setOnClickListener(this);
        LengthBtn.setOnClickListener(this);
        WeightBtn.setOnClickListener(this);

    }
    //This is the switch function created from "Implements view.onclicklistener"
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.BinaryBtn :
                openBinary();
                break;
            case R.id.HexBtn :
                openHex();
                break;
            case R.id.LengthBtn :
                openLength();
                break;
            case R.id.WeightBtn :
                openWeight();
                break;
        }
   }

   //Functions to open up the different pages
    public void openHex(){
        Intent open = new Intent(this, Hex.class);
        startActivity(open);
    }
    public void openBinary(){
        Intent open = new Intent(this, Binary.class);
        startActivity(open);
   }
    public void openLength(){
        Intent open = new Intent(this, Length.class);
        startActivity(open);
   }
    public void openWeight(){
       Intent open = new Intent(this, Weight.class);
       startActivity(open);
   }
}



