package com.company;

public class Output {
    public void welcomeText(AIPlayer[] ai)
    {
        System.out.println("The players are "+ ai[0].name+" and "+ai[1].name);
    }
    public void starterText(AIPlayer ai)
    {
        System.out.println(ai.name+" starts.");
    }
    public void scoreText(AIPlayer[] ai)
    {
        System.out.println(ai[0].name+"'s score: "+ai[0].score);
        System.out.println(ai[1].name+"'s score: "+ai[1].score);
    }
    public void winText(AIPlayer ai)
    {
        System.out.println(ai.name+" Has won the game!");
    }
}
