package com.javasolutions.lowleveldesign.structuralpatterns.proxy;

// Proxy class - controls access to RealEmployee
public class EmployeeDaoProxy implements EmployeeDao {
    private EmployeeDao empDaoObj;
    private String clientRole;

    public EmployeeDaoProxy(String clientRole) {
        empDaoObj = new EmployeeDaoImpl();
        this.clientRole = clientRole;
    }

    @Override
    public void getEmployeeInfo(int empID) {
        if (clientRole.equals("ADMIN") || clientRole.equals("USER")) {
            empDaoObj.getEmployeeInfo(empID);
        } else {
            throw new RuntimeException("Access Denied");
        }
    }

    @Override
    public void createEmployee(EmployeeDo obj) {
        if (clientRole.equals("ADMIN")) {
            empDaoObj.createEmployee(obj);
        } else {
            throw new RuntimeException("Access Denied");
        }
    }
}
