package Drivers;

import Car.Bus;
import Car.Compete;
import Car.Lightvehicle;
import Car.Truck;

public class DriveLicenseTypeB extends Driver<Lightvehicle>{


    public DriveLicenseTypeB(String fullName, String haveDriveLisens, int driverExpirience, Lightvehicle car) {
        super(fullName, haveDriveLisens, driverExpirience, car);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void endMoving() {

    }

    @Override
    public void fillAuto() {

    }
}
