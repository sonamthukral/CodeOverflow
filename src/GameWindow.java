import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameWindow extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton greenButton;
    private JButton blueButton;
    private JButton redButton;
    private JButton greyButton;
    private JLabel trashItem;
    private JLabel score;
    private BinSort binSort;
    private int itemsCycled;
    private ArrayList<Item> randItems;

    public GameWindow() {
        binSort = new BinSort();

        setContentPane(mainPanel);
        setTitle("GameWin");
        setSize(1300, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        greyButton.addActionListener(this);

        randItems = binSort.getListOfRandItems();
        itemsCycled = 0;

        trashItem.setText((itemsCycled + 1) + ". " + randItems.get(itemsCycled).toString());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        JButton b = (JButton) source;
        String selectedColor = b.getText().toLowerCase();

        if (itemsCycled == 9) {

            binSort.checkInput(randItems.get(itemsCycled), selectedColor);
            score.setText("Score: " + binSort.getScore());
            itemsCycled++;

            trashItem.setText("done");
        } else if (itemsCycled < 9) {

            binSort.checkInput(randItems.get(itemsCycled), selectedColor);
            score.setText("Score: " + binSort.getScore());

            itemsCycled++;

            Item trash = randItems.get(itemsCycled);

            trashItem.setText((itemsCycled + 1) + ". " + trash.toString() + "    " + trash.getBinColor());
        } else {

        }


    }
}
