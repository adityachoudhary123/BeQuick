package com.org.carven.bequick;

/**
 * Created by pratikchowdhury on 5/26/19.
 */
public class AnswerGenerator {

    static private int answer;
    public void calculateAnswer(int qstn1, int qstn2, String oper)
    {


        if(oper == ("+"))
        {
            answer = qstn1 + qstn2;
        }

        else if(oper == ("-"))
        {
            answer = qstn1 - qstn2;
        }

        else
        {
            answer = qstn1 * qstn2;
        }


    }


    public int getAnswer()
    {
        return  answer;
    }

}
