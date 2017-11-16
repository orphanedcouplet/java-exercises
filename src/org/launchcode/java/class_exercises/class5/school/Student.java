package org.launchcode.java.class_exercises.class5.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private Integer age;
    private boolean oldEnoughToVote;

    private Student(String name, int studentId, int numberOfCredits, double gpa, Integer age) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        this.age = age;
        // ???:
        this.oldEnoughToVote = isOldEnoughToVote();
    }

    private Student(String name, int studentId, Integer age) {
        this(name, studentId, 0, 0.0, age);
    }

    public Student(String name, Integer age) {
        this(name, nextStudentId, age);
        nextStudentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void  setNumberOfCredits(int aNumber) {
        numberOfCredits = aNumber;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer anAge) {
        age = anAge;
    }

    // i have questions about the "else if (age.equals(null))"
    public boolean isOldEnoughToVote() {
        if (this.age >= 18) {
            return true;
        } else if (this.age.equals(null)) {
            throw new IllegalArgumentException("Age not set");
        } else {
            return false;
        }
    }

}
