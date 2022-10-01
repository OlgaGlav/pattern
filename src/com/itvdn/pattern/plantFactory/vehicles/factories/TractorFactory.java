package com.itvdn.pattern.plantFactory.vehicles.factories;


import com.itvdn.pattern.plantFactory.vehicles.Tractor;
import com.itvdn.pattern.plantFactory.vehicles.Vehicle;
import com.itvdn.pattern.plantFactory.vehicles.factories.gearFactories.GearFactory;
import com.itvdn.pattern.plantFactory.vehicles.factories.gearFactories.TractorGearFactory;
import com.itvdn.pattern.plantFactory.vehicles.wheels.GearType;
import com.itvdn.pattern.plantFactory.vehicles.wheels.abstractions.Gear;

public class TractorFactory implements VehicleFactory {

    GearFactory gearFactory = new TractorGearFactory();

    @Override
    public Vehicle createVehicle(GearType gearType) {
        Tractor tractor = new Tractor();
        Gear gear = null;
        switch (gearType) {
            case CATERPILLAR -> gear = gearFactory.createCatGear();
            case WHEEL -> gear = gearFactory.createWheelGear();
        }
        tractor.setGear(gear);
        return tractor;
    }
}
