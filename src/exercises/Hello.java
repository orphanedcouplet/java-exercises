package exercises;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // declare variables
        Scanner input;
        String firstName;
        // assign variable as input
        input = new Scanner(System.in);
        System.out.println("Enter your name");
        firstName = input.next();
        System.out.println("Hello, " + firstName);
    }
}
