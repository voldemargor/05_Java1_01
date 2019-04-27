public class MainClass {
    public static void main(String[] args)
    {
        byte aa1 = 127;
        short aa2 = 9999;
        int aa3 = 999999999;
        long aa4 = 9999999999999L;
        float aa5 = 9.999999f;
        double aa6 = 9.9999999999999;
        char aa7 = 'G';
        boolean aa8 = 2>8;
        String aa9 = "Hello World!";
//
        task3(5,2,3,4);
        task4(5,10);
        task4(15,15);
        task5(5);
        task5(-5);
        task6(5);
        task6(-5);
        task7("Иван");
        task8(2019);
        task8(2020);
        task8(100);
        task8(300);
        task8(400);
        task8(800);
    }

    public static void task3 (float a, float b, float c, float d)
    {
        System.out.println (a * (b + (c / d)));
    }

    public static void task4 (int a, int b)
    {
        int c = a+b;
        boolean d = (c >= 10) && (c <= 20);
        System.out.println(d);
    }

    public static void task5 (int a)
    {
        if (a >=0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void task6 (int a)
    {
        boolean d = a < 0;
        System.out.println(d);
    }

    public static void task7 (String username)
    {
        System.out.println("Привет, " + username + "!");
    }

    public static void task8 (int year)
    {
        int x4 = year%4;
        int x100 = year%100;
        int x400 = year%400;

        if ((x400==0) || ((x4==0) && (x100 != 0)))
        {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - это обычный год");
        }
    }
}
