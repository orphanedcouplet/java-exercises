package org.launchcode.java.studios.restaurant;

import java.util.Calendar;

import static java.util.Calendar.*;

public class XDate {

    private int year;
    private int month;
    private int day;

    public XDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static XDate xNow() {
        Calendar now = Calendar.getInstance();
        int nowYear = now.get(YEAR);
        int nowMonth = now.get(MONTH);
        int nowDayOfMonth = now.get(DAY_OF_MONTH);
        return new XDate(nowYear, nowMonth, nowDayOfMonth);
    }

    public static int compare2XDates(XDate aDate, XDate anotherDate) {

        // returns:
        // the value 0 if aDate is equal to anotherDate
        // a value less than 0 if anotherDate is before aDate
        // a value greater than 0 if anotherDate is after aDate
        // (steps from 0 equal to number of days difference between the XDate objects)

        // throws NullPointerException if anotherDate is null

        if (aDate == null || anotherDate == null) {
            throw new NullPointerException("null XDate(s) :(");
        } else {
            // make Calendar objects with the same date as our XDate objects
            Calendar aCal = Calendar.getInstance();
            aCal.set(aDate.year, aDate.month, aDate.day);
            Calendar anotherCal = Calendar.getInstance();
            anotherCal.set(anotherDate.year, anotherDate.month, anotherDate.day);

            // get the day of the year out of the Calendar objects
            int aDayOfYear = aCal.get(DAY_OF_YEAR);
            int anotherDayOfYear = anotherCal.get(DAY_OF_YEAR);

            // calculate difference!
            return anotherDayOfYear - aDayOfYear;

        }
    }

    @Override
    public String toString() {
        return "XDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", hashcode=" + hashCode() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XDate xDate = (XDate) o;

        if (day != xDate.day) return false;
        if (month != xDate.month) return false;
        return year == xDate.year;
    }

    @Override
    public int hashCode() {
        int result = day;
        result = 31 * result + month;
        result = 31 * result + year;
        return result;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    private void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    private void setDay(int day) {
        this.day = day;
    }

}
