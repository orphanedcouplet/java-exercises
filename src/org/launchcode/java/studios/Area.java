package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        double radius = input.nextDouble();
        double area = pi * radius * radius;
        String areaStr = Double.toString(area);
        System.out.printf(String.format("The area of the circle is %s", areaStr));
    }
}
