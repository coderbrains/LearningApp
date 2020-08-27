package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CheckPrime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_prime);

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



                int number = Integer.parseInt(s);

                int i = 3;

                boolean flag = true;

                while(i <= number/2){

                    if(number%i==0){
                        flag = false;
                        break;
                    }

                    i++;
                }

                if(flag == true){

                    textView.setText("Prime Number");
                }else{

                    textView.setText("Not A Prime Number");
                }


            }
        });
    }
}
