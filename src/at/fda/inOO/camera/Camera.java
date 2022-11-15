package at.fda.camera;

import java.util.UUID;

public class Camera {

    private final int resolution;
    private final String color;
    private final float weight;
    private final String modelName;
    private Lens lens;
    private MemoryCard memoryCard;
    private int pictureSize = 2;


    public Camera(int resolution, String color, float weight, String modelName, Lens lens, MemoryCard memoryCard) {
        this.resolution = resolution;
        this.color = color;
        this.weight = weight;
        this.modelName = modelName;
        this.lens = lens;
        this.memoryCard = memoryCard;
    }

    public void takePicture() {

        String pictureCode = UUID.randomUUID().toString();
        Picture picture = new Picture(pictureCode, pictureSize);
        memoryCard.saveImage(picture);
    }

    public void setPictureSize(int pictureSize) {
        this.pictureSize = pictureSize;
    }

    public void clearActualMemoryCard() {

        memoryCard.setCurrentCapacity(0);
    }

    public void checkMemoryStatus() {
        memoryCard.checkMemoryStatus();
    }

    public int getResolution() {
        return resolution;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public String getModelName() {
        return modelName;
    }

    public Lens getLens() {
        return lens;
    }

    public MemoryCard getMemoryCard() {
        return memoryCard;
    }

    public int getPictureSize() {
        return pictureSize;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }
}
