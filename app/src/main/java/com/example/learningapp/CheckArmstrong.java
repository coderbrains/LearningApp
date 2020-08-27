package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CheckArmstrong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_armstrong);


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



                int number , originalNumber, remainder, result = 0, n = 0;

                number = Integer.parseInt(s);

                originalNumber = number;

                for (;originalNumber != 0; originalNumber /= 10, ++n);

                originalNumber = number;

                for (;originalNumber != 0; originalNumber /= 10)
                {
                    remainder = originalNumber % 10;
                    result += Math.pow(remainder, n);
                }

                if(result == number)
                   textView.setText("ArmStrong Number");
                else
                    textView.setText("Not ArmStrong Number");


            }
        });
    }
}
