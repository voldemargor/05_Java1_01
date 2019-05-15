package test;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        int[][] multiplyTab  = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplyTab[i][j] = (i+1)*(j+1);
                //вывод ряда чисел разделенных знаком табуляции
                System.out.printf("%4d", multiplyTab[i][j]);
            }
            System.out.println();
        }
    }




}