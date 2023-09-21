package at.fda.f_4cWi.objects;

public class Runway {
    private int length;
    private String runwayName;
    private boolean isForLanding;

    public Runway(int length, String runwayName) {
        this.length = length;
        this.runwayName = runwayName;
    }

    public void cleanRunway(){
        System.out.println("Runway wurde gesäubert!");
    }

    public void giveRollingAuthorization(Airplane a){
        System.out.println(a.getBrand() + " darf abheben!");
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRunwayName() {
        return runwayName;
    }

    public void setRunwayName(String runwayName) {
        this.runwayName = runwayName;
    }

    public boolean isForLanding() {
        return isForLanding;
    }

    public void setForLanding(boolean forLanding) {
        isForLanding = forLanding;
    }
}
