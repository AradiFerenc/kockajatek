package com.company;

public class PlayGame extends GameManager{
    GameManager gamemanager;
    public PlayGame()
    {
        gamemanager=new GameManager();
    }
    public void playTheGame()
    {
        gamemanager.nameCorrector();

            if(gamemanager.gameruler.chooseStarter()==0)
            {
                for(int x=0;x<3;x++)
                {
                    gamemanager.doRound(1,gamemanager.gameruler.aiplayers[1].thinkOfDiceThrow(gamemanager.gameruler.aiplayers[1].score));
                    output.scoreText(gamemanager.gameruler.aiplayers[1]);
                    gamemanager.winStatusCheck(StatusCheck(1));
                    gamemanager.doRound(0,gamemanager.gameruler.aiplayers[0].thinkOfDiceThrow(gamemanager.gameruler.aiplayers[0].score));
                    output.scoreText(gamemanager.gameruler.aiplayers[0]);
                    gamemanager.winStatusCheck(0);
                }
            }
            else
                {
                    for(int x=0;x<3;x++)
                    {
                        gamemanager.doRound(0,gamemanager.gameruler.aiplayers[0].thinkOfDiceThrow(gamemanager.gameruler.aiplayers[0].score));
                        output.scoreText(gamemanager.gameruler.aiplayers[0]);
                        gamemanager.winStatusCheck(0);
                        gamemanager.doRound(1,gamemanager.gameruler.aiplayers[1].thinkOfDiceThrow(gamemanager.gameruler.aiplayers[1].score));
                        output.scoreText(gamemanager.gameruler.aiplayers[1]);
                        gamemanager.winStatusCheck(StatusCheck(1));
                    }
                }
    }
}
