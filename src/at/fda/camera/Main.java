package at.fda.camera;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Var init
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerLine = new Scanner(System.in);
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
        System.out.println("Geben Sie bitte die Kapazität der Speicherkarte ein (GB):");
        MemoryCard memoryCard = new MemoryCard(scannerInt.nextInt());
        arrayMemoryCard.add(memoryCard);

        //Lens init
        System.out.println("\n\nObjektiv erstellen\n");
        System.out.println("Geben Sie bitte folgende Werte für das Objektiv in dieser Reihenfolge ein\n1. Hersteller\n2. Brennweite(mm)");
        Lens lens = new Lens(scannerLine.nextLine(), scannerInt.nextInt());
        arrayLens.add(lens);
        //Cam init
        System.out.println("\n\nKamera erstellen\n");
        System.out.println("\n\nGeben Sie bitte folgende Werte für die Kamera in dieser Reihenfolge ein:\n1. Auflösung(p)\n2. Farbe\n3. Gewicht(g)\n4. Modellname");
        Camera camera = new Camera(scannerInt.nextInt(), scannerLine.nextLine(), scannerInt.nextInt(), scannerLine.nextLine(), lens, memoryCard);
        arrayCamera.add(camera);
        System.out.println("\n\nVielen Dank für ihre Eingabe!");


        do {
            System.out.println("\n\n\nWas wollen Sie nun machen?");
            System.out.println("1.Foto schiessen");
            System.out.println("2.SD-Karte Status");
            System.out.println("3.Einstellungen");
            System.out.println("4.Hardware aendern");
            System.out.println("5.Beenden");
            selection = scannerInt.nextInt();

            switch (selection) {
                case 1:

                    arrayCamera.get(selectorForCamera).takePicture();
                    break;
                case 2:
                    arrayCamera.get(selectorForCamera).checkMemoryStatus();
                    break;
                case 3:
                    System.out.println("\n\n1. Foto-Auflösung (GB Größe) ändern \n2. derzeitige SD-Karte löschen");
                    selection = scannerInt.nextInt();

                    if (selection == 1) {
                        System.out.println("\n\n1. 2GB (klein) \n2. 4GB (mittel) \n3. 6GB (groß)");
                        selection = scannerInt.nextInt();
                        if (selection == 1) {
                            arrayCamera.get(selectorForCamera).setPictureSize(2);
                            System.out.println("Auflösung geändert!");
                        } else if (selection == 2) {
                            arrayCamera.get(selectorForCamera).setPictureSize(4);
                            System.out.println("Auflösung geändert!");
                        } else if (selection == 3) {
                            arrayCamera.get(selectorForCamera).setPictureSize(6);
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
                    selection = scannerInt.nextInt();
                    if (selection == 1) {

                        System.out.println("\n\n1. Kamera erstellen \n2. Objektiv erstellen \n3. Speicherkarte erstellen");
                        selection = scannerInt.nextInt();
                        if (selection == 1) {
                            System.out.println("\n\nGeben Sie bitte folgende Werte für die Kamera in dieser Reihenfolge ein:\n1. Auflösung(p)\n2. Farbe\n3. Gewicht(g)\n4. Modellname");
                            arrayCamera.add(new Camera(scannerInt.nextInt(), scannerLine.nextLine(), scannerInt.nextInt(), scannerLine.nextLine(), lens, memoryCard));
                            System.out.println("Kamera erstellt!");
                        } else if (selection == 2) {
                            System.out.println("\n\nGeben Sie bitte folgende Werte für das Objektiv in dieser Reihenfolge ein\n1. Hersteller\n2. Brennweite(mm)");
                            arrayLens.add(new Lens(scannerLine.nextLine(), scannerInt.nextInt()));
                            System.out.println("Objektiv erstellt!");
                        } else if (selection == 3) {
                            System.out.println("Geben Sie bitte die Kapazität der Speicherkarte ein (GB):");
                            arrayMemoryCard.add(new MemoryCard(scannerInt.nextInt()));
                        } else {
                            System.out.println("Eingabe fehlgeschlagen");
                        }

                    } else if (selection == 2) {
                        System.out.println("\n\n1. Kamera aendern \n2. Objektiv aendern \n3. Speicherkarte aendern");
                        selection = scannerInt.nextInt();
                        if (selection == 1) {
                            System.out.println("\n\nWaehlen Sie die neue Kamera aus:\n");
                            for (int i = 0; i < arrayCamera.size(); i++) {
                                System.out.println(i + ". " + arrayCamera.get(i).getModelName());
                            }
                            selectorForCamera = scannerInt.nextInt();
                            System.out.println("Kamera wurde geaendert");
                        } else if (selection == 2) {
                            System.out.println("\n\nWaehlen Sie das neue Objektiv aus:\n");
                            for (int i = 0; i < arrayLens.size(); i++) {
                                System.out.println(i + ". " + arrayLens.get(i).getManufacturer());
                            }
                            selectorForLens = scannerInt.nextInt();
                            arrayCamera.get(selectorForMemoryCard).setLens(arrayLens.get(selectorForLens));
                            System.out.println("Objektiv wurde geaendert");
                        } else if (selection == 3) {
                            System.out.println("\n\nWaehlen Sie die neue Speicherkarte aus:\n");
                            for (int i = 0; i < arrayMemoryCard.size(); i++) {
                                System.out.println(i + ". " + arrayMemoryCard.get(i).getCurrentCapacity() + "/" + arrayMemoryCard.get(i).getTotalCapacity());
                            }
                            selectorForMemoryCard = scannerInt.nextInt();
                            arrayCamera.get(selectorForCamera).setMemoryCard(arrayMemoryCard.get(selectorForMemoryCard));
                            System.out.println("Speicherkarte wurde geaendert");
                        } else {
                            System.out.println("Eingabe fehlgeschlagen");
                        }
                    } else {
                        System.out.println("Eingabe fehlgeschlagen!");
                    }

                    break;
                case 5:
                    System.out.println("Bis Baldrian!");
                    break;
            }
        } while (selection != 5);


    }
}
