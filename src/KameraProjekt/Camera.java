package KameraProjekt;

import java.util.UUID;

public class Camera {

    public int resolution;
    public String color;
    public float weight;
    public String modelName;
    public Lens lens;
    public MemoryCard memoryCard;
    //Manufacturer missing
    private int pictureSize = 2;



    public Camera(int resolution, String color, float weight, String modelName, Lens lens, MemoryCard memoryCard)
    {
        this.resolution = resolution;
        this.color = color;
        this.weight = weight;
        this.modelName = modelName;
        this.lens = lens;
        this.memoryCard = memoryCard;
    }

    public void takePicture()
    {

        String pictureCode = UUID.randomUUID().toString();
        Picture picture = new Picture(pictureCode, pictureSize);
        memoryCard.saveImage(picture);
    }

    public void checkMemoryStatus()
    {
        memoryCard.checkMemoryStatus();
    }

    public void changePictureSize(int pictureSize)
    {

        this.pictureSize = pictureSize;
    }

    public void clearActualMemoryCard()
    {
        memoryCard.currentCapacity = 0;
    }
}
