package com.company;

public class GameRuler{
    AIPlayer []aiplayers=new AIPlayer[2];
    Dice dice;
    Output output;
    public GameRuler()
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
    public int chooseStarter()
    {
        while(aiplayers[0].thrownNumber==aiplayers[1].thrownNumber)
        {
            aiplayers[0].thrownNumber=dice.diceThrow();
            aiplayers[1].thrownNumber=dice.diceThrow();
        }
        if(aiplayers[0].thrownNumber>aiplayers[1].thrownNumber)
        {
            return 0;
        }
        else return 1;
    }
    public int StatusCheck(int i)
    {
        if(aiplayers[i].score<21)
        {
            return 0;
        }else if(aiplayers[i].score==21)
        {
            return 1;
        }
        else return 2;
    }
    public void doThrow(int i)
    {
        aiplayers[i].thrownNumber = dice.diceThrow();
        aiplayers[i].score = aiplayers[i].score + aiplayers[i].thrownNumber;
    }
    public void winStatusCheck(int i)
    {
        if (i == 0)
        {
            if(StatusCheck(0)==0)
            {
                output.scoreText(aiplayers[0]);
            }
            else if(StatusCheck(0)==1)
            {
                output.winText(aiplayers[0]);
            }
            else
            {output.winText(aiplayers[1]);}
        } else {
            if (StatusCheck(1) == 0) {
                output.scoreText(aiplayers[1]);
            } else if (StatusCheck(1) == 1) {
                output.winText(aiplayers[1]);
            } else {
                output.winText(aiplayers[0]);
            }
        }
    }
}
