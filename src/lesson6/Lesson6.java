package lesson6;

public class Lesson6
{
    public static void main(String[] args)
    {
        Animal animal = new Animal("Animal");
        Cat cat1 = new Cat("Cat-1");
        Cat cat2 = new Cat("Cat-2");
        Cat cat3 = new Cat("Cat-3");
        Dog dog1 = new Dog("Dog-1");
        Dog dog2 = new Dog("Dog-2");
        Dog dog3 = new Dog("Dog-3");

        cat1.run(600);
        cat2.run(600);
        cat3.run(600);
        dog1.run(600);
        dog2.run(600);
        dog3.run(600);
        cat1.jump(2);
        cat2.jump(2);
        cat3.jump(2);
        dog1.jump(2);
        dog2.jump(2);
        dog3.jump(2);
        cat1.swim(15);
        cat2.swim(15);
        cat3.swim(15);
        dog1.swim(15);
        dog2.swim(15);
        dog3.swim(15);

        System.out.println("Всего животных: " + animal.getAnimalsCounter());

//        System.out.println(cat1.runLimit);
//        System.out.println(cat2.runLimit);
//        System.out.println(dog1.runLimit);
//        System.out.println(dog2.runLimit);
//        System.out.println(cat1.jumpLimit);
//        System.out.println(cat2.jumpLimit);
//        System.out.println(dog1.jumpLimit);
//        System.out.println(dog2.jumpLimit);
//        System.out.println(cat1.swimLimit);
//        System.out.println(cat2.swimLimit);
//        System.out.println(dog1.swimLimit);
//        System.out.println(dog2.swimLimit);
    }
}
