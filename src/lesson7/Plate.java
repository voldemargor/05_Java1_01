package lesson7;

public class Plate
{
    private String name;
    private int food;

    public Plate(String name, int food)
    {
        this.name = name;
        this.food = food;
    }

    public void decreaseFood(int x)
    {
        food -= x;
    }

    public void addFood (int x)
    {
        food += x;
        System.out.println("Досыпали " + x + " еды");
    }

    public int getFood()
    {
        return food;
    }

    public String getName()
    {
        return name;
    }

    public void info()
    {
        System.out.println(name + " осталось еды: " + food);
    }

}
