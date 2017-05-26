package com.example.android.liepajatourguide;

import static android.R.attr.description;
import static android.R.attr.name;

/**
 * Class stores tourism attraction information
 */

public class Attraction {
    private String name;
    private String description;


    public Attraction (String name, String description){
        this.name = name;
        this.description = description;
    }


    public String getName(){
        return name;}

    public String getDescription(){
        return description;}

}
