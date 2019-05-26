package lesson6;

import java.util.Random;

public class Animal
{
    String type;
    String name;

    int runLimit;
    int swimLimit;
    float jumpLimit;
    Random rand = new Random();

    public Animal(String name)
    {
        this.name = name;
    }

    public void run(int length)
    {
        if (length <= runLimit)
        {
            System.out.println(type + " " + name + " успешно пробежал " + length + "м");
        } else
        {
            System.out.println(type + " " + name + "столько бежать не может");
        }
    }

    public void swim (int length)
    {
        if (swimLimit == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            return;
        }
        if (length <= swimLimit)
        {
            System.out.println(type + " " + name + " успешно проплыл " + length + "м");
        } else
        {
            System.out.println(type + " " + name + "столько плыть не может");
        }
    }

    public void jump (int height)
    {
        if (height <= jumpLimit)
        {
            System.out.println(type + " " + name + " успешно проплыл " + height + "м");
        } else
        {
            System.out.println(type + " " + name + "столько плыть не может");
        }
    }

}
