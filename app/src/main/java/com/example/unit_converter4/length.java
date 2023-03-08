package com.example.unit_converter4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class length extends AppCompatActivity {
    TextView output;
    EditText input;
    Button miles,meters,kilometer,centimeter,back;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_length );
        output=findViewById( R.id.output1 );
        miles=findViewById( R.id.miles);
        meters=findViewById( R.id.meters );
        kilometer=findViewById( R.id.kilometer);
        centimeter=findViewById( R.id.centimeter );
        input=findViewById( R.id.input1 );
        back=findViewById( R.id.bck1 );
        meters.setOnClickListener( view -> {
            String name= input.getText().toString();
            int number=Integer.parseInt( name );
            output.setText(""+ (double)(number) );
        } );
        centimeter.setOnClickListener( view -> {
            String name= input.getText().toString();
            int number=Integer.parseInt( name );
            double centimeter_val=(number*100);
            output.setText(""+centimeter_val);
        } );
        kilometer.setOnClickListener( view -> {
            String name= input.getText().toString();
            int number=Integer.parseInt( name );
           float kilometers_val=(float) (number/1000);
            output.setText(""+kilometers_val);
        } );
        miles.setOnClickListener( view -> {
            String name= input.getText().toString();
            int number=Integer.parseInt( name );
            float miles_val=(float) (number*0.0006213712);
            output.setText(""+miles_val);
        } );
        back.setOnClickListener( view -> {
            Intent i4 =new Intent(length.this,com.example.unit_converter4.MainActivity.class );
            startActivity( i4);
        } );

    }
}
