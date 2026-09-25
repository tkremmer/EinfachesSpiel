import java.awt.*;
import javax.swing.*;

/**
 * GewinnViewPanel
 */
public class GewinnViewPanel extends JPanel {
    private JLabel ergebnisLabel  = new JLabel("Rundenergebnis:");
    private JLabel meineZahlLabel = new JLabel("Deine Zahl:");
    private JLabel gesamtPunkteLabel = new JLabel("Gesamtpunkte:");
    private JLabel computerZahlLabel = new JLabel("Computer:");

    private  JTextField ergebnisField = new JTextField();
    private  JTextField spielerField = new JTextField();
    private  JTextField gesamtPunkteField = new JTextField();
    private  JTextField computerField = new JTextField();
    
     private JButton btn = new JButton("Noch einmal!");

    public GewinnViewPanel() {
        setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        inputPanel.add(ergebnisLabel);
        inputPanel.add(gesamtPunkteLabel);

        inputPanel.add(ergebnisField);
        inputPanel.add(gesamtPunkteField);

        inputPanel.add(meineZahlLabel);
        inputPanel.add(computerZahlLabel);

        inputPanel.add(spielerField);
        inputPanel.add(computerField);

        add(inputPanel);
        add(btn, BorderLayout.SOUTH);
    }
}