package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String StudentName;
    private int StudentId;
    private  String department;

    public Student(String studentName, int studentId, String department) {
        StudentName = studentName;
        StudentId = studentId;
        this.department = department;
    }

    public Student() {
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", StudentId=" + StudentId +
                ", department='" + department + '\'' +
                '}';
    }
}
