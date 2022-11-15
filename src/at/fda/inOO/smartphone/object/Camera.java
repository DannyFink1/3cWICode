package at.fda.smartphone.object;

import java.util.UUID;

public class Camera {

    private int resolution;
    private String brand;

    public Camera(int resolution, String brand) {
        this.resolution = resolution;
        this.brand = brand;
    }
    protected Picture makePicture()
    {
        String pictureCode = UUID.randomUUID().toString();
        Picture picture = new Picture(pictureCode, this.resolution, "Picture", "png");
        return picture;
    }
    public int getResolution() {
        return resolution;
    }


}
