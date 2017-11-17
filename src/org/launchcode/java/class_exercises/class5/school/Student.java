package org.launchcode.java.class_exercises.class5.school;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearMonthDV;

import java.time.Clock;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;
import java.util.Date;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private LocalDate birthdate;
    private boolean oldEnoughToVote;

    private Student(String name, int studentId, int numberOfCredits, double gpa, LocalDate birthdate) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        this.birthdate = birthdate;
    }

    private Student(String name, int studentId, LocalDate birthdate) {
        this(name, studentId, 0, 0.0, birthdate);
    }

    public Student(String name, LocalDate birthdate) {
        this(name, nextStudentId, birthdate);
        nextStudentId++;
    }

    public String getName() {
        return name;
    }

    private void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    protected void  setNumberOfCredits(int aNumber) {
        numberOfCredits = aNumber;
    }

    public double getGpa() {
        return gpa;
    }

    protected void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    protected void setBirthdate(LocalDate aBirthdate) {
        birthdate = aBirthdate;
    }

    // i have questions about the "else if (birthdate.equals(null))"
    public boolean isOldEnoughToVote() {
        LocalDate now = LocalDate.now();
        if (now.minusYears(18).equals(this.birthdate)) {
            return true;
        } else if (this.birthdate.equals(null)) {
            throw new IllegalArgumentException("Age not set");
        } else {
            return false;
        }
    }

}
