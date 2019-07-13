package com.org.carven.bequick;

/**
 * Created by pratikchowdhury on 5/25/19.
 */

import java.util.Random;

public class QuestionGenerator {

    private static int level = -1;
    private int qstn1,qstn2;
    private String oper = "";
    private  int numGen;
    Random rand = new Random();
    AnswerGenerator ans = new AnswerGenerator();


    public void randNumbGen() {


        level++;

        if (level < 4) {
            numGen = rand.nextInt(1);
        } else if (level >= 4 && level < 8) {
            numGen = rand.nextInt(2);
        } else if (level >= 8 ) {
            numGen = rand.nextInt(3);
        }
    }

    public void questionGenerator()
    {
        if(numGen == 0)
        {
            qstn1 = rand.nextInt(50);
            qstn2 = rand.nextInt(50);
            oper = "+";
        }

        else if(numGen == 1)
        {
            qstn1 = rand.nextInt(150);
            qstn2 = rand.nextInt(30);
            oper = "-";
        }

        else
        {
            qstn1 = rand.nextInt(30);
            qstn2 = rand.nextInt(20);
            oper = "*";
        }


        ans.calculateAnswer(qstn1,qstn2,oper);
    }

    public  int getqstn1()
    {
        return qstn1;
    }

    public  int getqstn2()
    {
        return qstn2;
    }

    public  String getoper()
    {
        return oper;
    }


}