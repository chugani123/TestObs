package com.testingobs.spring.dto;

public class Student {

    public Student(String studentId, int marks) {
        this.studentId = studentId;
        this.marks = marks;
    }

    private String studentId;
    private int marks;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
