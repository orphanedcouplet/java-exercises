package org.launchcode.java.examples.class5;

public class Car {

    // color, year, model, lightStatus
    private String color;
    private final String model;
    private final int year;
    private boolean lightStatus;
    private int mileage;

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
        // when a car is created, the lights are off
        this.lightStatus = false;
        // when a car is created, it has a mileage of 0
        this.mileage = 0;
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
        year = 2017;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public boolean isLightStatus() {
        return this.lightStatus;
    }

    public void setLightStatus(boolean lightStatus) {
        this.lightStatus = lightStatus;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return this.year;
    }

    public int getMileage() {
        return mileage;
    }

    public int drive(int newMiles) {
        if (newMiles < 0) {
            throw new IllegalArgumentException("Uh, you can't do that");
        }
        mileage += newMiles;
        return mileage;
    }
}
