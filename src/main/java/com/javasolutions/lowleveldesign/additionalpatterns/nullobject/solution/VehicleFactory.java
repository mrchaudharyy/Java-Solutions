package com.javasolutions.lowleveldesign.additionalpatterns.nullobject.solution;

import com.javasolutions.lowleveldesign.additionalpatterns.nullobject.Bike;
import com.javasolutions.lowleveldesign.additionalpatterns.nullobject.Car;
import com.javasolutions.lowleveldesign.additionalpatterns.nullobject.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicle(String type) {
        if (type.equals("car")) {
            return new Car("Toyota", "Red", 5, 60, true);
        } else if (type.equals("bike")) {
            return new Bike("Yamaha", "Black", 60);
        } else {
            return new NullVehicle(); // THE SOLUTION
        }
    }
}
