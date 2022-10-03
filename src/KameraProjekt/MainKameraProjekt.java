package KameraProjekt;

public class MainKameraProjekt {

    public static void main(String[] args)
    {
        Lens lens = new Lens("Sony", 50);
        MemoryCard memoryCard1 = new MemoryCard(16);

        Camera camera = new Camera(1080, "black", 2,"Focus Ultra", lens, memoryCard1);
        camera.takePicture();
        camera.takePicture();
        camera.takePicture();
        camera.memoryCard.printMemoryStatus();


    }


}
