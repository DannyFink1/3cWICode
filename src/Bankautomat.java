
import java.util.Scanner;

public class Bankautomat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int selection;
        float userInput;
        float balance = 1;
        System.out.println("Wählen SIe ihre nächste Aktion aus:");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");

        do {
            selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Wie viel wollen Sie einzahlen? in Euro");
                    userInput = scanner.nextFloat();
                    if (userInput >= 0) {
                        balance += userInput;
                        System.out.println(userInput + "€ wurden zum Kontostand hinzugefügt!");
                    } else {
                        System.out.println("Sie müssen einen positiven Wert eingeben.");
                    }
                    break;

                case 2:
                    System.out.println("Wie viel wollen Sie abheben? in Euro");
                    userInput = scanner.nextFloat();
                    if (userInput <= balance) {
                        balance -= userInput;
                        System.out.println(userInput + "€ wurden von Ihrem Konto abgehoben");
                    } else {
                        System.out.println("Sie müssen einen Wert, kleiner/gleich als ihr Kontostand eingeben");
                    }
                    break;

                case 3:
                    System.out.println("Ihr Kontostand beträgt " + balance + "€");
                    break;

                case 4:
                    System.out.println("Auf Wiedersehen!");
                    break;

                default:
                    System.out.println("Sie müssen einer der Optionen wählen!");
            }

        } while (selection != 4);


    }
}


