package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        // declare/initialize vars
        Scanner inputVar = new Scanner(System.in);
        double miles;
        double gallons;
        double mpg;
        String mpgStr;
        System.out.println("How many miles have you driven?");
        miles = inputVar.nextDouble();
        System.out.println("How much gas (in gallons) have you consumed?");
        gallons = inputVar.nextDouble();
        mpg = miles / gallons;
        mpgStr = Double.toString(mpg);
        System.out.printf("You get %s miles to the gallon%n", mpgStr);
    }
}
