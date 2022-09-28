package CarProjekt;

import java.util.Scanner;

public class MainCar {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car("blue", 0.04, "12400");

        System.out.println("Geben Sie Gas! (km/h)");
        car1.speedUp(scanner.nextInt());
        System.out.println("Sie fahren nun " + car1.speed + " km/h");

        System.out.println("Bremse! (km/h)");
        car1.slowDown(scanner.nextInt());
        System.out.println("Sie fahren nun " + car1.speed + " km/h");

    }


}
