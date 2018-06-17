package com.company;

public class PlayGame {
    GameRuler gameruler;
    Dice dice;
    Player[] players;
    public PlayGame(int ais, int humans) {
        players=new Player[ais+humans];
        gameruler = new GameRuler();
        initAIPlayers(ais);
        initHumanPlayers(ais,humans);
        dice = new Dice();
    }


    public void initAIPlayers(int aiplayers) {
        for (int i = 0; i < aiplayers; i++) {
            players[i] = new AIPlayer();
        }
    }

    public void initHumanPlayers(int aiplayers, int humanplayers)
    {
        for(int i=aiplayers;i<aiplayers+humanplayers;i++)
        {
            players[i]=new HumanPlayer();
        }
    }

    public void nameCorrector()
    {
        boolean samenamesexist=true;
        PlayerName playername=new PlayerName();
        while(samenamesexist)
        {
            samenamesexist=false;
            for(int i = 0; i< players.length-1; i++)
            {
                for(int j = 1; j< players.length; j++)
                {
                    if(players[i].name.equals(players[j].name))
                    {
                        samenamesexist=true;
                        players[j].name=playername.createPlayerName();
                    }
                }
            }
        }
    }


    public void playTheGame() {
        nameCorrector();
        Output.showWelcomeText(players);
        Randomizer.scrambleArray(players);
        Output.showStarterText(players[0]);
        for (int round = 1; round <= 3; round++)
        {
            if(doAFullRound()){return;}
        }
        gameruler.checkWinnerIfNotEnoughPoints(players);
    }



    public boolean doAFullRound()
    {
        for(int i=0;i<players.length;i++)
        {
            gameruler.doThrowsForOnePlayer(players[i], players[i].thinkOfDiceThrow(players[i].score));
            if (gameruler.winStatusCheck(players[i])) {return true;}
        }
        return false;
    }
}
