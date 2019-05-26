package lesson7;

public class Cat
{
    private String name;
    private int appetite;
    boolean isCatFull;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName()
    {
        return name;
    }

    public void eat(Plate plate)
    {
        if (isCatFull)
        {
            System.out.println(name + " сыт");
            return;
        }
        if (plate.getFood() < appetite)
        {
            System.out.println(this.name + " пытается есть из " + plate.getName() + " - не хватает еды");
            plate.addFood(25);
        } else
        {
            System.out.println(this.name + " ест из " + plate.getName());
            plate.decreaseFood(appetite);
            isCatFull = true;
        }
    }

}
