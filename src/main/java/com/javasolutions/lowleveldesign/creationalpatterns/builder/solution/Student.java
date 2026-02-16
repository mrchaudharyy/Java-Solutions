package com.javasolutions.lowleveldesign.creationalpatterns.builder.solution;

import java.util.List;

// Step 1: Product class - Complex Student object
public class Student {

    // mandatory fields
    int rollNumber;
    int age;
    String name;
    String branch;
    // optional fields
    String fatherName;
    String motherName;
    List<String> subjects;
    String mobileNo;
    String emailId;

    // Constructor - package private, only builder can create
    Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.branch = builder.branch;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.subjects = builder.subjects;
        this.mobileNo = builder.mobileNo;
        this.emailId = builder.emailId;
    }

    public String toString() {
        return " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " branch: " + this.branch +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2) +
                " mobile no: " + this.mobileNo +
                " email id: " + this.emailId;
    }

}
