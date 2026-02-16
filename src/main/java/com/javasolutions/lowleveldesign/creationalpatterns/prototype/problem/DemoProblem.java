package com.javasolutions.lowleveldesign.creationalpatterns.prototype.problem;

// Client
public class DemoProblem {
    public static void main(String[] args) {
        Student studentOrg = new Student(1, "Aman", "CSE", 123);
        studentOrg.printDetails();
        // create a clone of the student object
        Student studentClone = new Student();
        studentClone.id = studentOrg.id;
        studentClone.name = studentOrg.name;
        studentClone.branch = studentOrg.branch;
        // studentClone.rollNo = studentOrg.rollNo; // Compilation error
    }
}
