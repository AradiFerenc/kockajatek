package com.company;

class Output{
    void showWelcomeText(AIPlayer ai1, AIPlayer ai2)
    {
        System.out.println("The players are "+ ai1.name+" and "+ai2.name);
        /*System.out.println("The players are "+ai[0].name);
        for(int i=1;i<ai.length;i++){}; */
    }
    void showStarterText(AIPlayer ai)
    {
        System.out.println(ai.name+" starts:");
    }
    void showScoreText(AIPlayer ai)
    {
        System.out.println(ai.name+": "+ai.score);
    }
    void showWinText(AIPlayer ai)
    {
        System.out.println(ai.name+" has won the game!");
    }
    void showLoseText(AIPlayer ai)
    {
        System.out.println(ai.name+" has overthrew the limit and lost the game!");
    }
    void showDrawText(){
        System.out.println("It's a draw!");
    }
}
