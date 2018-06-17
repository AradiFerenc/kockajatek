package com.company;
import java.util.Scanner;
public class HumanPlayer extends Player{
    @Override
    public int thinkOfDiceThrow(int score)
    {
        Output.showPlayerDiceThrowText();
        Scanner input=new Scanner(System.in);
        int numberofthrows=input.nextInt();
        while(numberofthrows<1 || numberofthrows>3)
        {
            Output.showPlayerDiceThrowErrorText();
            numberofthrows=input.nextInt();
        }
        return numberofthrows;
    }

}
