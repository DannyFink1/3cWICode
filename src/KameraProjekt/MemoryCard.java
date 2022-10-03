package KameraProjekt;

import java.util.ArrayList;

public class MemoryCard {

    public int capacity;

    public ArrayList<Picture> memory = new ArrayList<Picture>();


    public MemoryCard(int capacity) {
        this.capacity = capacity;

    }

    public void saveImage(Picture picture) {
        this.memory.add(picture);
    }

    public void printMemoryStatus() {
        for (Picture picture : memory) {
            System.out.println(picture.pictureCode);
        }
    }

}
