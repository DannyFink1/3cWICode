package at.fda.smartphone.object;



import java.util.ArrayList;
import java.util.UUID;

public class Phone {
    private Camera camera;
    private Simcard simcard;
    private Memorycard memorycard;
    private String color;
    private String password;
    private boolean adminStatus;


    public Phone(Camera camera, Simcard simcard, Memorycard memorycard, String color) {
        this.camera = camera;
        this.simcard = simcard;
        this.memorycard = memorycard;
        this.color = color;
        this.password = "admin123";
        this.adminStatus = false;
    }

    public void takePicture() {

        memorycard.saveImage(camera.makePicture());
    }
    public void makeCall(int callNumber){

        simcard.doCall(callNumber);
    }
    public void printAllFiles(){
        for (Picture picture : memorycard.getAllFiles()) {
            System.out.println(picture.getName() + " - " + picture.getPictureCode() + " - " + picture.getExtension());
        }
    }

    public void logInToAdmin(String password){
        if(password == this.password){
            System.out.println("Successfully logged in!");
            this.adminStatus = true;
        }
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

    public String getFreeSpace(){

        return "Es sind noch " + memorycard.getFreeSpace() + " GB übrig!";
    }
    public String getColor() {
        return color;
    }

    public Camera getCamera() {
        return camera;
    }

    public Simcard getSimcard() {
        return simcard;
    }

    public Memorycard getMemorycard() {
        return memorycard;
    }

    public String getPassword() {
        return password;
    }

    public boolean getAdminStatus() {
        return adminStatus;
    }

}
