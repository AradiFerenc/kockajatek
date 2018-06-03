package com.company;

public class GameManager {
    GameRuler gameruler;
    public GameManager()
    {
        gameruler=new GameRuler();
    }


    public void doRound(int i,int numberofdicethrows)
    {
        for(int j=0;j<numberofdicethrows;j++)
        {
            gameruler.doThrowAndCheckStatus(i);
        }
    }
}
