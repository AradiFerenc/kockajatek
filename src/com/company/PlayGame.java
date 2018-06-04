package com.company;

public class PlayGame{
    GameRuler gameruler;
    public PlayGame()
    {
        gameruler =new GameRuler();
    }
    public void playTheGame()
    {
        gameruler.nameCorrector();

            if(gameruler.chooseStarter()==0)
            {
                for(int x=1;x<=3;x++)
                {
                    gameruler.doRound(1, gameruler.aiplayers[1].thinkOfDiceThrow(gameruler.aiplayers[1].score));
                    if(gameruler.winStatusCheck(1))
                    {
                        return;
                    }
                    gameruler.doRound(0, gameruler.aiplayers[0].thinkOfDiceThrow(gameruler.aiplayers[0].score));
                    if(gameruler.winStatusCheck(0))
                    {
                        return;
                    }
                }
                gameruler.checkWinnerIfNotEnoughPoints();

            }
            else
                {
                    for(int x=1;x<=3;x++)
                    {
                        gameruler.doRound(0, gameruler.aiplayers[0].thinkOfDiceThrow(gameruler.aiplayers[0].score));
                        if(gameruler.winStatusCheck(0))
                        {
                            return;
                        }
                        gameruler.doRound(1, gameruler.aiplayers[1].thinkOfDiceThrow(gameruler.aiplayers[1].score));
                        if(gameruler.winStatusCheck(1))
                        {
                            return;
                        }
                    }
                gameruler.checkWinnerIfNotEnoughPoints();
                }
    }
}
