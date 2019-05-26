package lesson6;

public class Lesson6
{
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[6];
        animals[0] = new Cat("Cat-1");
        animals[1] = new Cat("Cat-2");
        animals[2] = new Cat("Cat-3");
        animals[3] = new Dog("Dog-1");
        animals[4] = new Dog("Dog-2");
        animals[5] = new Dog("Dog-3");

        for (Animal x : animals)
        {
            x.run(600);
        }
        for (Animal x : animals)
        {
            x.jump(2);
        }
        for (Animal x : animals)
        {
            x.swim(15);
        }

    }
}
