package org.launchcode.java.examples.class7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void cycleRace(ArrayList<Cycle> cycles) {

        Random r = new Random();
        boolean finished = false;

        while (!finished) {
            for (Cycle cycle : cycles) {
                if (cycle.getX() > 10) {
                    finished = true;
                    break;
                }
                cycle.move(r.nextDouble(), 0);
                System.out.println(cycle.getColor() + " at " + cycle.getX());
            }
        }
        for (Cycle cycle : cycles) {
            double longestDist = 0;
            if (cycle.getX() > longestDist) {
                longestDist = cycle.getX();
                Cycle winner = cycle;
                System.out.println(winner.getColor() + " wins!");
            }
        }
    }

    public static void main(String[] args) {

        Bicycle b1 = new Bicycle("Blue", 0, 0);
        Bicycle b2 = new Bicycle("Red", 0, 0);
        Tricycle t1 = new Tricycle("Purple", 0, 0);

        ArrayList<Cycle> cycles = new ArrayList<>(Arrays.asList(b1, b2, t1));
        cycleRace(cycles);

        Random r = new Random();

        while (b1.getX() < 10 && b2.getX() < 10 && t1.getX() < 10) {
            b1.move(r.nextDouble(), 0);
            b2.move(r.nextDouble(), 0);
            t1.move(r.nextDouble(), 0);
            System.out.println("b1 = " + b1.getX() + " b2 = " + b2.getX() + " t1 = " + t1.getX());
        }
    }
}
