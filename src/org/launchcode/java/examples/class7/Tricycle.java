package org.launchcode.java.examples.class7;

public class Tricycle extends Cycle{

    private String color;

    public Tricycle(String color, double x, double y) {
        super(color, x, y);
    }

    public void wheelie() {
        System.out.println("WHEEEEEEEEEEEEEEEEEE!");
    }

}
