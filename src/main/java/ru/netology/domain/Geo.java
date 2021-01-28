package ru.netology.domain;

public class Geo {
    private String type;
    private int coordinates;
    private Place place;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }
}
