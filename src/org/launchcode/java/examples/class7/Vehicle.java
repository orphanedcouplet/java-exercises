package org.launchcode.java.examples.class7;

public abstract class Vehicle {

    private double x, y;

    public abstract void move(double dx, double dy);

    public Vehicle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
