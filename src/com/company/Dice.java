package com.company;

public class Dice {
    Dice(){}
    RandomNumber randomnumber= new RandomNumber();
    public int diceThrow()
    {
        return (Math.abs(randomnumber.createRandomNumber())%6)+1;
    }
}
