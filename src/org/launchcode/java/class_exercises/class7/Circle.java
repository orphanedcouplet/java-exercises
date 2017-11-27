package org.launchcode.java.class_exercises.class7;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        double pi = 3.14159;
        return pi * (radius * radius);
    }
}
