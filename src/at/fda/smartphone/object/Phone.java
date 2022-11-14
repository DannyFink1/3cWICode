package at.fda.smartphone.object;



import java.util.UUID;

public class Phone {
    private Camera camera;
    private Simcard simcard;
    private Memorycard memorycard;
    private String color;


    public Phone(Camera camera, Simcard simcard, Memorycard memorycard, String color) {
        this.camera = camera;
        this.simcard = simcard;
        this.memorycard = memorycard;
        this.color = color;
    }

    public void takePicture() {

        String pictureCode = UUID.randomUUID().toString();
        Picture picture = new Picture(pictureCode, camera.getResolution());
        memorycard.saveImage(picture);
    }

    public void makeCall(int callNumber){
        simcard.doCall(callNumber);
    }

    public String getColor() {
        return color;
    }

    public void changeCamera(Camera camera) {
        this.camera = camera;
    }

    public void changeSimcard(Simcard simcard) {
        this.simcard = simcard;
    }

    public void changeMemorycard(Memorycard memorycard) {
        this.memorycard = memorycard;
    }

    public void checkMemoryStatus(){
        memorycard.printMemoryStatus();
    }
}
