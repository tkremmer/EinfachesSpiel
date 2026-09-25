
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class GewinnPanel extends JPanel {

    JTextField[] fields = new JTextField[] {
        new JTextField(),
        new JTextField(),
        new JTextField(),
       new JTextField(),    
    };

    
    public GewinnPanel(GewinnController c) {
        setLayout(new BorderLayout());
        
        JPanel input = new JPanel(new GridLayout(4, 2));

        JButton btn = new JButton("Noch einmal!");
        btn.addActionListener(c);
        btn.setActionCommand("nochmal");

        input.add(new JLabel("Rundenergebnis:"));
        input.add(new JLabel("Gesamtpunkte:"));

        input.add(fields[0]);
        input.add(fields[1]);

        input.add(new JLabel("Deine Zahl:"));
        input.add(new JLabel("Computer:"));
        

        fields[2].addActionListener(c);
        fields[2].setActionCommand("enter");
        input.add(fields[2]);
        input.add(fields[3]);

        add(input, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
    }

    public void setField(int i, String text) {
        if (i >= 0 && i < fields.length) {
            fields[i].setText(text);
        } 
    }

    public String getField(int i) {
        if (i >= 0 && i < fields.length) {
            return fields[i].getText();
        } 
        return null;
    }

    
}


