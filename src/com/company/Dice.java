package com.company;

class Dice {
    Dice(){}
    private RandomNumber randomnumber= new RandomNumber();
    int diceThrow()
    {
        return (Math.abs(randomnumber.createRandomNumber())%6)+1;
    }
}
