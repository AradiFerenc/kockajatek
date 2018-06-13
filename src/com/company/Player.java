package com.company;

class Player {
    int thrownNumber;
    private static PlayerName playername=new PlayerName();
    String name;
    int score;
    private int zerothrow;
    boolean starter=false;
    Player()
    {
        name=playername.createPlayerName();
        thrownNumber=0;
        score=0;
        zerothrow=0;
    }


}
