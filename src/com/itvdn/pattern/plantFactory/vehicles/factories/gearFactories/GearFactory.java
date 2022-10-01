package com.itvdn.pattern.plantFactory.vehicles.factories.gearFactories;


import com.itvdn.pattern.plantFactory.vehicles.wheels.abstractions.Gear;

public interface GearFactory {
    Gear createWheelGear();

    Gear createCatGear();
}
