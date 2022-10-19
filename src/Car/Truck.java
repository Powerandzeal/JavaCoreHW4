package Car;

public class Truck extends Car implements Compete {

    public Truck(String mark, String model, int engineVolume) {
        super(mark, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Truck start moving");

    }

    @Override
    public void endMoving() {
        System.out.println("Truck end moving");
    }

    @Override
    public String pitStope() {
        return "truck make a pit stop";
    }

    @Override
    public int theBestLapTime() {
        return 7;
    }

    @Override
    public int maxSpeed() {
        return 120;
    }
}
