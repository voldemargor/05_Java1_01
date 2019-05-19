package lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe
{
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args)
    {
        initMap();
        printMap();

        while (true)
        {
            userTurn();
            printMap();
            if (checkWin(DOT_X))
            {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O))
            {
                System.out.println("AI победил!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }
        }

        System.out.println("Игра закончена!");
    }

    public static void initMap()
    {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap()
    {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++)
        {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++)
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void userTurn()
    {
        int x, y;
        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn()
    {
        int x = -1, y = -1;

        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (isCellValid(j, i))
                {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X))
                    {
                        x = j;
                        y = i;
                    }
                    map[i][j] = DOT_EMPTY;
                }

            }

        }
        if (x == -1 && y == -1)
        {
            do
            {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(y, x));
        }

        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    private static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    private static boolean isOnMap(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return true;
    }


    public static boolean isMapFull()
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }


    public static boolean checkWin(char symb)
    {
        for (int y = 0; y < SIZE; y++)
        {
            for (int x = 0; x < SIZE; x++)
            {
                if (isLineOnMap1(x, y) && isLineWin1(x, y, symb)) return true;
                if (isLineOnMap2(x, y) && isLineWin2(x, y, symb)) return true;
                if (isLineOnMap3(x, y) && isLineWin3(x, y, symb)) return true;
                if (isLineOnMap4(x, y) && isLineWin4(x, y, symb)) return true;
            }
        }
        return false;
    }

    public static boolean isLineOnMap1(int x, int y)
    {
        for (int i = 0; i < DOTS_TO_WIN; i++)
        {
            if (!isOnMap(x + i, y)) return false;
        }
        return true;
    }

    public static boolean isLineWin1(int x, int y, char symb)
    {
        for (int i = 0; i < DOTS_TO_WIN; i++)
        {
            if (map[x + i][y] != symb) return false;
        }
        return true;
    }

    public static boolean isLineOnMap2(int x, int y)
    {
        for (int i = 0; i < DOTS_TO_WIN; i++)
        {
            if (!isOnMap(x + i, y + i)) return false;
        }
        return true;
    }

    public static boolean isLineWin2(int x, int y, char symb)
    {
        for (int i = 0; i < DOTS_TO_WIN; i++)
        {
            if (map[x + i][y + i] != symb) return false;
        }
        return true;
    }

    public static boolean isLineOnMap3(int x, int y)
    {
        for (int i = 0; i < DOTS_TO_WIN; i++)
        {
            if (!isOnMap(x, y + i)) return false;
        }
        return true;
    }

    public static boolean isLineWin3(int x, int y, char symb)
    {
        for (int i = 0; i < DOTS_TO_WIN; i++)
        {
            if (map[x][y + i] != symb) return false;
        }
        return true;
    }

    public static boolean isLineOnMap4(int x, int y)
    {
        for (int i = 0; i < DOTS_TO_WIN; i++)
        {
            if (!isOnMap(x + i, y - i)) return false;
        }
        return true;
    }

    public static boolean isLineWin4(int x, int y, char symb)
    {
        for (int i = 0; i < DOTS_TO_WIN; i++)
        {
            if (map[x + i][y - i] != symb) return false;
        }
        return true;
    }
}
