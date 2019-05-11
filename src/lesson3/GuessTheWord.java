package lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheWord
{
    public static void main(String[] args)
    {
        String word = getWord();
        String userWord;

        do
        {
            System.out.println("Введите слово:");
            userWord = askWord();
            int minLength = Math.min(word.length(), userWord.length());

            for (int i = 0; i < minLength; i++)
            {
                if (word.charAt(i) == userWord.charAt(i))
                {
                    System.out.print(word.charAt(i));
                } else
                {
                    System.out.print("#");
                }
            }
            for (int i = minLength; i < 15; i++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        while (userWord.equals(word) == false);
        System.out.println("Верно! Загаданное слово: " + word);

    }

    public static String getWord()
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int number = rand.nextInt(words.length);
        return words[number];
    }

    public static String askWord()
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        return word;
    }

}

