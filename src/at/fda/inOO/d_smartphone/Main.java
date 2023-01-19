package at.fda.d_smartphone;
import at.fda.d_smartphone.object.*;

public class Main {


    public static void main(String[] args) {

        Camera camera = new Camera(3, "Fortnite");
        Simcard simcard = new Simcard(06604034355);
        Memorycard memorycard = new Memorycard(128);
        Phone phone1 = new Phone(camera, simcard, memorycard, "green");
        System.out.println(phone1.getColor());
        phone1.makeCall(233443);
        phone1.takePicture();
        Camera camera2 = new Camera(20,"Sieben");

        phone1.changeCamera(camera2);
        phone1.printAllFiles();

    }
}
