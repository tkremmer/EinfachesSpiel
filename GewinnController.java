
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

    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "nochmal":
                break;

            case "enter":
                int spielerZahl = Integer.parseInt(view.panel.getField(2));
                model.berechneRunde(spielerZahl);

                view.panel.setField(0, Integer.toString(model.getRundenErgebnis()));
                view.panel.setField(1, Integer.toString(model.getGesamtPunkte()));
                view.panel.setField(3, Integer.toString(model.getComputerZahl()));
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        new GewinnController();
    }
}