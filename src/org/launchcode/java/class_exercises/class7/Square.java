package org.launchcode.java.class_exercises.class7;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double findArea() {
        return side * side;
    }
}
