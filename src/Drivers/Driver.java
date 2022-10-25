package Drivers;

import Car.Car;
import Car.Compete;

public abstract class Driver<T extends Car & Compete> {
    //    private S String ;
    private String fullName;
    private String haveDriveLisens;
    int driverExpirience;

    private T car;

    public void startMoving() {
        System.out.println(fullName + "start a car" + car.getMark() + " " + car.getModel());

    }

    public void endMoving() {
        System.out.println(fullName + "end a car" + car.getMark() + " " + car.getModel());
    }

    public void fillAuto() {
        System.out.println(fullName + "fill the car" + car.getMark() + " " + car.getModel());


    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHaveDriveLisens() {
        return haveDriveLisens;
    }

    public void setHaveDriveLisens(String haveDriveLisens) {
        this.haveDriveLisens = haveDriveLisens;
    }

    public int getDriverExpirience() {
        return driverExpirience;
    }

    public void setDriverExpirience(int driverExpirience) {
        this.driverExpirience = driverExpirience;
    }

    public Driver(String fullName, String haveDriveLisens, int driverExpirience, T car)
            throws DriveLicenseException
    {
        if (fullName != null && !fullName.isEmpty()) {
            this.fullName = fullName;
        } else System.out.println(" Name driver is not correct");

//        try {
            if (haveDriveLisens != null && !haveDriveLisens.isEmpty()) {
                this.haveDriveLisens = haveDriveLisens;
            } else
                throw new DriveLicenseException("Have not license " + fullName);
                //haveDriveLisens = "You're not our type";
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }


        if (driverExpirience > 0) {
            this.driverExpirience = driverExpirience;
        }
        if (car != null) {
            this.car = car;
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", haveDriveLisens='" + haveDriveLisens + '\'' +
                ", driverExpirience=" + driverExpirience +
                ", car=" + car +
                '}';
    }

    public void info() {
        System.out.println("Driver " + fullName + "Control " + car.getMark() + car.getModel());
    }
}
