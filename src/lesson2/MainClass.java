package lesson2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        //        TASK 1
        int[] task1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < task1.length; i++) {
            if (task1[i] == 0) {
                task1[i] = 1;
            } else {
                task1[i] = 0;
            }
            System.out.print(task1[i] + " ");
        }
        System.out.println();

        //        TASK 2
        int[] task2 = new int[8];
        task2[0] = 0;
        for (int i = 1; i < task2.length; i++) {
            task2[i] = task2[i - 1] + 3;
        }
        System.out.println(Arrays.toString(task2));

        //        TASK 3
        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < task3.length; i++) {
            if (task3[i] < 6) {
                task3[i] *= 2;
            }
            System.out.print(task3[i] + " ");
        }
        System.out.println();

        //        TASK 4
        int[][] task4 = new int[5][5];
        int counter = 1;
        for (int i = 0; i < task4.length; i++)
        {
            for (int j = 0; j < task4.length; j++) {
                if (task4[i] == task4[j]){
                    task4[i][j] = 1;
                }
                System.out.print(task4[i][j] + " ");
            }
            System.out.println();
        }

        //        TASK 5
        int[] task5 = {1, 5, 3, 2, 123, 4, 5, -20, 4, 8, 9, 3};
        int size5 = task5.length;
        int max = 0;
        for (int i = 0; i < size5; i++)
        {
            if (task5[i] > max)
            {
                max = task5[i];
            }
        }
        System.out.println("Максимальное число: " + max);

        int min = max;
        for (int i = 0; i < size5; i++)
        {
            if (task5[i] < min)
            {
                min = task5[i];
            }
        }
        System.out.println("Минимальное число: " + min);

        //        TASK 6
        int[] task6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Task 6: " + isEqual(task6));

        //        TASK 7
        int[] task7 = { 4, 2, 1, 7, 9 };
        System.out.println(Arrays.toString(task7) + " — исходный");
        moveArray(task7, 16);
        

    }



    public static boolean isEqual (int [] task6)
    {
        int size = task6.length;
        int sumLeft;
        int sumRight;
        int sizeLeft = 0;

        for (int s = 0; s < size; s++)
        {
            sumLeft = 0;
            sumRight = 0;
            sizeLeft += 1;
            for (int i = 0; i < sizeLeft; i++)
            {
                sumLeft = sumLeft + task6[i];
            }

            for (int j = sizeLeft; j < size; j++)
            {
                sumRight = sumRight + task6[j];
            }

            boolean isEqual = sumLeft == sumRight;
//            System.out.println(sumLeft + " " + sumRight + " " + isEqual);
            if (isEqual){
                return true;
            }
        }
        return false;
    }

    public static void moveArray (int [] task7, int k)
    {
        int size = task7.length;
        int[] arrClone = task7.clone();
        while (k<0){
            k = k + size;
        }
        for (int i = 0; i < size; i++)
        {
            int x = (i+k)%size; // новый номер ячейки
            //System.out.println(x);
            task7[x] = arrClone[i];
        }
        System.out.println(Arrays.toString(task7) + " — cдвинутый");
    }



}
