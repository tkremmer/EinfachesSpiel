
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GewinnController implements  ActionListener {
    GewinnView view;
    GewinnModel model;


    public GewinnController() {
        view = new GewinnView(this);
        model = new GewinnModel();

        view.panel.setField(0, "Tippe eine Zahl von 1 bis 9");
        view.panel.setField(1, "Gesamtpunkte: 30");
        view.panel.btn.setEnabled(false);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "nochmal":
                view.panel.setField(0, "Tippe eine Zahl von 1 bis 9");
                view.panel.setField(2, "");
                view.panel.setField(3, "");

                view.panel.fields[0].setForeground(Color.BLACK);
                view.panel.fields[2].setEditable(true);
                view.panel.btn.setEnabled(false);
                break;

            case "enter":
                int spielerZahl = Integer.parseInt(view.panel.getField(2));
                model.berechneRunde(spielerZahl);

                view.panel.setField(0, Integer.toString(model.getRundenErgebnis()));
                view.panel.setField(1, Integer.toString(model.getGesamtPunkte()));
                view.panel.setField(3, Integer.toString(model.getComputerZahl()));

                view.panel.fields[2].setEditable(false);
                view.panel.btn.setEnabled(true);

                if (model.getRundenErgebnis() > 0 && !model.hatVerloren()) { 
                    view.panel.fields[0].setForeground(Color.GREEN);
                } else if (model.getRundenErgebnis() < 0 && !model.hatGewonnen()) {
                    view.panel.fields[0].setForeground(Color.RED);
                } else if(!model.hatGewonnen() && !model.hatVerloren()) {
                    view.panel.fields[0].setForeground(Color.WHITE);
                }

                if (model.hatVerloren()) {
                    view.panel.setField(0,"Verloren");
                    view.panel.fields[2].setEditable(false);
                    view.panel.btn.setEnabled(false);
                }

                 if (model.hatGewonnen()) {
                    view.panel.setField(0,"Gewonnen");
                    view.panel.fields[2].setEditable(false);
                    view.panel.btn.setEnabled(false);
                }


                
                break;
        }
    }

    public static void main(String[] args) {
        new GewinnController();
    }
}