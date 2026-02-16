package com.javasolutions.lowleveldesign.interviewquestions.paymentgateway.user;

public class User {

    int userID;
    String userName;
    String email;

    public User() {

    }

    public User(int userID, String userName, String email) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [userId=" + userID + ", name=" + userName + ", email=" + email + "]";
    }
}
