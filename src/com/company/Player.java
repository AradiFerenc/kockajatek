package com.company;

public class Player {
    int thrownNumber;
    int zerothrow;
    static PlayerName playername=new PlayerName();
    String name;
    int score;
    boolean starter=false;
    public Player()
    {
        name=playername.createPlayerName();
        thrownNumber=0;
        score=0;
        zerothrow=0;
    }


}
