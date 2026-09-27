
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class GewinnPanel extends JPanel {

    JTextField[] fields = new JTextField[] {
        new JTextField(),
        new JTextField(),
        new JTextField(),
       new JTextField(),    
    };

    JButton btn = new JButton("Noch einmal!");


    
    public GewinnPanel(GewinnController c) {
        setLayout(new BorderLayout());
        
        JPanel input = new JPanel(new GridLayout(4, 2));

        btn.addActionListener(c);
        btn.setActionCommand("nochmal");

        input.add(new JLabel("Rundenergebnis:"));
        input.add(new JLabel("Gesamtpunkte:"));

        input.add(fields[0]);
        input.add(fields[1]);

        input.add(new JLabel("Deine Zahl:"));
        input.add(new JLabel("Computer:"));
        

        for (JTextField f : fields) {
            f.setEditable(false);
            f.setForeground(Color.GRAY);
            f.setFont(new Font("Arial", Font.BOLD, 20));
        }
        fields[2].setEditable(true);
        fields[2].addActionListener(c);
        fields[2].setActionCommand("enter");
        input.add(fields[2]);
        input.add(fields[3]);

        add(input, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnPanel.add(btn);

        add(btnPanel, BorderLayout.SOUTH);
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


