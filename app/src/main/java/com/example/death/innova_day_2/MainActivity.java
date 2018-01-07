package com.example.death.innova_day_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button secondButton,thirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondButton=(Button) findViewById(R.id.button);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(MainActivity.this,"Button clicked",Toast.LENGTH_LONG).show();
                Intent myIntent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(myIntent);

            }
        });

        thirdButton=(Button) findViewById(R.id.button5);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(myIntent);

            }
        });

    }
}
