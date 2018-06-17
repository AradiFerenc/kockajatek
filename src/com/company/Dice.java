package com.company;

public class Dice {
    Dice(){}
    Randomizer randomnumber= new Randomizer();
    public int diceThrow()
    {
        return (Math.abs(randomnumber.createRandomNumber())%6)+1;
    }
}
