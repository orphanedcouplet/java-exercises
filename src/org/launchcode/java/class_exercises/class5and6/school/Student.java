package org.launchcode.java.class_exercises.class5and6.school;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private LocalDate birthdate;
    private boolean oldEnoughToVote;
    private int gradesCompleted = 0;
    private String gradeLevel;

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

    public void addGrade(int courseCredits, double grade) {
        double courseQualityScore = grade * courseCredits;
        double totalQualityScore = this.gpa * this.numberOfCredits;
        this.numberOfCredits += courseCredits;
        totalQualityScore += courseQualityScore;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    private int getGradesCompleted() {
        // assume 4 credits per class
        // 4 classes per semester
        // 2 semesters per grade level
        // so: ~32 credits per grade level
        int gradeCredits = 30;
        if (this.numberOfCredits < (gradeCredits * 1)) {
            this.gradesCompleted = 0;
        } else if (this.numberOfCredits >= (gradeCredits * 1)) {
            this.gradesCompleted = 1;
        } else if (this.numberOfCredits >= (gradeCredits * 2)) {
            this.gradesCompleted = 2;
        } else if (this.numberOfCredits >= (gradeCredits * 3)) {
            this.gradesCompleted = 3;
        } else if (this.numberOfCredits >= (gradeCredits * 4)) {
            this.gradesCompleted = 4;
        }
        return gradesCompleted;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.gradesCompleted < 1) {
            this.gradeLevel = "freshman";
        } else if (this.gradesCompleted < 2) {
            this.gradeLevel = "sophomore";
        } else if (this.gradesCompleted < 3) {
            this.gradeLevel = "junior";
        } else if (this.gradesCompleted < 4) {
            this.gradeLevel = "senior";
        } else {
            this.gradeLevel = "graduate, probably";
        }

        return gradeLevel;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.gradeLevel + ", GPA: " + this.gpa + ")";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) obj;

//        return theStudent.getStudentId() == getStudentId() || (theStudent.getName() == getName());

        return theStudent.getStudentId() == getStudentId();
    }

    public int hashCode() {
        return Objects.hash(studentId);
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

    private void setNumberOfCredits(int aNumber) {
        numberOfCredits = aNumber;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    private void setBirthdate(LocalDate aBirthdate) {
        birthdate = aBirthdate;
    }

    public boolean isOldEnoughToVote() {
        LocalDate now = LocalDate.now();
        if (now.minusYears(18).equals(this.birthdate)) {
            return true;
        } else {
            return false;
        }
    }

}
