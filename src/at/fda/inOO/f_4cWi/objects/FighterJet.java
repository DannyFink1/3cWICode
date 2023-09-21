package at.fda.f_4cWi.objects;

public class FighterJet extends Airplane{

    private String weapon;
    private int enginePower;

    public FighterJet(int tankVolume, String brand, String type, int maxFlightRange, int maxSpeed, int numberOfSeats, float wingspan, String weapon, int enginePower) {
        super(tankVolume, brand, type, maxFlightRange, maxSpeed, numberOfSeats, wingspan);
        this.weapon = weapon;
        this.enginePower = enginePower;
    }

    public void shoot(){
        System.out.println("pew pew mit " + weapon);
    }

    public void openParachute(){
        System.out.println("Fallschirm geöffnet, das Flugzeug wurde verlassen!");
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}