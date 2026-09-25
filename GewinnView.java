import javax.swing.*;

public class GewinnView extends JFrame {
    GewinnPanel panel;
    public GewinnView(GewinnController c) {
        setTitle("Spiel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);

        panel = new GewinnPanel(c);
        add(panel);

        setVisible(true);
    }
} 