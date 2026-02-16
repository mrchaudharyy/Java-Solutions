package com.javasolutions.lowleveldesign.structuralpatterns.proxy;

// Client
public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("===== Proxy Design Pattern =====");
        EmployeeDao userProxyObj = new EmployeeDaoProxy("USER");
        userProxyObj.getEmployeeInfo(1); //access granted
        userProxyObj.createEmployee(new EmployeeDo()); //access denied
    }
}