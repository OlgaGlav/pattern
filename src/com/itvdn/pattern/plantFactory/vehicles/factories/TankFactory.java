package com.itvdn.pattern.plantFactory.vehicles.factories;


import com.itvdn.pattern.plantFactory.exceptions.VehicleConstructException;
import com.itvdn.pattern.plantFactory.vehicles.Tank;
import com.itvdn.pattern.plantFactory.vehicles.Vehicle;
import com.itvdn.pattern.plantFactory.vehicles.factories.gearFactories.GearFactory;
import com.itvdn.pattern.plantFactory.vehicles.factories.gearFactories.TankGearFactory;
import com.itvdn.pattern.plantFactory.vehicles.wheels.GearType;
import com.itvdn.pattern.plantFactory.vehicles.wheels.abstractions.Gear;

public class TankFactory implements VehicleFactory {

    GearFactory gearFactory = new TankGearFactory();

    @Override
    public Vehicle createVehicle(GearType gearType) {
        Tank tank = new Tank();
        Gear gear = null;
        switch (gearType) {
            case CATERPILLAR -> gear = gearFactory.createCatGear();
            case WHEEL -> gear = gearFactory.createWheelGear();
        }
        if (gear == null) {
            throw new VehicleConstructException("Can not construct tank with this kind of gears!");
        }
        tank.setGear(gear);
        return tank;
    }
}
