package com.company;

public class Player {
    int points;
    PlayerName playername=new PlayerName();
    String name;
    public Player()
    {
        PlayerName plyername=new PlayerName();
        name= playername.name;
    }


}
