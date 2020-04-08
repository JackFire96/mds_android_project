package com.example.javatraining.model;

public class Bicycle extends Vehicle {
    @Override
    public String toString() {
        return "Bicycle{" +
                "color='" + color + '\'' +
                ", frontWheel=" + frontWheel +
                ", backWheel=" + backWheel +
                '}';
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Wheel frontWheel;
    private Wheel backWheel;
    //Default constructor
    public Bicycle() {

    }

    @Override
    void goForward() {
        System.out.println("Vehicle go forward");
    }
    public Bicycle(Wheel frontWheel, Wheel backWheel) {
        this.frontWheel = frontWheel;
        this.backWheel = backWheel;
    }
    public Bicycle(String color, Wheel frontWheel, Wheel backWheel) {
        this.color = color;
        this.frontWheel = frontWheel;
        this.backWheel = backWheel;
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public void setBackWheel(Wheel backWheel) {
        this.backWheel = backWheel;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = frontWheel;
    }
}
