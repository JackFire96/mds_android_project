package com.example.catlikeproject.model;

import android.util.Log;

import com.example.catlikeproject.MainActivity;

public class CatLike {
    public CatLike() {
    }
    protected void eat() {
        Log.d(MainActivity.TAG, "CatLike is eating");
    }
    private String color;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String height;

    @Override
    public String toString() {
        return "CatLike{" +
                "color='" + color + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
