package lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args)
    {
        int round = 3;
        int size = 9;
        Random rand  = new Random();
        int number = rand.nextInt(size);
        int userNumber;
        int isContinue = 1;
        while (isContinue == 1)
        {
            System.out.println("================\nУгадайте число от 0 до " + size);
            for (int i = 0; i < round; i++)
            {
                System.out.println("Попытка " + (i + 1) + " из 3. Введите число:");
                userNumber = askNumber();
                if (number == userNumber)
                {
                    System.out.println("Угадали!");
                    break;
                } else if (number > userNumber)
                {
                    System.out.println("Загаданное число больше");
                } else if (number < userNumber)
                {
                    System.out.println("Загаданное число меньше");
                }
            }
            System.out.println("Cыграть еще раз? 1 – да / 0 – нет");
            isContinue = askNumber();
            if (isContinue == 0) {
                System.out.println("Конец");
                break;
            }
        }

    }

    public static int askNumber()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
}
