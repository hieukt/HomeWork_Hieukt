package com.example.lenovo_pc.gridview;

/**
 * Created by Lenovo-PC on 2/7/2018.
 */

public class Country {
    private int mId;
    private String mName;

    public Country(int mId, String mName) {
        this.mId = mId;
        this.mName = mName;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
