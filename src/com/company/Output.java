package com.company;

public class Output{
    public static void askForHumanPlayers()
    {
        System.out.println("How many humans do you want?");
    }
    public static void askForAIPlayers()
    {
        System.out.println("How many AI-s do you want?");
    }
    public static void showWelcomeText(Player[] players)
    {
        System.out.print("The players are ");
        for (int i=0;i<players.length-2;i++)
        {
            System.out.print(players[i].name+", ");
        }
        System.out.print(players[players.length-2].name+" and ");
        System.out.println(players[players.length-1].name+".");
    }
    public static void showStarterText(Player player)
    {
        System.out.println(player.name+" starts:");
    }
    public static void showPlayerDiceThrowText(String playername)
    {
        System.out.println("How many dices would " +playername + " like to throw with?");
    }
    public static void showPlayerDiceThrowErrorText(){System.out.println("Invalid number! The number must be between 1 and 3!");}
    public static void showScoreText(Player player)
    {
        System.out.println(player.name+": "+player.score);
    }
    public static void showWinText(Player player)
    {
        System.out.println(player.name+" has won the game!");
    }
    public static void showLoseText(Player player)
    {
        System.out.println(player.name+" has overthrew the limit and lost the game!");
    }
    public static void showDrawText(int[] index, Player[] players){
        int lastplayerindex=0;
        for(int i=0;index[i+1]>0;i++)
        {
            System.out.print(players[index[i]].name+", ");
            lastplayerindex=i;
        }
        System.out.println(players[index[lastplayerindex+1]].name+" has won the game with a draw!");

    }
    public static void showLoserWinText(Player player)
    {
        System.out.println(player.name+" has won the game after everybody threw high!");
    }
    public static void showLoserDrawText(int[] index, Player[] players){
        int lastplayerindex=0;
        for(int i=0;index[i+1]>0;i++)
        {
            System.out.print(players[index[i]].name+", ");
            lastplayerindex=i;
        }
        System.out.println(players[index[lastplayerindex+1]].name+" has won the game with a draw after everybody threw high!");

    }
}
