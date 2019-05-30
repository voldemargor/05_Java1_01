package lesson8;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel
{
    public static final int MODE_HUM_VS_AI = 0;
    public static final int MODE_HUM_VS_HUM = 1;

    int[][] field;
    int fieldSizeX;
    int fieldSizeY;
    int winningLength;

    int cellHeight;
    int cellWidth;

    boolean isFieldInit = false;

    public GameField()
    {
        setBackground(Color.ORANGE);
    }

    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winningLength)
    {
        System.out.println(mode + " " + fieldSizeX + " " + fieldSizeY + " " + winningLength);

        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winningLength = winningLength;
        field = new int[fieldSizeY][fieldSizeX];

        isFieldInit = true;
        repaint(); // Чтобы компонент перерисовался
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g)
    {
        if (!isFieldInit)
        {
            return;
        }

        // Узнаем размеры JPanel
        int panelWidth = getWidth();
        int panelHeight = getHeight();
    }
}
