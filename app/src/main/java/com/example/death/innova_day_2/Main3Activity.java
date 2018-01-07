package com.example.death.innova_day_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends Activity {

    Button firstActivity,secondButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        firstActivity=(Button)findViewById(R.id.button3);
        firstActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent=new Intent(Main3Activity.this,MainActivity.class);
                startActivity(myIntent);

            }
        });

        secondButton=(Button) findViewById(R.id.button4);


        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(MainActivity.this,"Button clicked",Toast.LENGTH_LONG).show();
                Intent myIntent=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(myIntent);

            }
        });
    }
}
