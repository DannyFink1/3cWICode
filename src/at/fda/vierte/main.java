

import objects.Airplane;
import objects.Hangar;
import objects.Runway;

public class main {

    public static void main(String[] Args){
        Airplane airplane1 = new Airplane(10,"NASA", "3310", 3000, 950, 150, 20);
        Runway runway1 = new Runway(1200, "A13");
        Runway runway2 = new Runway(2000, "R3");
        Hangar hangar1 = new Hangar(30, 300, 400, 7, airplane1);

        hangar1.addRunway(runway1);
        hangar1.addRunway(runway2);

        airplane1.takeoff();
        airplane1.climb(3000);
        airplane1.cruise();
        airplane1.descent();
        airplane1.land();
        System.out.println("Brand des Flugzeuges: "+ airplane1.getBrand());

        hangar1.cleanHangar();
        hangar1.openHangar();
        hangar1.getAirplane();
    }

}
