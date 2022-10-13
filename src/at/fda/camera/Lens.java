package at.fda.camera;

public class Lens {

    private final String manufacturer;
    public int focalLength;

    public Lens(String manufacturer, int focalLength) {
        this.manufacturer = manufacturer;
        this.focalLength = focalLength;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getFocalLength() {
        return focalLength;
    }
}
