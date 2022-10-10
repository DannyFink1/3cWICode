package KameraProjekt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        int randomNumber;


        randomNumber = 233423;
        //Var init
        Scanner scanner = new Scanner(System.in);
        int selection;
        int inputForCreationOfObject;
        int selectorForMemoryCard = 0;
        int selectorForLens = 0;
        int selectorForCamera = 0;

        ArrayList<MemoryCard> arrayMemoryCard = new ArrayList<MemoryCard>();
        ArrayList<Lens> arrayLens = new ArrayList<Lens>();
        ArrayList<Camera> arrayCamera = new ArrayList<Camera>();

        //Program
        System.out.println("Sie müssen zuerst eine Kamera erstellen!");
        System.out.println("Sie müssen zuerst ein Objektiv erstellen!");
        System.out.println("Sie müssen zuerst eine SD-Karte erstellen!\n");

        //MemoryCard init
        System.out.println("SD-Karte erstellen\n");
        System.out.println("Geben Sie bitte die Kapazität der Speicherkarte ein (GB)");
        MemoryCard memoryCard = new MemoryCard(scanner.nextInt());
        arrayMemoryCard.add(memoryCard);

        //Lens init
        System.out.println("\n\nObjektiv erstellen\n");
        System.out.println("Geben Sie bitte folgende Werte für das Objektiv ein\nHersteller\nBrennweite(mm)");
        Lens lens = new Lens(scanner.next(), scanner.nextInt());
        arrayLens.add(lens);
        //Cam init
        System.out.println("\n\nKamera erstellen\n");
        System.out.println("Geben Sie bitte folgende Werte für die Kamera ein\nAuflösung(p)\nFarbe\nGewicht(g)\nModellname");
        Camera camera = new Camera(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next(), lens, memoryCard);
        arrayCamera.add(camera);
        System.out.println("\n\nVielen Dank für ihre Eingabe!");


        do {
            System.out.println("\n\n\nWas wollen Sie nun machen?");
            System.out.println("1.Foto schiessen");
            System.out.println("2.SD-Karte Status");
            System.out.println("3.Einstellungen");
            System.out.println("4.Hardware aendern (Bald)");
            System.out.println("5.Beenden");
            selection = scanner.nextInt();

            switch (selection) {
                case 1:

                    arrayCamera.get(selectorForCamera).takePicture();
                    break;
                case 2:
                    arrayCamera.get(selectorForCamera).checkMemoryStatus();
                    break;
                case 3:
                    System.out.println("\n\n1. Foto-Auflösung (GB Größe) ändern \n2. derzeitige SD-Karte löschen");
                    selection = scanner.nextInt();

                    if (selection == 1) {
                        System.out.println("\n\n1. 2GB (klein) \n2. 4GB (mittel) \n3. 6GB (groß)");
                        selection = scanner.nextInt();
                        if (selection == 1) {
                            arrayCamera.get(selectorForCamera).changePictureSize(2);
                            System.out.println("Auflösung geändert!");
                        } else if (selection == 2) {
                            arrayCamera.get(selectorForCamera).changePictureSize(4);
                            System.out.println("Auflösung geändert!");
                        } else if (selection == 3) {
                            arrayCamera.get(selectorForCamera).changePictureSize(6);
                            System.out.println("Auflösung geändert!");
                        } else {
                            System.out.println("Auflösung ändern gescheitert!");
                        }
                    } else if (selection == 2) {
                        arrayCamera.get(selectorForCamera).clearActualMemoryCard();
                        System.out.println("Speicher wurde gelöscht!");
                    } else {
                        System.out.println("Auswahl gescheitert!");
                    }
                    break;
                case 4:
                    System.out.println("\n\n1. neue Hardware erstellen \n2. Hardware austauschen");
                    selection = scanner.nextInt();
                    //neue Hardware erstellen
                    //bestehende Hardware ändern
                case 5:
                    System.out.println("Bis Baldrian!");
                    break;
            }
        } while (selection != 5);


    }
}


//MAIN AUSWAHLEN

//BILD SCHIEßEN
//SETTINGS
//AUFLÖSUNG BILD
//HARDWARE AENDERN
//NEUE HARDWARE ERSTELLEN
//BEENDEN