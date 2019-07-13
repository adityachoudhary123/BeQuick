package com.org.carven.bequick;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    TextView questionShow1, questionShow2, operator, setTimer;
    Button answer1, answer2, answer3;
    private int ansOption;
    private static int score = 0;
    QuestionGenerator main = new QuestionGenerator();
    AnswerGenerator ans = new AnswerGenerator();
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(this,EndPage.class);

        new CountDownTimer(60000, 1000) {

            public void onTick(long millisUntilFinished) {
                setTimer.setText("Seconds remaining: " + millisUntilFinished / 1000);
                //here you can have your logic to set text to edittext
            }

            public void onFinish() {
                setTimer.setText("done!");
                intent.putExtra("score",Integer.toString(score));
                startActivity(intent);
                System.exit(0);            }

        }.start();


        setVariables();
    }

    @Override
    public void onBackPressed() {
        System.exit(0);
    }

    public void setVariables() {
        questionShow1 = (TextView) findViewById(R.id.questionShow1);
        questionShow2 = (TextView) findViewById(R.id.questionShow2);
        operator = (TextView) findViewById(R.id.operator);
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        setTimer = (TextView) findViewById(R.id.setTimer);
        dispQuestion();
    }

    public void dispQuestion() {


        answer1.setBackgroundColor(Color.WHITE);
        answer2.setBackgroundColor(Color.WHITE);
        answer3.setBackgroundColor(Color.WHITE);



        main.randNumbGen();
        main.questionGenerator();

        questionShow1.setText(Integer.toString(main.getqstn1()));
        questionShow2.setText(Integer.toString(main.getqstn2()));
        operator.setText(main.getoper());

        ansOption = rand.nextInt(3);

        int ansWrong1 = ans.getAnswer() + 10;
        int ansWrong2 = ans.getAnswer() - 10;
        if (ansOption == 0) {
            answer1.setText(Integer.toString(ans.getAnswer()));
            answer2.setText(Integer.toString(ansWrong1));
            answer3.setText(Integer.toString(ansWrong2));


        } else if (ansOption == 1) {
            answer1.setText(Integer.toString(ansWrong1));
            answer2.setText(Integer.toString(ans.getAnswer()));
            answer3.setText(Integer.toString(ansWrong2));
        } else {
            answer1.setText(Integer.toString(ansWrong1));
            answer2.setText(Integer.toString(ansWrong2));
            answer3.setText(Integer.toString(ans.getAnswer()));
        }

        checkAnswer();
    }

    public void checkAnswer()
    {

        final Handler handler = new Handler();


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText().equals(Integer.toString(ans.getAnswer())))
                {
                    score++;
                    answer1.setBackgroundColor(Color.GREEN);
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            dispQuestion();
                        }
                    }, 500);


                }
                else
                {
                    answer1.setBackgroundColor(Color.RED);
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            dispQuestion();
                        }
                    }, 500);
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText().equals(Integer.toString(ans.getAnswer())))
                {
                    score++;
                    answer2.setBackgroundColor(Color.GREEN);
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            dispQuestion();
                        }
                    }, 500);

                }
                else
                {
                    answer2.setBackgroundColor(Color.RED);
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            dispQuestion();
                        }
                    }, 500);
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText().equals(Integer.toString(ans.getAnswer())))
                {
                    score++;
                    answer3.setBackgroundColor(Color.GREEN);
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            dispQuestion();
                        }
                    }, 500);
                }
                else
                {
                    answer3.setBackgroundColor(Color.RED);
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            dispQuestion();
                        }
                    }, 500);
                }

            }
        });


    }




}