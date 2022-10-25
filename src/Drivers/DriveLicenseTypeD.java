package Drivers;
import Car.Bus;

import Car.Car;

public class DriveLicenseTypeD extends Driver<Bus> {

//    private S String ;


    public DriveLicenseTypeD(String fullName, String haveDriveLisens, int driverExpirience, Bus car)
    throws DriveLicenseException {
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
