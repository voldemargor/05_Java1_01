package lesson6;

public class Cat extends Animal
{


    public Cat(String name)
    {
        super(name);
        type = "Кот";
        runLimit = 300 + rand.nextInt(400);
        jumpLimit = 2.0f + rand.nextFloat();
        swimLimit = 0;
    }

    @Override
    public void run(int length)
    {
        super.run(length);
    }

    @Override
    public void jump(int height)
    {
        super.jump(height);
    }

    @Override
    public void swim(int height)
    {
        super.swim(height);
    }
}
