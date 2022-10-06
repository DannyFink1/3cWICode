package KameraProjekt;

import java.util.Scanner;

public class MainKameraProjekt {

    public static void main(String[] args)
    {

        //Var init
        Scanner scanner = new Scanner(System.in);
        int selection;
        int inputForCreationOfObject;

        //Program
        System.out.println("Sie müssen zuerst eine Kamera erstellen!");
        System.out.println("Sie müssen zuerst ein Objektiv erstellen!");
        System.out.println("Sie müssen zuerst eine SD-Karte erstellen!\n");

        //MemoryCard init
        System.out.println("SD-Karte erstellen\n");
        System.out.println("Geben Sie bitte die Kapazität der Speicherkarte ein (GB)");
        MemoryCard memoryCard = new MemoryCard(scanner.nextInt());

        //Lens init
        System.out.println("\n\nObjektiv erstellen\n");
        System.out.println("Geben Sie bitte folgende Werte für das Objektiv ein\nHersteller\nBrennweite(mm)");
        Lens lens = new Lens(scanner.next(), scanner.nextInt());

        //Cam init
        System.out.println("\n\nKamera erstellen\n");
        System.out.println("Geben Sie bitte folgende Werte für die Kamera ein\nAuflösung(p)\nFarbe\nGewicht(g)\nModellname");
        Camera camera = new Camera(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next(), lens, memoryCard);

        System.out.println("\n\nVielen Dank für ihre Eingabe!");

        System.out.println("\n\n\nWas wollen Sie nun machen?");
        System.out.println("1.Foto schiessen");
        System.out.println("2.SD-Karte Status");
        System.out.println("3.Einstellungen");
        System.out.println("4.Hardware aendern (Bald)");
        System.out.println("5.Beenden");
        selection = scanner.nextInt();

        switch(selection)
        {
            case 1:
                camera.takePicture();
                System.out.println("Foto wurde geschossen!");
                break;

            case 2:
                camera.checkMemoryStatus();
                break;
            case 3:
                //Settings in Progress
                break;
            case 4:
                //change Hardware in Progress
            case 5:
                System.out.println("Bis Baldrian!");
                break;
        }
    }


}



//MAIN AUSWAHLEN

//BILD SCHIEßEN
//SETTINGS
    //AUFLÖSUNG BILD
//HARDWARE AENDERN
    //NEUE HARDWARE ERSTELLEN
//BEENDEN