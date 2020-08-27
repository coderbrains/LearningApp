package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BitwiseCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitwise_calculator);

        Button button1 = findViewById(R.id.ac1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BitwiseCalculator.this,BitAnd.class);
                startActivity(intent);
            }
        });


        Button button2 = findViewById(R.id.ac2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BitwiseCalculator.this,BitOr.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.leftshiftt);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BitwiseCalculator.this,LeftShift.class);
                startActivity(intent);
            }
        });

        Button button4 = findViewById(R.id.ac4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BitwiseCalculator.this,RightShift.class);
                startActivity(intent);
            }
        });


        Button button5 = findViewById(R.id.ac5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BitwiseCalculator.this,ExclusiveOr.class);
                startActivity(intent);
            }
        });

    }
}
