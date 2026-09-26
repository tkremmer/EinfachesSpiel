
import java.util.Random;

public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {
        gesamtPunkte = 30;
    }
            
    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

     public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berechneComputerZahl() {
        Random rand = new Random();
        computerZahl = rand.nextInt(1, 10);
    }

    public void berechneRunde(int spielerZahl) {
        rundenErgebnis = 0;
        berechneComputerZahl();
        if  (spielerZahl == computerZahl) {
            rundenErgebnis += 20;
        } else if (spielerZahl == computerZahl +1 || spielerZahl == computerZahl -1) {
            rundenErgebnis += 5; 
        } else {
            rundenErgebnis -= 10;
        }
        gesamtPunkte += rundenErgebnis;
    }   

    public boolean hatGewonnen() {
        if (gesamtPunkte >= 100)  return true;
        return false;
    }

    public boolean hatVerloren() {
        if (gesamtPunkte <= 0) return true;
        return false;
    }
}