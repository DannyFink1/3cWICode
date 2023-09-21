package at.fda.4cWI.objects;

public class Airliner extends Airplane{
    private String arrivalAt;
    private String departureFrom;

    public Airliner(int tankVolume, String brand, String type, int maxFlightRange, int maxSpeed, int numberOfSeats, float wingspan, String arrivalAt, String departureFrom) {
        super(tankVolume, brand, type, maxFlightRange, maxSpeed, numberOfSeats, wingspan);
        this.arrivalAt = arrivalAt;
        this.departureFrom = departureFrom;
    }

    public void serveCatering(){
        System.out.println("Essen wurde ausgegeben!");
    }

    public String getArrivalAt() {
        return arrivalAt;
    }

    public void setArrivalAt(String arrivalAt) {
        this.arrivalAt = arrivalAt;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public void setDepartureFrom(String departureFrom) {
        this.departureFrom = departureFrom;
    }
}
