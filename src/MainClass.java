public class MainClass {
    public static void main(String[] args) {
//        System.out.println("Hello\nworld!");
//        System.out.println("5 + 7 = " + (5 + 7));
//        System.out.println('G');

//        int a = 5;
//        int c = a + b;
//
//        byte b = 127;
//        b++;
//        System.out.println(b);

//        int b = 10;
//        b = 10/4;
//        System.out.println(b);

//        long f = 123456789012L;

//        float a = 1.12345678912345f;
//        double b = 1.12345678912345;
//        System.out.println(a);
//        System.out.println(b);

//        char c = '4';
//        System.out.println(c);

//        boolean b = 2<8;
//        System.out.println(b);

//        int a = 23;
//        System.out.println(a++);
//        System.out.println(++a);

//        a += 5;
//        System.out.println(a);

//        float a = 10.0f;
//        float b = 4.0f;
//        float c = a/b;
//        System.out.println(c);

//        printHello("Vasya");
//        printHello("Petya");
//        printHello("Katya");
//        printHello();

//        printSumm(2,3,4);
//        System.out.println(summ(1,2,3));

//        isGoal(3, 9, 1);
//        isGoal(3, 19, 10);

        isDayOk(9);
        isDayOk(19);
        isDayOk(27);
        isDayOk(35);
    }

    public static void isDayOk(int x) {
        if ( ((x >= 7) && (x <= 10)) || ((x >= 17) && (x <= 22)) ) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }

    public static void isGoal(double a, double b, double x) {
        if ((a < x) && (x < b)) {
            System.out.println("Goal");
        } else {
            System.out.println("No");
        }
    }

    public static void printHello(String name) {
        System.out.println("============");
        System.out.println("Hello " + name);
        System.out.println("============");
    }

    public static void printHello() {
        System.out.println("Hello World!");
    }

    public static double summ(double a, double b, double c) {
        return a + b / c;
    }

    public static void printSumm(double a, double b, double c) {
        System.out.println(a + b / c);
    }

}
