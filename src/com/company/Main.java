package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creating variables
        int numberofaiplayers;
        int numberofhumanplayers;
        Scanner scanner=new Scanner(System.in);

        //Asking for basic information
        Output.askForAIPlayers();
        numberofaiplayers=scanner.nextInt();
        Output.askForHumanPlayers();
        numberofhumanplayers=scanner.nextInt();

        //Creating objects
        PlayGame playgame=new PlayGame(numberofaiplayers,numberofhumanplayers);

        //Main loop
        playgame.playTheGame();

    }
}
