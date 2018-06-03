package com.company;

public class GameRuler {
    AIPlayer []aiplayers=new AIPlayer[2];
    Dice dice;
    Output output;
    public void GameRuler()
    {
        for(int i=0;i<2;i++)
        {
            aiplayers[i]=new AIPlayer();
        }
        dice=new Dice();
        output=new Output();
    }
    public void nameCorrector()
    {
        PlayerName playername=new PlayerName();
        while(aiplayers[0].name==aiplayers[1].name)
        {
            aiplayers[0].name=playername.name;
        }
    }
    public void chooseStarter()
    {
        while(aiplayers[0].thrownNumber==aiplayers[1].thrownNumber)
        {
            aiplayers[0].thrownNumber=dice.diceThrow();
            aiplayers[1].thrownNumber=dice.diceThrow();
        }
        if(aiplayers[0].thrownNumber>aiplayers[1].thrownNumber)
        {
            aiplayers[0].isstarter=true;
        }
        else aiplayers[1].isstarter=true;
    }
    public int winStatusCheck(AIPlayer ai)
    {
        if(ai.score<21)
        {
            return 0;
        }else if(ai.score==21)
        {
            return 1;
        }
        else return 2;
    }
    public void doThrowAndCheckStatus(int i)
    {
        aiplayers[i].thrownNumber = dice.diceThrow();
        if (winStatusCheck(aiplayers[i]) == 0) {
            aiplayers[i].score = aiplayers[i].score + aiplayers[i].thrownNumber;
        } else if (winStatusCheck(aiplayers[i]) == 1) {
            output.winText(aiplayers[i]);
        } else if (i == 0) {
            output.winText(aiplayers[1]);
        } else {
            output.winText(aiplayers[0]);
        }
    }
}
