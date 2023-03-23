package at.fda.e_jukeBox;

import java.util.Arrays;

public class Title {
    private String name;
    private String producer;
    private double length;
    private String genre;

    public Title(String name, String producer, double length, String... genre) {
        this.name = name;
        this.producer = producer;
        this.length = length;
        this.genre = Arrays.toString(genre);
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }
}


