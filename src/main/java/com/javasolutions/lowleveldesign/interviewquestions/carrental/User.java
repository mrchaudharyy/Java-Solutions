package com.javasolutions.lowleveldesign.interviewquestions.carrental;

public class User {

    int userId;
    String userName;
    String drivingLicenseNo;

    public User(int userId, String userName, String drivingLicenseNo) {
        this.userId = userId;
        this.userName = userName;
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

}
