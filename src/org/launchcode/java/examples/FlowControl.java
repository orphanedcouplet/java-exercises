package org.launchcode.java.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class FlowControl {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Hello", "World"));
        strings.add("hello");
        strings.add("LC101");
        strings.add("how are you?");

        strings.remove("Hello");

        System.out.println(strings);
        System.out.println(strings.get(0));

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 1;
//        } while (i < 10);
//
//        int j = 0;
//        while (j < 10) {
//            System.out.println(j);
//            j++;
//        }


        // 12 days of christmas switch case example:

//        for (int day = 1; day <= 3; ++day) {
//            switch (day) {
//                case 3:
//                    System.out.println("three French hens");
//                case 2:
//                    System.out.println("two Turtle Doves");
//                case 1:
//                    System.out.println("a partridge in a pear tree");
//            }
//            System.out.println("");
//
//        }
    }
}
