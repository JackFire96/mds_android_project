package com.example.catlikeproject.model;

import android.util.Log;

import com.example.catlikeproject.MainActivity;

public class Cat extends CatLike {

    private final String catFoodBrand;

    @Override
    public String toString() {
        return "Cat{" +
                "catFoodBrand='" + catFoodBrand + '\'' +
                '}';
    }

    public String getCatFoodBrand() {
        return catFoodBrand;
    }

    public Cat(String catFoodBrand) {
        this.catFoodBrand = catFoodBrand;
    }

    @Override
    protected void eat() {
        Log.d(MainActivity.TAG, "Eating like a cat");
    }
}
