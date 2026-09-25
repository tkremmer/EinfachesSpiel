import javax.swing.*;

public class GewinnView extends JFrame {
    public GewinnView() {
        setTitle("Spiel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);

        GewinnPanel panel = new GewinnPanel();
        add(panel);

        setVisible(true);
    }
} 