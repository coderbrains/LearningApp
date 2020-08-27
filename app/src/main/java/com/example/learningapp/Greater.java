package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Greater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greater);

        final EditText editText = findViewById(R.id.num1);
        final EditText editText1 = findViewById(R.id.num2);
        final TextView textView = findViewById(R.id.result);

        Button button1 = findViewById(R.id.ad);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String s = editText.getText().toString();
                String string = editText1.getText().toString();

                if(s.length()==0){
                    editText.setError("Please Fill This Field");
                    editText.requestFocus();
                    return;
                }

                if (string.length()==0){
                    editText1.setError("Please Fill This Field");
                    editText1.requestFocus();
                    return;
                }

                double d = Double.parseDouble(s);
                double d1 = Double.parseDouble(string);


                if(d>d1){
                    textView.setText("First Number Is Greater");
                }else if(d<d1){
                    textView.setText("Second Number Is Greater");
                }else{
                    textView.setText("Both Numbers are Equal");
                }



            }
        });
    }
}
