package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creating variables
        int numberofaiplayers;
        int numberofhumanplayers;
        Scanner scanner=new Scanner(System.in);

        //Asking for players
        Output.askForAIPlayers();
        numberofaiplayers=scanner.nextInt();
        Output.askForHumanPlayers();
        numberofhumanplayers=scanner.nextInt();
        String[] names=new String[numberofhumanplayers];

        for(int i=0;i<numberofhumanplayers;i++)
        {
            Output.askForHumanPlayerNames(i);
            names[i]=scanner.next();
        }
        //Creating objects
        PlayGame playgame=new PlayGame(numberofaiplayers,numberofhumanplayers,names);

        //Main loop
        playgame.playTheGame();

    }
}
