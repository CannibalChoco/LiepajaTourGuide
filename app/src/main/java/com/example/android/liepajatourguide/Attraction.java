package com.example.android.liepajatourguide;

/**
 * Class stores tourism attraction information
 */

public class Attraction {

    private int nameResourceId;
    private int descriptionResourceId;
    private int imageResourceId;

    public Attraction(int nameResourceId, int descriptionResourceId, int imageResourceId) {
        this.nameResourceId = nameResourceId;
        this.descriptionResourceId = descriptionResourceId;
        this.imageResourceId = imageResourceId;
    }

    public int getNameResourceId() {
        return nameResourceId;
    }

    public int getDescriptionResourceId() {
        return descriptionResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "nameResourceId=" + nameResourceId +
                ", descriptionResourceId=" + descriptionResourceId +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
