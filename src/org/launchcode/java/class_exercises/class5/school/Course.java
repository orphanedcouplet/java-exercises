package org.launchcode.java.class_exercises.class5.school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseTitle;
    private String instructor;
    private final int courseId;
    private static int nextCourseId = 1;
    private int creditHours;
    private ArrayList<Student> studentsEnrolled;

    private Course(String courseTitle, String instructor, int courseId, int creditHours, ArrayList<Student> studentsEnrolled) {
        this.courseTitle = courseTitle;
        this.instructor = instructor;
        this.courseId = courseId;
        this.creditHours = creditHours;
        this.studentsEnrolled = studentsEnrolled;
    }

    private Course(String courseTitle, int courseId) {
        this(courseTitle, "instructor TBD", courseId, 4, new ArrayList<Student>());
    }

    public Course(String courseTitle) {
        this(courseTitle, nextCourseId);
        nextCourseId++;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String aCourseTitle) {
        this.courseTitle = aCourseTitle;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }
}
