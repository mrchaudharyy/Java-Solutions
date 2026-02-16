package com.javasolutions.lowleveldesign.interviewquestions.carrental;

public class Location {

    int buildingNo;
    String area;
    String city;
    String state;
    String country;
    int pincode;

    Location(int buildingNo, String area, String city, String state, String country, int pincode) {
        this.buildingNo = buildingNo;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

}
