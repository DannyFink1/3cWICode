package at.fda.smartphone.object;

public class Picture {

    protected String pictureCode;
    protected int pictureSize;
    protected String name;
    protected String extension;

    public Picture(String pictureCode, int pictureSize, String name, String extension) {
        this.pictureCode = pictureCode;
        this.pictureSize = pictureSize;
        this.name = name;
        this.extension = extension;
    }

    public String getPictureCode() {
        return pictureCode;
    }

    public int getPictureSize() {
        return pictureSize;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }
}


