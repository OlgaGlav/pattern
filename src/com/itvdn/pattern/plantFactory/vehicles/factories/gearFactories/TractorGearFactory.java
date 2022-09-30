package com.itvdn.pattern.plantFactory.vehicles.factories.gearFactories;


import com.itvdn.pattern.plantFactory.vehicles.wheels.TractorCaterpillar;
import com.itvdn.pattern.plantFactory.vehicles.wheels.TractorWheel;
import com.itvdn.pattern.plantFactory.vehicles.wheels.abstractions.Gear;

public class TractorGearFactory implements GearFactory {

    @Override
    public Gear createWheelGear() {
        return new TractorWheel();
    }

    @Override
    public Gear createCatGear() {
        return new TractorCaterpillar();
    }
}
