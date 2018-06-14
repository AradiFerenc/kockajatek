package com.company;

public class PlayGame {
    GameRuler gameruler;
    AIPlayer[] aiplayers = new AIPlayer[2];
    Dice dice;
    Output output;

    public PlayGame() {
        gameruler = new GameRuler();
        initAIPlayers();
        dice = new Dice();
        output = new Output();
    }

    public void initAIPlayers() {
        for (int i = 0; i < 2; i++) {
            aiplayers[i] = new AIPlayer();
        }
    }
    public void nameCorrector()
    {
        boolean samenamesexist=true;
        PlayerName playername=new PlayerName();
        while(samenamesexist)
        {
            samenamesexist=false;
            for(int i=0;i<aiplayers.length-1;i++)
            {
                for(int j=1;j<aiplayers.length;j++)
                {
                    if(aiplayers[i].name==aiplayers[j].name)
                    {
                        samenamesexist=true;
                        aiplayers[j].name=playername.createPlayerName();
                    }
                }
            }
        }
    }

    public void playTheGame() {
        nameCorrector();
        output.showWelcomeText(aiplayers[0], aiplayers[1]);
        output.showStarterText(aiplayers[0]);
        for (int x = 1; x <= 3; x++) {
            gameruler.doRound(aiplayers[0], aiplayers[0].thinkOfDiceThrow(aiplayers[0].score));
            if (gameruler.winStatusCheck(aiplayers[0])) {return;}
            gameruler.doRound(aiplayers[1], aiplayers[1].thinkOfDiceThrow(aiplayers[1].score));
            if (gameruler.winStatusCheck(aiplayers[1])) {return;}
        }
        gameruler.checkWinnerIfNotEnoughPoints(aiplayers);
    }
}
