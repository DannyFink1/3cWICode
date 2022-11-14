package at.fda.smartphone.object;

import java.util.ArrayList;

public class Memorycard {

    private int currentCapacity = 0;
    private int totalCapacity;
    public ArrayList<Picture> memory = new ArrayList<Picture>();

    public Memorycard(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public void saveImage(Picture picture) {
        if (currentCapacity <= totalCapacity - picture.pictureSize) {
            this.currentCapacity += picture.pictureSize;
            this.memory.add(picture);
            System.out.println("Foto wurde geschossen");
        } else {
            System.out.println("Speicher ist voll! Foto konnte nicht abgespeichert werden!");
        }
    }

    public void printMemoryStatus() {
        System.out.println();
        for (Picture picture : memory) {
            System.out.println(picture.pictureCode);
        }
    }

}
