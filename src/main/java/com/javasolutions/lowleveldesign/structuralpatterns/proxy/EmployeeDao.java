package com.javasolutions.lowleveldesign.structuralpatterns.proxy;

// Subject interface - common interface for RealSubject and Proxy
public interface EmployeeDao {
    void getEmployeeInfo(int empID);

    void createEmployee(EmployeeDo obj);
}