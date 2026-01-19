package com.parceltracker;

//class representing each parcel stage node
public class Stage {

    //attributes for Stage
    String name;
    Stage next;

    //constructor for stage node
    public Stage(String name) {
        this.name = name;
        this.next = null;
    }
}
