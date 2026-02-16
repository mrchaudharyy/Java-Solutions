package com.javasolutions.lowleveldesign.interviewquestions.book_my_show.entities;

import com.javasolutions.lowleveldesign.interviewquestions.book_my_show.enums.City;

import java.util.List;

public class Theatre {

    private final String name;
    private final City city;
    private final List<Screen> screens;
    //address info etc.

    public Theatre(String name, City city, List<Screen> screens) {
        this.name = name;
        this.city = city;
        this.screens = screens;
    }

    public City getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public List<Screen> getScreens() {
        return screens;
    }
}


