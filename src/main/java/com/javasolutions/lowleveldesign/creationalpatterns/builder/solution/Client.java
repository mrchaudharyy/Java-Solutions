package com.javasolutions.lowleveldesign.creationalpatterns.builder.solution;

// Step 6: Client demonstration
public class Client {

    public static void main(String[] args) {
        System.out.println("===== Builder Design Pattern =====");
        // Create director objects
        StudentRegistrationDirector enggStudentDirector = new StudentRegistrationDirector(new EngineeringStudentBuilder());
        StudentRegistrationDirector mbaStudentDirector = new StudentRegistrationDirector(new MBAStudentBuilder());

        // Create students using different builders
        Student engineerStudent = enggStudentDirector.createStudent();
        Student mbaStudent = mbaStudentDirector.createStudent();

        // Print student details
        System.out.println("===> Student details:" + engineerStudent.toString());
        System.out.println("===> Student details:" + mbaStudent.toString());

    }
}