package com.company;

public class Output{
    public void welcomeText(AIPlayer[] ai)
    {
        System.out.println("The players are "+ ai[0].name+" and "+ai[1].name);
    }
    public void starterText(AIPlayer ai)
    {
        System.out.println(ai.name+" starts:");
    }
    public void scoreText(AIPlayer ai)
    {
        System.out.println(ai.name+": "+ai.score);
    }
    public void winText(AIPlayer ai)
    {
        System.out.println(ai.name+" Has won the game!");
    }
    public void drawText(){
        System.out.println("It's a draw!");
    }
}
