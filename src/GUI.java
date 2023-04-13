import javax.swing.*;

public class GUI extends JFrame{
    private JPanel mainPanel;
    private JLabel welcome;
    private JButton instructionsButton;
    private JButton startGameButton;

    public GUI() {

        setContentPane(mainPanel);
        setTitle("Test");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
