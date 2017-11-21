package org.launchcode.java.examples.class6;

import java.util.ArrayList;
import java.util.Date;

public class Patient {

    private static int nextId = 0;
    private static int getNextId() {
        return nextId++;
    }

    private String name;
    private final Date birthdate;
    private final String ssn;
    private final int id;
    // might actually want to use a "set" - can have duplicate entries, isn't ordered
    private ArrayList<Problem> problems;

    public Patient(String name, Date birthdate, String ssn) {
        this.name = name;
        this.birthdate = birthdate;
        this.ssn = ssn;

        this.id = getNextId();

        problems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getSsn() {
        return ssn;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Problem> getProblems() {
        return problems;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", ssn='" + ssn + '\'' +
                ", id=" + id +
                ", problems=" + problems +
                '}';
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }
}
