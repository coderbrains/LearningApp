package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Arithematical_calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithematical_calculator);

        Button button1 = findViewById(R.id.ac1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Arithematical_calculator.this,Add.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.ac2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Arithematical_calculator.this,Sub.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.leftshiftt);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Arithematical_calculator.this,Mul.class);
                startActivity(intent);
            }
        });


        Button button4 = findViewById(R.id.ac4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Arithematical_calculator.this,Div.class);
                startActivity(intent);
            }
        });


        Button button5 = findViewById(R.id.ac5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Arithematical_calculator.this,Square.class);
                startActivity(intent);
            }
        });

        Button button6 = findViewById(R.id.ac6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Arithematical_calculator.this,Factorial.class);
                startActivity(intent);
            }
        });

        Button button7 = findViewById(R.id.ac7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Arithematical_calculator.this,Cube.class);
                startActivity(intent);
            }
        });


        Button button8 = findViewById(R.id.ac8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Arithematical_calculator.this,SquareRoot.class);
                startActivity(intent);
            }
        });


    }
}
