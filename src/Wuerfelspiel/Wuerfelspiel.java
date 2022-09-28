package Wuerfelspiel;

import java.util.Random;
import java.util.Scanner;


public class Wuerfelspiel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selector;
        int playerTotalResult = 0;
        int computerTotalResult = 0;
        int rollResult = 0;
        int againVar = 0;
        do {
            System.out.println("Willkommen beim Würfelspiel!");
            System.out.println("1. Starten");
            System.out.println("2. Ende");

            selector = scanner.nextInt();

            switch (selector) {
                case 1:
                    System.out.println("Sie haben das Spiel gestartet!");
                    System.out.println("Hier kommen ihre Würfe!");


                    for (int i = 0; i < 6; i++) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        rollResult = Würfel();
                        playerTotalResult += rollResult;
                        System.out.println(rollResult);

                    }
                    System.out.println("Ihr totales Ergebnis lautet: " + playerTotalResult + "\n");
                    System.out.println("Nun würfelt der Computer!");

                    for (int i = 0; i < 6; i++) {

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        rollResult = Würfel();
                        computerTotalResult += rollResult;
                        System.out.println(rollResult);

                    }

                    System.out.println("Der Computer hat insgesamt: " + computerTotalResult + " gewürfelt!");

                    if (playerTotalResult < computerTotalResult)
                        System.out.println("Der Computer hat gewonnen. Schade!");
                    else if (playerTotalResult > computerTotalResult)
                        System.out.println("Sie haben gewonnen! Glückwunsch!");
                    else
                        System.out.println("Sie beide haben genau das gleiche Ergebnis. Unentschieden!");
                    break;
                case 2:
                    System.out.println("Bis zum nächsten Mal!");
                    break;
                default:
                    System.out.println("Bitte wählen Sie eine verfügbare Option aus.");
            }

            System.out.println("Wollen Sie das Spiel nochmal starten? (1. Ja, 2. Nein)");
            againVar = scanner.nextInt();
        } while (againVar != 2);


    }

    static int Würfel() {
        int result;
        Random random = new Random();
        result = random.nextInt(1, 6);

        return result;
    }
}
