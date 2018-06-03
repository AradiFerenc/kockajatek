package com.company;

public class Main {

    public static void main(String[] args) {

        //Creating objects
        AIPlayer []aiplayers = new AIPlayer[2];
        for (int i=0;i<2;i++){aiplayers[i]=new AIPlayer();}
        Dice dice=new Dice();
        GameRuler gamemanager=new GameRuler();
        Output output=new Output();


    }
}
