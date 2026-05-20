import java.util.Scanner;

public class Bankenvergleich {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ausgangskapital in Euro: ");
        double ausgangskapital = s.nextDouble();

        System.out.print("Sparziel in Euro: ");
        double sparziel = s.nextDouble();

        double guthabenA = ausgangskapital;
        double guthabenB = ausgangskapital;
        int jahreA = 0;
        int jahreB = 0;

        // TODO: Berechnen Sie fuer beide Banken die Anzahl der Jahre bis zum Sparziel

        System.out.println("Bank A erreicht das Sparziel nach " + jahreA + " Jahren.");
        System.out.println("Bank B erreicht das Sparziel nach " + jahreB + " Jahren.");

        // TODO: Ausgabe anpassen
        System.out.println("Bank B ist " +  + " Jahre schneller als Bank A.");

        s.close();
    }
}
