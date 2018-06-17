package com.company;

public class GameRuler{

    public int StatusCheck(Player ai)
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
    public void doThrow(Player ai)
    {
        Dice dice=new Dice();
        ai.thrownNumber = dice.diceThrow();
        ai.score = ai.score + ai.thrownNumber;
    }
    public boolean winStatusCheck(Player ai)
    {
            if(StatusCheck(ai)==0)
            {
                Output.showScoreText(ai);
                return false;
            }
            else if(StatusCheck(ai)==1)
            {
                Output.showScoreText(ai);
                Output.showWinText(ai);
                return true;
            }
            else
            {
                Output.showScoreText(ai);
                Output.showLoseText(ai);
                return true;
            }
    }
    public void doThrowsForOnePlayer(Player ai, int numberofdicethrows)
    {
        for(int j=0;j<numberofdicethrows;j++)
        {
            doThrow(ai);
        }
    }
    public void checkWinnerIfNotEnoughPoints(Player[] ais)
    {
        if (21-ais[0].score<21-ais[1].score)
        {
            Output.showWinText(ais[0]);
        }
        else if (21-ais[1].score<21-ais[0].score)
        {
            Output.showWinText(ais[1]);
        }else Output.showDrawText();
    }

}
