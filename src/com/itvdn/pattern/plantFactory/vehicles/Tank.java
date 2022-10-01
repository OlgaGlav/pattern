package com.itvdn.pattern.plantFactory.vehicles;


import com.itvdn.pattern.plantFactory.vehicles.wheels.abstractions.Gear;

public class Tank implements Vehicle {
    Gear gear;

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "gear=" + gear +
                '}';
    }
}
