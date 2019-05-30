package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

        // Определяем клик мышкой
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent e)
            {
                update(e);
            }
        });
    }

    private void update(MouseEvent e)
    {
        // Определяем какую клетку кликнули
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

        System.out.println(cellX + " " + cellY);

        repaint();
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

        // Узнаем размер ячейки
        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWidth / fieldSizeY;

        // Рисуем линии разметки - горизонтальные
        for (int i = 0; i < fieldSizeY; i++)
        {
            int y = i * cellHeight;
            g.drawLine(0,y,panelWidth,y);
        }
        // Рисуем линии разметки - вертикальные
        for (int i = 0; i < fieldSizeX; i++)
        {
            int x = i * cellWidth;
            g.drawLine(x,0,x,panelHeight);
        }
    }
}
