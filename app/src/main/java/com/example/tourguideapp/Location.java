package com.example.tourguideapp;

/**
 * {@link Location} represents info about attraction location.
 * It contains name of location and its photo.
 */

public class Location {
    private String mLocation;
    private int mImageResourceId;

    /**
     * Create a new {@link Location} object.
     * @param locationName is the name of an attraction location.
     * @param imageResourceID is the photo of an attraction location.
     */

    public Location(String locationName, int imageResourceID) {
        this.mLocation = locationName;
        this.mImageResourceId = imageResourceID;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
