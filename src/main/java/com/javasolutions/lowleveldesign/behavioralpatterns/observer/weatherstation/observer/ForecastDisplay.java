package com.javasolutions.lowleveldesign.behavioralpatterns.observer.weatherstation.observer;

import com.javasolutions.lowleveldesign.behavioralpatterns.observer.weatherstation.observable.WeatherObservable;

// Concrete Observer 4 - Forecast Display - Predicts weather based on pressure changes
public class ForecastDisplay implements WeatherObserver {
    private final WeatherObservable weatherStation;

    public ForecastDisplay(WeatherObservable weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    // ForecastDisplay implements the update method in its own way
    @Override
    public void update() {
        System.out.println("Updating weather data to do some analytics: " + weatherStation.toString());
        display();
    }

    // Display the forecast based on the current pressure
    public void display() {
        System.out.println("Forecast Details: Displaying information about Rain, " +
                "Temperature Trends, Significant Weather Events and other phenomemnon...");
    }
}
