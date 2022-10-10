package KameraProjekt;

import java.util.ArrayList;

public class MemoryCard {

    public int totalCapacity = 0;
    public int currentCapacity = 0;

    public ArrayList<Picture> memory = new ArrayList<Picture>();


    public MemoryCard(int capacity) {
        this.totalCapacity = capacity;
    }

    public void saveImage(Picture picture) {
        if (currentCapacity <= totalCapacity - picture.pictureSize) {
            this.currentCapacity += picture.pictureSize;
            this.memory.add(picture);
            System.out.println("Foto wurde geschossen");
        }
        else {
            System.out.println("Speicher ist voll! Foto konnte nicht abgespeichert werden!");
        }
    }

    public void printMemoryStatus() {
        for (Picture picture : memory) {
            System.out.println(picture.pictureCode);
        }
    }

    public void checkMemoryStatus() {
        System.out.println(currentCapacity + "GB/" + totalCapacity + " GB belegt");
    }

}
