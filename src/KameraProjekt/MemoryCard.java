package KameraProjekt;

import java.util.ArrayList;

public class MemoryCard {

    public int totalCapacity = 0;
    private int currentCapacity = 0;

    public ArrayList<Picture> memory = new ArrayList<Picture>();


    public MemoryCard(int capacity) {
        this.totalCapacity = capacity;

    }

    public void saveImage(Picture picture) {

        this.memory.add(picture);
    }

    public void printMemoryStatus() {
        for (Picture picture : memory) {
            System.out.println(picture.pictureCode);
        }


    }

    public void checkMemoryStatus()
    {
        if(currentCapacity < totalCapacity)
        {
            System.out.println(currentCapacity + "GB/" + totalCapacity + " GB belegt");
        } else
        {
            System.out.println("Speicher ist voll!");
        }
    }

}
