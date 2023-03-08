package com.example.unit_converter4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class weight extends AppCompatActivity {
    EditText input2;
    TextView output2;
    Button kilogram,pound,gram,ton,back;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_weight );


        input2=findViewById(R.id.input2 );
        output2=findViewById( R.id.output3 );
        kilogram=findViewById( R.id.kilogram );
        gram=findViewById( R.id.gram );
        pound=findViewById( R.id.pound );
        back=findViewById(R.id.bb3);
        ton=findViewById( R.id.ton);


        kilogram.setOnClickListener( view -> {
            String name= input2.getText().toString();
            int number=Integer.parseInt( name );
            output2.setText(""+ (float) (number) );
        } );
        gram.setOnClickListener( view -> {
            String name= input2.getText().toString();
            int number=Integer.parseInt( name );
            double gram_val=(number*1000);
            output2.setText(""+gram_val);
        } );
        pound.setOnClickListener( view -> {
            String name= input2.getText().toString();
            int number=Integer.parseInt( name );
            float pound_val=(float) (number*2.2046);
            output2.setText(""+pound_val);
        } );

        ton.setOnClickListener( view -> {
            String name= input2.getText().toString();
            int number=Integer.parseInt( name );
            float ton_val=(float) (number*0.001);
            output2.setText(""+ton_val);
        } );

        back.setOnClickListener( view -> {
            Intent i4 =new Intent(weight.this,com.example.unit_converter4.MainActivity.class );
            startActivity( i4);
        } );

    }

}
