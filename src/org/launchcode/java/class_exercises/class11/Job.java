package org.launchcode.java.class_exercises.class11;

import java.util.Comparator;

public class Job implements Comparable<Job> {
    private String title;
    private int salary;
    private double distFromHome;

    private final int id;
    public static int nextId = 1;

    static private int getNextId() {
        return nextId++;
    }

    public Job(String title, int salary, double distFromHome) {
        this.id = getNextId();
        this.title = title;
        this.salary = salary;
        this.distFromHome = distFromHome;
    }

    @Override
    public int compareTo(Job o) {
        return Double.compare(this.distFromHome, o.distFromHome);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getDistFromHome() {
        return distFromHome;
    }

    public void setDistFromHome(double distFromHome) {
        this.distFromHome = distFromHome;
    }

    public int getId() {
        return id;
    }
}
