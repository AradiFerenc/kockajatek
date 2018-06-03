package com.company;

public class Player {
    int score;
    int thrownNumber;
    boolean isstarter=false;
    PlayerName playername;
    String name;
    public Player()
    {
        playername=new PlayerName();
        name=playername.name;
        score=0;
        thrownNumber=0;
    }


}
