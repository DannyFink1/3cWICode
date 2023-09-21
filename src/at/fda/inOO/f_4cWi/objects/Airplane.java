package at.fda.f_4cWi.objects;

public class Airplane {
    protected int tankVolume;
    protected String brand;
    protected String type;
    protected int maxFlightRange;
    protected int maxSpeed;
    protected int numberOfSeats;
    protected float wingspan;
    protected String status;

    public Airplane(int tankVolume, String brand, String type, int maxFlightRange, int maxSpeed, int numberOfSeats, float wingspan) {
        this.tankVolume = tankVolume;
        this.brand = brand;
        this.type = type;
        this.maxFlightRange = maxFlightRange;
        this.maxSpeed = maxSpeed;
        this.numberOfSeats = numberOfSeats;
        this.wingspan = wingspan;
        this.status = "landed";
    }

    public void takeoff(){
        System.out.println("Das Flugzeug hebt ab!");
        this.status = "takeoff";
    }

    public void climb(int height){
        System.out.println("Das Flugzeug steigt auf " + height + " m.");
        this.status = "climbing";
    }

    public void cruise(){
        System.out.println("Das Flugzeug fliegt nun auf Reisehöhe.");
        this.status = "cruise";
    }

    public void descent(){
        System.out.println("Das Flugzeug beginnt den Sinkflug.");
        this.status = "descent";
    }

    public void land(){
        System.out.println("Das Flugzeug ist erfolgreich gelandet!");
        this.status = "landed";
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxFlightRange() {
        return maxFlightRange;
    }

    public void setMaxFlightRange(int maxFlightRange) {
        this.maxFlightRange = maxFlightRange;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }
}
