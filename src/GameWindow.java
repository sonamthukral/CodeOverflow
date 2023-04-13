import javax.swing.*;

public class GameWindow extends JFrame {
    private JPanel mainPanel;
    private JButton greenButton;
    private JButton blueButton;
    private JButton redButton;
    private JButton greyButton;

    public GameWindow() {

        setContentPane(mainPanel);
        setTitle("GameWin");
        setSize(1160, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
