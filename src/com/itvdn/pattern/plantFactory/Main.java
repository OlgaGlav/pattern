package com.itvdn.pattern.plantFactory;


import com.itvdn.pattern.plantFactory.vehicles.Tank;
import com.itvdn.pattern.plantFactory.vehicles.factories.TankFactory;
import com.itvdn.pattern.plantFactory.vehicles.factories.TractorFactory;
import com.itvdn.pattern.plantFactory.vehicles.factories.VehicleFactory;
import com.itvdn.pattern.plantFactory.vehicles.wheels.GearType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vehicle Plant");

        VehicleFactory tankFactory = new TankFactory();
        VehicleFactory tractorFactory = new TractorFactory();

        //Tank catTank = (Tank) tankFactory.createVehicle(GearType.CATERPILLAR);
        Tank wheelTank = (Tank) tankFactory.createVehicle(GearType.WHEEL);
/*        Tractor wheelTractor = (Tractor) tractorFactory.createVehicle(GearType.WHEEL);
        Tractor catTractor = (Tractor) tractorFactory.createVehicle(GearType.CATERPILLAR);*/

        //System.out.println(catTank);
        System.out.println(wheelTank);
/*        System.out.println(catTractor);
        System.out.println(wheelTractor);*/
    }
}
