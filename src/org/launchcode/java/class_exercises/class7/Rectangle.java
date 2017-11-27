package org.launchcode.java.class_exercises.class7;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double findArea() {
        return height * width;
    }
}
