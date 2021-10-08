package com.example.android.quakereport;

public class Earthquake {
    private Double mMagnitude;
    private String mLocation;
    private Long mTimeInMilliSec;
    private String mUrl;

    public Earthquake(Double magnitude, String location, Long timeInMilliSec, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliSec = timeInMilliSec;
        mUrl = url;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliSec() {
        return mTimeInMilliSec;
    }

    public String getUrl() {
        return mUrl;
    }
}
