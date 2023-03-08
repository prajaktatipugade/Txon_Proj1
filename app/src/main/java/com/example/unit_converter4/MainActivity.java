package com.example.unit_converter4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button length,temp,weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        temp = findViewById(R.id.b3);
        length=findViewById( R.id.b2 );
        weight=findViewById( R.id.b1 );
        temp.setOnClickListener( view -> {
            Intent i1 =new Intent(MainActivity.this, teamprature.class );
            startActivity( i1);

        } );
        length.setOnClickListener( view -> {
            Intent i2 =new Intent(MainActivity.this, com.example.unit_converter4.length.class );
            startActivity( i2);

        } );
        weight.setOnClickListener( view -> {
            Intent i3 =new Intent(MainActivity.this, com.example.unit_converter4.weight.class );
            startActivity( i3);
        } );

    }
}