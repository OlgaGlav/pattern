package com.itvdn.pattern.plantFactory.vehicles.factories.gearFactories;


import com.itvdn.pattern.plantFactory.vehicles.wheels.TankCaterpillar;
import com.itvdn.pattern.plantFactory.vehicles.wheels.abstractions.Gear;

public class TankGearFactory implements GearFactory {

    @Override
    public Gear createWheelGear() {
        return null;
    }

    @Override
    public Gear createCatGear() {
        return new TankCaterpillar();
    }
}
