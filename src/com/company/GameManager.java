package com.company;

public class GameManager extends GameRuler {
    GameRuler gameruler;
    Output output;
    public GameManager()
    {
        gameruler=new GameRuler();
        output=new Output();
    }


    public void doRound(int i,int numberofdicethrows)
    {
        for(int j=0;j<numberofdicethrows;j++)
        {
            gameruler.doThrow(i);
        }
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
