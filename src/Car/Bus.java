package Car;

public class Bus extends Car implements Compete {

    private CapacitySeats capacitySeats;

    public enum CapacitySeats {
        ESPECIALLY_SMALL, LOW,
        MIDDLE, BIG,
        HUGE();

        }

    public CapacitySeats getCapacitySeats() {
        return capacitySeats;
    }

    public void setCapacitySeats(CapacitySeats capacitySeats) {
        this.capacitySeats = capacitySeats;
    }

    public Bus(String mark,
               String model,
               int engineVolume,
               CapacitySeats capacitySeats) {
        super(mark, model, engineVolume);
        this.capacitySeats = capacitySeats;
    }

    @Override
    public void startMoving() {
        System.out.println("Bus start moving");

    }

    @Override
    public void endMoving() {
        System.out.println("Bus end moving");
    }

    @Override
    public void printType() {
        if (capacitySeats == null) {
            System.out.println("Information is not have");
        } else System.out.println("Type of capacity "+getCapacitySeats());
    }

    @Override
    public boolean check() {

        return false;
    }


    @Override
    public String pitStope() {
        return "Bus make a pit stop" ;
    }

    @Override
    public int theBestLapTime() {
        return 4 ;
    }

    @Override
    public int maxSpeed() {
        return 150;
    }
}
