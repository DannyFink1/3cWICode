package objects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Hangar {
    private int height;
    private int length;
    private int depth;
    private int hangarNumber;
    private Airplane associatedPlane;
    private ArrayList<Runway> associatedRunwayList;
    private String status;
    public Hangar(int height, int length, int depth, int hangarNumber, Airplane associatedPlane) {
        this.height = height;
        this.length = length;
        this.depth = depth;
        this.hangarNumber = hangarNumber;
        this.associatedPlane = associatedPlane;
        this.associatedRunwayList = new ArrayList<>();
        this.status = "closed";
    }

    public void addRunway(Runway r){
        this.associatedRunwayList.add(r);
    }
    public void cleanHangar(){
        System.out.println("Hangar wurde gesäubert");
    }

    public void openHangar(){
        System.out.println("Hangar wurde geöffnet");
        this.status = "open";
    }

    public void closeHangar(){
        System.out.println("Hangar wurde geschlossen");
        this.status = "closed";
    }

    public void addAirplane(Airplane a){
        this.setAssociatedPlane(a);
        System.out.println("Flugzeug wurde zugewiesen");
    }

    public void getAirplane(){
        System.out.println(this.getAssociatedPlane().getBrand());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHangarNumber() {
        return hangarNumber;
    }

    public void setHangarNumber(int hangarNumber) {
        this.hangarNumber = hangarNumber;
    }

    private Airplane getAssociatedPlane() {
        return associatedPlane;
    }

    private void setAssociatedPlane(Airplane associatedPlane) {
        this.associatedPlane = associatedPlane;
    }

    public ArrayList<Runway> getAssociatedRunwayList() {
        return associatedRunwayList;
    }

    public void setAssociatedRunwayList(ArrayList<Runway> associatedRunwayList) {
        this.associatedRunwayList = associatedRunwayList;
    }
}
