
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class GewinnPanel extends JPanel {
    JLabel l1 = new JLabel("Rundenergebnis:");
    JLabel l2 = new JLabel("Gesamtpunkte:");
    JLabel l3 = new JLabel("Deine Zahl:");
    JLabel l4 = new JLabel("Computer:");

    JTextField out1 = new JTextField();
    JTextField out2 = new JTextField();
    JTextField in1 = new JTextField();
    JTextField in2 = new JTextField();
    
    public GewinnPanel() {
        setLayout(new BorderLayout());
        
        JPanel input = new JPanel(new GridLayout(4, 2));

        input.add(l1);
        input.add(l2);

        input.add(out1);
        input.add(out2);

        input.add(l3);
        input.add(l4);
        
        input.add(in1);
        input.add(in2);

        add(input, BorderLayout.CENTER);
    }
}


