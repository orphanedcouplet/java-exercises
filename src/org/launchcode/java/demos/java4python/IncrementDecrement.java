package org.launchcode.java.demos.java4python;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 3;
        System.out.printf(String.format("a = %d\n", a));
        int b = a++;
        System.out.println("b = a++");
        System.out.println("...");
        System.out.printf(String.format("a = %d\n", a));
        System.out.printf(String.format("b = %d\n", b));
        System.out.println("///");
        a = 3;
        System.out.printf(String.format("a = %d\n", a));
        b = ++a;
        System.out.println("b = ++a");
        System.out.println("...");
        System.out.printf(String.format("a = %d\n", a));
        System.out.printf(String.format("b = %d\n", b));
        System.out.println("///");
        a = 3;
        System.out.printf(String.format("a = %d\n", a));
        b = a++;
        System.out.println("b = a++");
        System.out.printf(String.format("(b = %d)\n", b));
        System.out.printf(String.format("(a = %d)\n", a));
        int c = ++a;
        System.out.println("c = ++a");
        System.out.printf(String.format("(c = %d)\n", c));
        System.out.printf(String.format("(a = %d)\n", a));
        int d = --b + ++c * b-- - ++a / --a % c++;
        System.out.println("d = --b + ++c * b-- - ++a / --a % c++");
        System.out.printf(String.format("d = %d\n", d));
        System.out.printf(String.format("(a = %d)\n", a));
        System.out.printf(String.format("(b = %d)\n", b));
        System.out.printf(String.format("(c = %d)\n", c));
    }
}
