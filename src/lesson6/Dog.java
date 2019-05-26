package lesson6;

public class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
        type = "Собака";
        runLimit = 500 + rand.nextInt(200);
        jumpLimit = 0.5f + ((float)rand.nextInt(2));
        swimLimit = 10+ rand.nextInt(20);
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
