package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame
{
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 505;
    private static final int WINDOW_POS_X = 40;
    private static final int WINDOW_POS_Y = 40;

    // Объявление окна New Game
    private static Window_NewGameSettings windowNewGameSettings;
    // Объявление игрового поля
    private static GameField gameField;

    public GameWindow()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Tic Tac Toe");
        setLocationRelativeTo(null);


        // Нижняя панель с 2мя кнопками
        JPanel jPanel = new JPanel(new GridLayout(1, 2));
        JButton btnNewGame = new JButton("Start New Game");
        JButton btnExit = new JButton("Exit");
        // Создание игрового поля
        gameField = new GameField();

        // Инициализация окна New Game
        windowNewGameSettings = new Window_NewGameSettings(this);

        // Привязка действия к кнопке Exit
        btnExit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        // Привязка действия к кнопке New Game
        btnNewGame.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                windowNewGameSettings.setVisible(true);
            }
        });

        // Заполнение окна элементами
        jPanel.add(btnNewGame);
        jPanel.add(btnExit);
        add(jPanel, BorderLayout.SOUTH);
        add(gameField, BorderLayout.CENTER);

        setVisible(true);

        // Вызов настроек новой игры
        windowNewGameSettings.setVisible(true);
    }

    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winningLength)
    {
        gameField.startNewGame(mode, fieldSizeX, fieldSizeY, winningLength);
    }
}
