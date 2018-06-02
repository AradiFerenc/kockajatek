package com.company;

public class GameManager {
    public int chooseStarter(AIPlayer []ai, Dice dice)
    {
        while(ai[0].thrownNumber==ai[1].thrownNumber)
        {
            ai[0].thrownNumber=dice.diceThrow();
            ai[1].thrownNumber=dice.diceThrow();
        }
        if(ai[0].thrownNumber>ai[1].thrownNumber)
        {
            return 0;
        }
        else return 1;
    }
}
