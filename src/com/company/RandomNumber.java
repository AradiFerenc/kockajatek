package com.company;

import java.util.Random;

class RandomNumber {
    RandomNumber() {}
    int createRandomNumber()
    {
        Random rand=new Random();
        return rand.nextInt();
    }
}
