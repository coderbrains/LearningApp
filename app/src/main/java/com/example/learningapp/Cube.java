package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        final EditText editText = findViewById(R.id.num1);
        final TextView textView = findViewById(R.id.result);

        Button button1 = findViewById(R.id.ad);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String s = editText.getText().toString();

                if(s.length()==0){
                    editText.setError("Please Fill This Field");
                    editText.requestFocus();
                    return;
                }

                double d = Double.parseDouble(s);
                double d1 = d * d * d;

                textView.setText(Double.toString(d1));



            }
        });
    }
}
