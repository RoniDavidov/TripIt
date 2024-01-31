package com.example.tripit;

import android.graphics.Bitmap;

public class Trip
{
    private String name;
    private String tior;
    private Bitmap bitmap;
    private int num;

    public Trip(String name, String tior, Bitmap bitmap, int num) {
        this.bitmap=bitmap;
        this.name=name;
        this.num=num;
        this.tior=tior;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getTior() {
        return tior;
    }

    public void setTior(String tior) {
        this.tior = tior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
