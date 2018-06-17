package com.company;

public class Player {
    int thrownNumber;
    int zerothrow;
    static PlayerName playername=new PlayerName();
    String name;
    int score;
    boolean islost=false;
    public Player()
    {
        name=playername.createPlayerName();
        thrownNumber=0;
        score=0;
        zerothrow=0;
    }
    //this method will be overrided
    public int thinkOfDiceThrow(int score,boolean islost)
    {
        return 1;
    }


}
