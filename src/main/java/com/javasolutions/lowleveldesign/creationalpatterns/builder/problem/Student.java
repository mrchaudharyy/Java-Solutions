package com.javasolutions.lowleveldesign.creationalpatterns.builder.problem;

import java.util.List;

// Step 1: Product class - The complex Student object being built
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

    // Without Builder - Constructor overloading
    // Telescoping Constructor Problem - adding mandatory parameters
    public Student(int rollNumber, int age, String name, String branch) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
    }

    // Telescoping Constructor Problem - adding new parameter - fatherName(optional)
    public Student(int rollNumber, int age, String name, String branch, String fatherName) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
    }

    // Telescoping Constructor Problem - adding new parameter - motherName(optional)
    public Student(int rollNumber, int age, String name, String branch, String fatherName, String motherName) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    // Telescoping Constructor Problem - adding new parameter - emailId(optional)
    // Compilation error - Constructor signature is same as another constructor(below)
    public Student(int rollNumber, int age, String name, String branch, String fatherName, String motherName, String emailId) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.emailId = emailId;
    }

    // Telescoping Constructor Problem - adding new parameter - emailId(optional)
    // Compilation error - Constructor signature is same as another constructor(above)
    /*public Student(int rollNumber, int age, String name, String branch, String fatherName, String motherName, String mobileNo) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.mobileNo = mobileNo;
    }*/

    // Telescoping Constructor Problem - All arguments constructor
    // Big Constructor with long parameter list
    public Student(int rollNumber, int age, String name, String branch, String fatherName, String motherName, List<String> subjects, String mobileNo, String emailId) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.branch = branch;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.subjects = subjects;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }

    public void printDetails() {
        System.out.println("=== Student Details ===");
        System.out.print(this + ": ");
        System.out.println("Id: " + rollNumber +
                ", Name: " + name +
                ", Age: " + age +
                ", Branch: " + branch +
                ", Roll No: " + rollNumber +
                ", Father Name: " + fatherName +
                ", Mother Name: " + motherName +
                ", Subjects: " + subjects +
                ", Mobile No: " + mobileNo +
                ", Email Id: " + emailId);
    }
}
