package com.company;

public class Player {
    int thrownNumber;
    int zerothrow;
    PlayerName playername;
    String name;
    int score;
    public Player()
    {
        playername=new PlayerName();
        name=playername.name;
        thrownNumber=0;
        score=0;
        zerothrow=0;
    }


}
