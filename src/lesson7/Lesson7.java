package lesson7;

public class Lesson7
{
    public static void main(String[] args)
    {
        Plate plate1 = new Plate("Plate", 25);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Murzik", 10);
        cats[2] = new Cat("Bagira", 15);
        cats[3] = new Cat("Appolon", 20);
        cats[4] = new Cat("Gerakl", 25);

        for (Cat x : cats)
        {
            while (!x.isCatFull)
            {
                x.eat(plate1);
            }
        }

        for (Cat x : cats)
        {
            x.eat(plate1);
        }
    }
}
