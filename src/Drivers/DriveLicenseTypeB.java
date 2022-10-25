package Drivers;

import Car.Lightvehicle;

public class DriveLicenseTypeB extends Driver<Lightvehicle>{


    public DriveLicenseTypeB(String fullName, String haveDriveLisens, int driverExpirience, Lightvehicle car)
            throws DriveLicenseException
    {
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
