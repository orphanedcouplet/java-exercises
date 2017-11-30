package org.launchcode.java.examples.class7;

public class Cycle extends Vehicle {

    private String color;

    @Override
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public Cycle(String color, double x, double y) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
