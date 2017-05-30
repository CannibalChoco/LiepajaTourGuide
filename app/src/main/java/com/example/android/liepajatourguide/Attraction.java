package com.example.android.liepajatourguide;

import static android.R.attr.description;
import static android.R.attr.name;

/**
 * Class stores tourism attraction information
 */

public class Attraction {
    private int nameResourceId;
    private int descriptionResourceId;
    int imageResourceId;

    public Attraction (int nameResourceId, int descriptionResourceId, int imageResourceId){
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
}
