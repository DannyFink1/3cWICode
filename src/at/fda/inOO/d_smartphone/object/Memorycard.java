package at.fda.d_smartphone.object;

import java.util.ArrayList;

public class Memorycard {

    private int currentCapacity = 0;
    private int totalCapacity;
    private ArrayList<Picture> memory = new ArrayList<Picture>();

    public Memorycard(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    protected void saveImage(Picture picture) {
        if (currentCapacity <= totalCapacity - picture.pictureSize) {
            this.currentCapacity += picture.pictureSize;
            this.memory.add(picture);
            System.out.println("Foto wurde geschossen");
        } else {
            System.out.println("Speicher ist voll! Foto konnte nicht abgespeichert werden!");
        }
    }
    protected int getFreeSpace(){
        return totalCapacity - currentCapacity;
    }
    protected ArrayList<Picture> getAllFiles() {
        return memory;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public ArrayList<Picture> getMemory() {
        return memory;
    }
}
