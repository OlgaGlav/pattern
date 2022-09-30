package com.itvdn.pattern.plantFactory.vehicles.factories;


import com.itvdn.pattern.plantFactory.vehicles.Vehicle;
import com.itvdn.pattern.plantFactory.vehicles.wheels.GearType;

public interface VehicleFactory {
    Vehicle createVehicle(GearType gearType);
}
