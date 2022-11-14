package at.fda.smartphone.object;

import java.util.UUID;

public class Simcard {

    private String simID;
    private int number;

    public Simcard(int number) {
        this.number = number;
        String uuid = UUID.randomUUID().toString();
        this.simID = uuid;
    }

    public void doCall(int callNumber){
        System.out.println("Versucht " + callNumber + " anzurufen...\nFehlgeschlagen");
    }

    public String getSimID() {
        return simID;
    }

    public int getNumber() {
        return number;
    }


}

