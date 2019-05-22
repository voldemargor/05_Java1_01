package lesson6;

public class Cat extends Animal
{


    public Cat(String name)
    {
        super(name);
        runLimit = 300 + rand.nextInt(400);
        jumpLimit = 2.0f + rand.nextFloat();
        swimLimit = -1;
        animalsCounter++;
    }

    @Override
    public void run(int length)
    {
        super.run(length);
        System.out.println(runLimit >= length);
    }

    @Override
    public void jump(int height)
    {
        super.jump(height);
        System.out.println(jumpLimit >= height);
    }

    @Override
    public void swim(int height)
    {
        super.swim(height);
        System.out.println(swimLimit >= height);
    }
}
