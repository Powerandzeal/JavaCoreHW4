package Drivers;

import Car.Car;
import Car.Compete;
import Car.Truck;

public class DriveLicenseTypeC extends Driver <Truck>{


    public DriveLicenseTypeC(String fullName, String haveDriveLisens, int driverExpirience, Truck car) {
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
