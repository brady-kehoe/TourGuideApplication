package com.example.android.tourguideapplication;

public class Location {

    private String locationTitle;

    private String locationDescription;

    private int locationImageId;


    public Location(String title, String description, int imageId) {
        locationTitle = title;
        locationDescription = description;
        locationImageId = imageId;
    }


    public String getLocationTitle() {
        return locationTitle;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public int getLocationImageId() {
        return locationImageId;
    }
}