package com.example.unit_converter4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class teamprature extends AppCompatActivity {
    EditText input3;
    TextView output3;
    Button celsius,kelvin,fahrenheit,back;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_teamprature );
        input3=findViewById(R.id.input3 );
        output3=findViewById(R.id.output3);
        celsius=findViewById( R.id.celcious );
        kelvin=findViewById( R.id.kelvin );
        fahrenheit=findViewById( R.id.faherenheit );
        back=findViewById( R.id.bck2 );

        celsius.setOnClickListener( view -> {
            String name= input3.getText().toString();
            int number=Integer.parseInt( name );
            double celsious_val=(number);
            output3.setText(""+celsious_val);
        } );
        kelvin.setOnClickListener( view -> {
            String name= input3.getText().toString();
            int number=Integer.parseInt( name );
            float kelvin_val=(float) (number+273.15);
            output3.setText(""+kelvin_val);
        } );
        fahrenheit.setOnClickListener( view -> {
            String name= input3.getText().toString();
            int number=Integer.parseInt( name );
            double fahrenheit_val=(number*(9/5))+32;
            output3.setText(""+fahrenheit_val);
        } );
        back.setOnClickListener( view -> {
            Intent i4 =new Intent(teamprature.this,com.example.unit_converter4.MainActivity.class );
            startActivity( i4);
        } );

    }

}
