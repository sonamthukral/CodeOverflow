import javax.swing.*;

public class GameWindow extends JFrame{

    private JPanel mainPanel;

    public GameWindow() {

        setContentPane(mainPanel);
        setTitle("GameWin");
        setSize(1160, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
