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
        for(int x=1;x<=3;x++)
        {
            if(gamemanager.chooseStarter()==0)
            {
                gamemanager.doRound(1,aiplayers[1].thinkOfDiceThrow(aiplayers[1].score));
                output.scoreText(aiplayers[1]);
                gamemanager.winStatusCheck(StatusCheck(1));
            }
            else
                {
                    gamemanager.doRound(0,aiplayers[0].thinkOfDiceThrow(aiplayers[0].score));
                    output.scoreText(aiplayers[0]);
                    gamemanager.winStatusCheck(0);
                }
        }
    }
}
