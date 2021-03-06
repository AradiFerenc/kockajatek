package com.company;
import java.util.Scanner;
public class HumanPlayer extends Player{
    public HumanPlayer(String newname)
    {
        name=newname;
    }

    @Override
    public int thinkOfDiceThrow(int score,boolean islost)
    {
        if(!islost)
        {
            Output.showPlayerDiceThrowText(name);
            Scanner input=new Scanner(System.in);
            int numberofthrows=input.nextInt();
            while(numberofthrows<1 || numberofthrows>3)
            {
                Output.showPlayerDiceThrowErrorText();
                numberofthrows=input.nextInt();
            }
            return numberofthrows;
        }
        else return 0;
    }

}
