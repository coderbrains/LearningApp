package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.b1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Arithematical_calculator.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.b2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Logicalcalculator.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.b3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,BitwiseCalculator.class);
                startActivity(intent);
            }
        });


        Button button4 = findViewById(R.id.b4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MicroProcessor.class);
                startActivity(intent);
            }
        });

        Button button5 = findViewById(R.id.b5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,LearnC.class);
                startActivity(intent);
            }
        });

        Button button6 = findViewById(R.id.b6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,LearnPython.class);
                startActivity(intent);
            }
        });


        Button button7 = findViewById(R.id.b7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SplashScreen.class);
                startActivity(intent);
            }
        });


        Button button8 = findViewById(R.id.b8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,AboutPage.class);
                startActivity(intent);
            }
        });


    }
}
