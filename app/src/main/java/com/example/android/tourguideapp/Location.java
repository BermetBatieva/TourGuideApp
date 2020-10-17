package com.example.android.tourguideapp;

public class Location {
    private String mName;
    private int mImageResourceId;
    private String mNumber = NO_NUMBER_PROVIDED;
    private static final String NO_NUMBER_PROVIDED = null;
    private String mDescription;
    private String mAddress;
    private String mCoordinate;

    public Location(String Name, int ImageResourceId, String Description, String Address, String Number, String Coordinate) {
        mName = Name;
        mImageResourceId = ImageResourceId;
        mDescription = Description;
        mNumber = Number;
        mAddress = Address;
        mCoordinate = Coordinate;
    }

    public Location(String Name, int ImageResourceId, String Description, String Address, String Coordinate) {
        mName = Name;
        mImageResourceId = ImageResourceId;
        mDescription = Description;
        mAddress = Address;
        mCoordinate = Coordinate;
    }

    public String getName() {
        return mName;
    }



    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getNumber() {
        return mNumber;
    }

    public String getCoordinate() {
        return mCoordinate;
    }

    public boolean hasNumber() {
        return mNumber != NO_NUMBER_PROVIDED;
    }
}
