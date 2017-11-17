package org.launchcode.java.examples;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExperiments {

    public static void main(String[] args) {

        Date dateCreated = new Date();

        Date anotherDate = new Date();

        int result = anotherDate.compareTo(dateCreated);

        System.out.println(result);
    }

}
