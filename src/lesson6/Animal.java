package lesson6;

import java.util.Random;

public class Animal
{
    String name;
    public int runLimit;
    int swimLimit;
    float jumpLimit;
    Random rand = new Random();
    static int animalsCounter = 0;

    public Animal(String name)
    {
        this.name = name;
    }

    public void run(int length)
    {
        System.out.print(name + " run " + length + "m ..... ");
    }

    public void swim(int length)
    {
        System.out.print(name + " swim " + length + "m ..... ");
    }

    public void jump(int height)
    {
        System.out.print(name + " jump " + height + "m ..... ");
    }

    public int getAnimalsCounter()
    {
        return animalsCounter;
    }
}
