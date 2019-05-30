package lesson8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window_NewGameSettings extends JFrame
{
    private final GameWindow gameWindow;

    private static final int WINDOW_HEIGHT = 230;
    private static final int WINDOW_WEIDTH = 350;

    private static final int MIN_WINNING_LENGTH = 3;
    private static final int MAX_WINNING_LENGTH = 10;
    private static final int MIN_FILED_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    private static final String TXT_WINNING_LENGTH = "Winning Length: ";
    private static final String TXT_FIELD_SIZE = "Field Size: ";

    private JRadioButton radioHumanVsAI = new JRadioButton("Human vs AI", true);
    private JRadioButton radioHumanVsHuman = new JRadioButton("Human vs Human");
    private ButtonGroup radioGroupGameMode = new ButtonGroup();
    private JSlider sliderFieldSize;
    private JSlider sliderWinningLength;

    public Window_NewGameSettings(GameWindow gameWindow)
    {
        this.gameWindow = gameWindow;
        setSize(WINDOW_WEIDTH, WINDOW_HEIGHT);
        setVisible(false);
        setTitle("Start New Game");

        // Получение размеров окна gameWindow
        Rectangle gameWindowBounds = gameWindow.getBounds();

        int posX = (int) (gameWindowBounds.getCenterX() - WINDOW_WEIDTH / 2);
        int posY = (int) (gameWindowBounds.getCenterY() - WINDOW_HEIGHT / 2);
        setLocation(posX, posY);

//        setLocationRelativeTo(gameWindow);
        setResizable(false);
        setAlwaysOnTop(true);

        setLayout(new GridLayout(10, 1));

        addForm_GameMode();
        addForm_FieldWinningLength();
        JButton btnStartGame = new JButton("Start Game");
        btnStartGame.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnStartGameClick();
            }
        });
        add(btnStartGame);

    }

    private void addForm_GameMode()
    {
        add(new JLabel("Selec Game Mode"));
        radioGroupGameMode.add(radioHumanVsAI);
        radioGroupGameMode.add(radioHumanVsHuman);
        add(radioHumanVsAI);
        add(radioHumanVsHuman);

    }

    private void addForm_FieldWinningLength()
    {
        add(new JLabel("Choose Field Size"));
        JLabel txtFieldSize = new JLabel(TXT_FIELD_SIZE + MIN_FILED_SIZE);
        add(txtFieldSize);
        sliderFieldSize = new JSlider(MIN_FILED_SIZE, MAX_FIELD_SIZE, MIN_FILED_SIZE);
        add(sliderFieldSize);
        // Привязываем слайдер к цифре
        sliderFieldSize.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                int currentFieldSize = sliderFieldSize.getValue();
                txtFieldSize.setText(TXT_FIELD_SIZE + currentFieldSize);
                // Длина победной линии не должна превышать размер карты
                sliderWinningLength.setMaximum(currentFieldSize);
            }
        });

        add(new JLabel("Choose Winning Length"));
        JLabel txtWinnigLength = new JLabel(TXT_WINNING_LENGTH + MIN_WINNING_LENGTH);
        add(txtWinnigLength);
        sliderWinningLength = new JSlider(MIN_WINNING_LENGTH, MAX_WINNING_LENGTH, MIN_WINNING_LENGTH);
        add(sliderWinningLength);
        // Привязываем слайдер к цифре
        sliderWinningLength.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                int currentWinningLength = sliderWinningLength.getValue();
                txtWinnigLength.setText(TXT_WINNING_LENGTH + currentWinningLength);
            }
        });
    }

    private void btnStartGameClick()
    {
        int gameMode;
        if (radioHumanVsAI.isSelected())
        {
            gameMode = GameField.MODE_HUM_VS_AI;
        } else
        {
            gameMode = GameField.MODE_HUM_VS_HUM;
        }

        int fieldSize = sliderFieldSize.getValue();
        int winningLength = sliderWinningLength.getValue();

        gameWindow.startNewGame(gameMode, fieldSize, fieldSize, winningLength);

        setVisible(false);
    }
}
