package com.company;

public class GameRuler{

    public StatusEnum StatusCheck(Player player)
    {
        if(player.score<21)
        {
            return StatusEnum.Nothing;
        }else if(player.score==21)
        {
            return StatusEnum.Win;
        }
        else return StatusEnum.Lose;
    }
    public void doThrow(Player player)
    {
        Dice dice=new Dice();
        player.thrownNumber = dice.diceThrow();
        player.score = player.score + player.thrownNumber;
    }
    public StatusEnum winStatusCheck(Player player)
    {
            if(StatusCheck(player).equals(StatusEnum.Nothing))
            {
                Output.showScoreText(player);
                return StatusEnum.Nothing;
            }
            else if(StatusCheck(player).equals(StatusEnum.Win))
            {
                Output.showScoreText(player);
                Output.showWinText(player);
                return StatusEnum.Win;
            }
            else
            {
                if(!player.islost)
                {
                    Output.showScoreText(player);
                    Output.showLoseText(player);
                }
                player.islost=true;
                return StatusEnum.Lose;
            }
    }
    public void doThrowsForOnePlayer(Player player, int numberofdicethrows)
    {
        for(int j=0;j<numberofdicethrows;j++)
        {
            doThrow(player);
        }
    }
    public boolean checkWinnerIfNotEnoughPoints(Player[] players)
    {
        int min=21;
        int[] playerindexes=new int[players.length];
        for(int i=0;i<players.length;i++)
        {
            playerindexes[i]=-1;
        }
        int temp=0;
        for(int i=0;i<players.length;i++)
        {
            if (21-players[i].score<min && !players[i].islost)
            {
                min=21-players[i].score;
                playerindexes[temp]=i;
            }
        }
        for(int i=0;i<players.length;i++)
        {
            if(21-players[i].score==min && !players[i].islost)
            {
                playerindexes[temp]=i;
                temp++;
            }
        }
        if(playerindexes[1]>=0)
        {
            Output.showDrawText(playerindexes,players);
        }
        else if(playerindexes[0]>=0)
        {
            Output.showWinText(players[playerindexes[0]]);
        }
        else return false;
        return true;

    }
    public void checkWinnerIfTooManyPoints(Player[] players)
    {
        int min=33;
        int[] playerindexes=new int[players.length];
        for(int i=0;i<players.length;i++)
        {
            playerindexes[i]=-1;
        }
        int temp=0;
        for(int i=0;i<players.length;i++)
        {
            if (players[i].score-21<min && players[i].islost)
            {
                min=players[i].score-21;
                playerindexes[temp]=i;
            }
        }
        for(int i=0;i<players.length;i++)
        {
            if(players[i].score-21==min && players[i].islost)
            {
                playerindexes[temp]=i;
                temp++;
            }
        }
        if(playerindexes[1]>=0)
        {
            Output.showLoserDrawText(playerindexes,players);
        }
        else Output.showLoserWinText(players[playerindexes[0]]);
    }

}
