package com.company;

import java.util.Collections;
import java.util.List;

public class GameRuler{
    /*AIPlayer []aiplayers=new AIPlayer[2];
    Dice dice;
    Output output;*/
    public GameRuler()
    {
        /*initAIPlayers();
        dice=new Dice();
        output=new Output();*/
    }

    /*public void initAIPlayers() {
        for(int i=0;i<2;i++)
        {
            aiplayers[i]=new AIPlayer();
        }
    }*/


    /*public chooseStarterIndex(AIPlayer[] ais)
    {

    }*/
    public int StatusCheck(AIPlayer ai)
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
    public void doThrow(AIPlayer ai)
    {
        Dice dice=new Dice();
        ai.thrownNumber = dice.diceThrow();
        ai.score = ai.score + ai.thrownNumber;
    }
    public boolean winStatusCheck(AIPlayer ai)
    {
        Output output=new Output();
            if(StatusCheck(ai)==0)
            {
                output.showScoreText(ai);
                return false;
            }
            else if(StatusCheck(ai)==1)
            {
                output.showScoreText(ai);
                output.showWinText(ai);
                return true;
            }
            else
            {
                output.showScoreText(ai);
                output.showLoseText(ai);
                return true;
            }
    }
    public void doRound(AIPlayer ai,int numberofdicethrows)
    {
        for(int j=0;j<numberofdicethrows;j++)
        {
            doThrow(ai);
        }
    }
    public void checkWinnerIfNotEnoughPoints(AIPlayer[] ais)
    {
        Output output=new Output();
        if (21-ais[0].score<21-ais[1].score)
        {
            output.showWinText(ais[0]);
        }
        else if (21-ais[1].score<21-ais[0].score)
        {
            output.showWinText(ais[1]);
        }else output.showDrawText();
    }

}
