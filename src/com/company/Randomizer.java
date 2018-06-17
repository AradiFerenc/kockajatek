package com.company;
import java.util.Random;
public class Randomizer {
    Randomizer() {}
    public int createRandomNumber()
    {
        Random rand=new Random();
        return rand.nextInt();
    }
    public static void scrambleArray(Object[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            int s = i + (int)(Math.random() * (array.length-i));
            Object temp = array[s];
            array[s]=array[i];
            array[i]=temp;
        }
    }
}
