package lesson6;

public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
        runLimit = 500 + rand.nextInt(200);
        jumpLimit = 0.5f + ((float)rand.nextInt(2));
        swimLimit = 10+ rand.nextInt(20);
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
