package org.launchcode.java.examples.class6;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient("Mike", new Date(), "123-45-6789");

        Problem p1 = new Problem("R06.6");
        Problem p2 = new Problem("R06.6");

        patient.addProblem(p1);
        patient.addProblem(p2);

        System.out.println(patient);
    }
}
