package org.launchcode.java.examples;

public class Christmas {
    public static void main(String[] args) {
        // 12 days of christmas switch case example:

        String ordNum = "first";
        String onTheNth = String.format("On the %s day of Christmas, my true love gave to me", ordNum);

        for (int day = 1; day < 4; ++day) {
            System.out.println(onTheNth);
            switch (day) {
                case 12:
                    System.out.println("twelve drummers drumming");
                case 11:
                    System.out.println("eleven pipers piping");
                case 10:
                    System.out.println("ten lords a-leaping");
                case 9:
                    System.out.println("nine ladies dancing");
                case 8:
                    System.out.println("eight maids a-milking");
                case 7:
                    System.out.println("seven swans a-swimming");
                case 6:
                    System.out.println("six geese a-laying");
                case 5:
                    System.out.println("five golden rings");
                case 4:
                    ordNum = "fourth";
                    System.out.println("four calling birds");
                case 3:
                    ordNum = "third";
                    System.out.println("three French hens");
                case 2:
                    ordNum = "second";
                    System.out.println("two turtledoves");
                case 1:
                    ordNum = "first";
                    System.out.println("a partridge in a pear tree");
            }
            System.out.println("");

        }

    }
}
