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
    public static void showPlayerDiceThrowText()
    {
        System.out.println("How many dices would you like to throw with?");
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
    public static void showLoseText(Player player) {System.out.println(player.name+" has overthrew the limit and lost the game!"); }
    public static void showDrawText(){
        System.out.println("It's a draw!");
    }
}
