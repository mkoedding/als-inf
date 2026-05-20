import java.util.Scanner;

public class Sparplan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ausgangskapital in Euro: ");
        double guthaben = s.nextDouble();

        // Edit: Jährliche Sparrate in Euro

        System.out.print("Zinssatz in Prozent: ");
        double zinssatz = s.nextDouble();

        System.out.print("Sparziel in Euro: ");
        double sparziel = s.nextDouble();

        int jahre = 0;

        // Edit: Ergänzen Sie die Berechnung, um die jährliche Sparrate zu berücksichtigen
        while (guthaben < sparziel) {
            guthaben = guthaben + guthaben * zinssatz / 100;
            jahre = jahre + 1;
        }

        System.out.println("Nach " + jahre + " Jahren ist das Sparziel erreicht.");
        System.out.println("Guthaben: " + guthaben + " Euro");

        s.close();
    }
}
