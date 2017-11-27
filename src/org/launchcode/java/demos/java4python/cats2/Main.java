package org.launchcode.java.demos.java4python.cats2;

public class Main {

    public static void main(String[] args) {

    /*
    HouseCat garfield = new HouseCat("Garfield", 12);
    garfield.eat();
    */


    /*
    won't compile:
    HouseCat thumper = new HouseCat(8.4);
    */


    /*
    Cat plainCat = new Cat(8.6);
    HouseCat garfield = new HouseCat("Garfield", 12);
    garfield.sleep();
    garfield.eat();
    garfield.sleep();

    System.out.println(plainCat.noise());       // prints "Meeeeeeoooowww!"
    System.out.println(garfield.noise());       // prints "Hello, my name is Garfield!"
    */

    Cat suki = new HouseCat("Suki", 8);

    // calls HouseCat's noise() method
        suki.noise();

//        // Results in a compiler error, because Cat doesn't have such a method
//        suki.isSatisfied();

        // As long as suki really is a HouseCat, this works
        ((HouseCat) suki).isSatisfied();
        
    }
}
