package com.company;
import java.util.Random;
public class RandomNumber {
    RandomNumber() {}
    public int CreateRandomNumber()
    {
        Random rand=new Random();
        return rand.nextInt();
    }
}
