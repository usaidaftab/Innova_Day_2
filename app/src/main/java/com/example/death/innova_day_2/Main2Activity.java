package com.example.death.innova_day_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity {

    Button firstActivity,thirdButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firstActivity=(Button)findViewById(R.id.button2);
        firstActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(myIntent);

            }
        });

        thirdButton=(Button) findViewById(R.id.button6);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(myIntent);

            }
        });


    }
}
