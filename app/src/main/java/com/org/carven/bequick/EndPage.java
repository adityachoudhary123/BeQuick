package com.org.carven.bequick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class EndPage extends AppCompatActivity {


    TextView endDisplay,score,comment;
    String commentList[] = {"Yours Score is Not that Good, Better Try Next Time" , " Yours Score is Good, Try to be better ", "Yours Score is Excellent, Keep it Up ",
            "You are a Math's Genius, No Words to Say "};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_page);
        showScore();
    }


    public void showScore()
    {
        endDisplay = (TextView)findViewById(R.id.enddisplay);
        score = (TextView)findViewById(R.id.score);
        comment = (TextView)findViewById(R.id.comment);

        int scoreValue = Integer.parseInt(getIntent().getStringExtra("score"));

        score.setText(Integer.toString(scoreValue));

        if(scoreValue < 5)
        comment.setText(commentList[0]);

        else if(scoreValue >= 5 && scoreValue < 10)
        comment.setText(commentList[1]);

        else if(scoreValue >= 10 && scoreValue < 15)
        comment.setText(commentList[2]);

        else
        comment.setText(commentList[3]);

    }




}
