package com.javasolutions.lowleveldesign.creationalpatterns.prototype.solution;

// Concrete prototype class
public class Student implements StudentPrototype {

    int id;
    String name;
    String branch;
    boolean inHighSchool;
    private int rollNo;

    Student() {

    }

    // Clone constructor for efficient copying
    Student(int id, String name, String branch, int rollNo) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.rollNo = rollNo;
    }

    // setter method
    public void setInHighSchool(boolean inHighSchool) {
        this.inHighSchool = inHighSchool;
    }

    @Override
    public StudentPrototype clone() {
        return new Student(id, name, branch, rollNo);
    }

    public void printDetails() {
        System.out.println("=== Student Details ===");
        System.out.print(this + ": ");
        System.out.println("Id: " + id + ", Name: " + name + ", Branch: " + branch + ", Roll No: " + rollNo + ", In High School: " + inHighSchool);
    }
}

