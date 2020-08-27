package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity implements View.OnClickListener{

    private Button[][] buttons= new Button[3][3];
    private boolean player1turn=true;
    private int roundcounts=0;
    private int player1points=0;
    private int player2points=0;
    private TextView textViewplayer1;
    private TextView textViewplayer2;
    private Button reset_button;
    private TextView disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        disp=findViewById(R.id.dis);
        textViewplayer1=(TextView)findViewById(R.id.text_view_player1);
        textViewplayer2=(TextView)findViewById(R.id.text_view_player2);

        reset_button=(Button)findViewById(R.id.button_reset);
        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText("   ");
                resetgame();
            }
        });

        buttons[0][0]=(Button)findViewById(R.id.button_00);
        buttons[0][1]=(Button)findViewById(R.id.button_01);
        buttons[0][2]=(Button)findViewById(R.id.button_02);
        buttons[1][0]=(Button)findViewById(R.id.button_10);
        buttons[1][1]=(Button)findViewById(R.id.button_11);
        buttons[1][2]=(Button)findViewById(R.id.button_12);
        buttons[2][0]=(Button)findViewById(R.id.button_20);
        buttons[2][1]=(Button)findViewById(R.id.button_21);
        buttons[2][2]=(Button)findViewById(R.id.button_22);

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                buttons[i][j].setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        Button b=(Button)v;

        if(!b.getText().toString().equals(""))
        {
            return;
        }
        if(player1turn){
            b.setText("X");
        }
        else {
            b.setText("O");
        }
        roundcounts++;
        if(checkforwin()){
            if(player1turn)
            {
                player1wins();
            }
            else
            {
                player2wins();
            }
        }
        else
        if(roundcounts==9)
        {
            draw();
        }
        else
        {
            player1turn=!player1turn;
        }
    }

    private void player1wins() {
        player1points++;
        disp.setText("last time player 1 wins");
        Toast.makeText(this, "player 1 wins", Toast.LENGTH_LONG).show();
        updatePointsText();
        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },1500);
        resetBoard();
    }


    private void player2wins() {
        player2points++;
        disp.setText("last time player 2 wins");
        Toast.makeText(this, "player 2 wins", Toast.LENGTH_LONG).show();
        updatePointsText();
        Handler handler =new Handler() ;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },2000);
        resetBoard();
    }
    private void draw(){
        disp.setText("Draw");
        Toast.makeText(this, "Draw!", Toast.LENGTH_LONG).show();
        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },2000);
        resetBoard();
    }





    private void updatePointsText()
    {
        textViewplayer1.setText("p-->1:"+player1points);
        textViewplayer2.setText("p--> 2:"+player2points);

    }
    private void resetBoard() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                buttons[i][j].setText("");


        roundcounts=0;
        player1turn=true;
    }
    private void resetgame(){
        player1points=0;
        player2points=0;
        updatePointsText();
        resetBoard();
    }



    private  boolean checkforwin(){
        String[][] field=new String[3][3];
        for (int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                field[i][j]=buttons[i][j].getText().toString();


        for (int i=0;i<3;i++)
        {
            if(field[i][0].equals(field[i][1]) && field[i][0].equals(field[i][2])  && !field[i][0].equals(""))
            {
                return true;
            }
        }
        for (int i=0;i<3;i++)
        {
            if(field[0][i].equals(field[1][i]) && field[0][i].equals(field[2][i])  && !field[0][i].equals(""))
            {
                return true;
            }
        }

        if(field[0][0].equals(field[1][1]) && field[0][0].equals(field[2][2]) && !field[0][0].equals(""))
        {
            return true;
        }

        if(field[0][2].equals(field[1][1]) &&field[0][2].equals(field[2][0]) && !field[0][2].equals(""))
        {
            return true;
        }
        return false;



    }
}
