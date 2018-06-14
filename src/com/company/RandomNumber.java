package com.company;
import java.util.Random;
public class RandomNumber {
    RandomNumber() {}
    public int createRandomNumber()
    {
        Random rand=new Random();
        return rand.nextInt();
    }
}
