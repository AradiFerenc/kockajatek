package com.company;

public class Player {
    int thrownNumber;
    int zerothrow;
    static PlayerName playername=new PlayerName();
    String name;
    int score;
    public Player()
    {
        name=playername.createPlayerName();
        thrownNumber=0;
        score=0;
        zerothrow=0;
    }
    //this method will be overrided
    public int thinkOfDiceThrow(int score)
    {
        return 1;
    }


}
