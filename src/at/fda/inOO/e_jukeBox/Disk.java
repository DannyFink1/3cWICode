package at.fda.e_jukeBox;

import java.util.ArrayList;
import java.util.List;

public class Disk {
    private String diskTitle;
    private List<Title> titleList;
    private double diskLength;

    public Disk(String diskTitle) {
        this.diskTitle = diskTitle;
        this.titleList = new ArrayList<>();
    }

    public void addTitleToList(Title title){
        this.titleList.add(title);
        this.diskLength = getDiskLength() + title.getLength();
    }

    public void addTitleToList(List<Title> titleList){
        this.titleList.addAll(titleList);
    }
    public String getDiskTitle() {
        return diskTitle;
    }

    public List<Title> getTitleList() {
        return titleList;
    }

    public double getDiskLength() {
        return diskLength;
    }
}
