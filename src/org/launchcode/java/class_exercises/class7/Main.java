package org.launchcode.java.class_exercises.class7;

import com.sun.org.apache.regexp.internal.RE;

public class Main {

    public static void main(String[] args) {

        Rectangle hiImARectangle = new Rectangle(2,4);
        int id1 = hiImARectangle.getObjectId();

        Square soSquare = new Square(4);
        int id2 = soSquare.getObjectId();

        Circle notAnOval = new Circle(1);
        int id3 = notAnOval.getObjectId();

        System.out.println(id1 + "\n" + id2 + "\n" + id3);
    }
}
