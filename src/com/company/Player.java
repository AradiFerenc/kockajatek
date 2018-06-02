package com.company;

public class Player {
    int score;
    int thrownNumber;
    boolean isstarter=false;
    PlayerName playername=new PlayerName();
    String name;
    public Player()
    {
        name= playername.name;
        score=0;
        thrownNumber=0;
    }


}
