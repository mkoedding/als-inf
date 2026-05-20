import java.util.Scanner;

public class Sparplan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ausgangskapital in Euro: ");
        double guthaben = s.nextDouble();

        // TODO: Jährliche Sparrate in Euro einlesen
        System.out.print("Jaehrliche Sparrate in Euro: ");
        double sparrate = s.nextDouble();

        System.out.print("Zinssatz in Prozent: ");
        double zinssatz = s.nextDouble();

        System.out.print("Sparziel in Euro: ");
        double sparziel = s.nextDouble();

        int jahre = 0;

        // TODO: Ergänzen Sie die Berechnung, um die jährliche Sparrate zu berücksichtigen
        while (guthaben < sparziel) {
            guthaben = guthaben + sparrate;
            guthaben = guthaben + guthaben * zinssatz / 100;
            jahre = jahre + 1;
        }

        System.out.println("Nach " + jahre + " Jahren ist das Sparziel erreicht.");
        System.out.println("Guthaben: " + guthaben + " Euro");

        s.close();
    }
}
