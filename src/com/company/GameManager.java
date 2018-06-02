package com.company;

public class GameManager {
    public String nameCorrector(AIPlayer []ai)
    {
        PlayerName playername=new PlayerName();
        while(ai[0].name==ai[1].name)
        {
            ai[0].name=playername.name;
        }
        return ai[0].name;
    }
    public boolean chooseStarter(AIPlayer []ai, Dice dice)
    {
        while(ai[0].thrownNumber==ai[1].thrownNumber)
        {
            ai[0].thrownNumber=dice.diceThrow();
            ai[1].thrownNumber=dice.diceThrow();
        }
        if(ai[0].thrownNumber>ai[1].thrownNumber)
        {
            return true;
        }
        else return false;
    }
    public int doRound(AIPlayer ai,Dice dice, int aithinkofdicethrow)
    {
        for(int i=0;i<aithinkofdicethrow;i++)
        {
            ai.thrownNumber=dice.diceThrow();
            ai.score=ai.score+ai.thrownNumber;
        }
        return ai.score;
    }
}
