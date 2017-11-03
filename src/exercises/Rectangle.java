package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // declare variables
        Scanner input;
        double length;
        double width;
        double area;
        // assign input var
        input = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        length = input.nextDouble();
        System.out.println("Enter width of rectangle");
        width = input.nextDouble();
        area = length * width;
        System.out.println(area);
    }
}
