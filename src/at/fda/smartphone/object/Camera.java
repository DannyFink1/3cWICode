package at.fda.smartphone.object;

public class Camera {

    private int resolution;
    private String brand;

    public Camera(int resolution, String brand) {
        this.resolution = resolution;
        this.brand = brand;
    }

    public int getResolution() {
        return resolution;
    }

    public Camera(String brand) {
        this.brand = brand;
    }
}
