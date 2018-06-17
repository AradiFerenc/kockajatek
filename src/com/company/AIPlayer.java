package com.company;

public class AIPlayer extends Player {

    @Override
    public int thinkOfDiceThrow(int score,boolean islost)
    {
        if(!islost)
        {
            return 3;
            /*int numberOfThrows;
            if(score <= 3)
            {
                numberOfThrows=3;
            }
            else if(score<=9)
            {
                numberOfThrows=2;
            }
            else numberOfThrows=1;

            return numberOfThrows;*/
        }
        else return 0;
    }
}
