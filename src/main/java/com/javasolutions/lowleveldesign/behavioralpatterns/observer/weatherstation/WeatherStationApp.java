package com.javasolutions.lowleveldesign.behavioralpatterns.observer.weatherstation;

import com.javasolutions.lowleveldesign.behavioralpatterns.observer.weatherstation.observable.WeatherObservable;
import com.javasolutions.lowleveldesign.behavioralpatterns.observer.weatherstation.observable.WeatherStation;
import com.javasolutions.lowleveldesign.behavioralpatterns.observer.weatherstation.observer.CurrentConditionsDisplay;
import com.javasolutions.lowleveldesign.behavioralpatterns.observer.weatherstation.observer.ForecastDisplay;

// Client code to demonstrate the Observer Pattern
public class WeatherStationApp {
    public static void main(String[] args) {
        System.out.println("###### State Design Pattern ######");
        // Create the weather station (observable/subject)
        WeatherObservable weatherStation = new WeatherStation();

        // Create displays (observers)
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);

        System.out.println("===>>> Initial Weather Update");
        weatherStation.setWeatherReadings(80, 65, 30.4f);

        System.out.println("===>>> Second Weather Update");
        weatherStation.setWeatherReadings(82, 70, 29.2f);

        // Remove forecast display
        weatherStation.removeObserver(forecastDisplay);

        System.out.println("===>>> Third Weather Update");
        weatherStation.setWeatherReadings(70, 21, 29.2f);
        // Forecast display will not be notified
    }
}
