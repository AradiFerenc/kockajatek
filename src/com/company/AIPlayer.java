package com.company;

public class AIPlayer extends Player {
    public int thinkOfDiceThrow(int score)
    {
        int numberOfThrows;
        if(score <= 3)
        {
            numberOfThrows=3;
        }
        else if(score<=9)
        {
            numberOfThrows=2;
        }
        else numberOfThrows=1;

        return numberOfThrows;
    }
}
