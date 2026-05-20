import java.util.Scanner;

public class Bakterien {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Startanzahl der Bakterien: ");
        int bakterien = s.nextInt();

        int stunden = 0;

        // TODO: Berechnen Sie, nach wie vielen Stunden die Million ueberschritten wurde

        System.out.println("Nach " + stunden + " Stunden wurde die Million ueberschritten.");
        System.out.println("Anzahl der Bakterien: " + bakterien);

        s.close();
    }
}
