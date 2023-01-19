package at.fda.c_carStopped;

public class Car {

    public String color;
    public double fuelConsumption;
    public String serialNumber;
    public int speed;

    public Car(String color, double fuelConsumption, String serialNumber) {

        this.color = color;
        this.fuelConsumption = fuelConsumption;
        this.serialNumber = serialNumber;

    }


    public void speedUp(int amount) {
        this.speed += amount;
    }

    public void slowDown(int amount) {
        this.speed -= amount;
    }

}
