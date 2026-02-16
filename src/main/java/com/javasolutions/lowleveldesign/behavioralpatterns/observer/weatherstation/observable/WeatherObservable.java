package com.javasolutions.lowleveldesign.behavioralpatterns.observer.weatherstation.observable;

import com.javasolutions.lowleveldesign.behavioralpatterns.observer.weatherstation.observer.WeatherObserver;

// Observable(Subject) interface
// Defines methods for managing observers and notifying them of changes
public interface WeatherObservable {

    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();

    void setWeatherReadings(float temperature, float humidity, float pressure);
}
