package org.launchcode.java.examples;

public class Main {

    public static void main(String[] args) {
        Car betsy = new Car("Pink", "Smart Car", 2050);
        System.out.println(betsy.getMileage());
        betsy.drive(-1234567890);
        System.out.println(betsy.getMileage());
    }
}
