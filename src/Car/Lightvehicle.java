package Car;

public class Lightvehicle extends Car implements Compete {


    public Lightvehicle(String mark, String model, int engineVolume) {
        super(mark, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Light vehicle start moving");

    }

    @Override
    public void endMoving() {
        System.out.println("Light vehicle end moving");

    }

    @Override
    public String pitStope() {
        return "Light vehicle make a pit stop";
    }

    @Override
    public int theBestLapTime() {
        return 5;
    }

    @Override
    public int maxSpeed() {
        return 200;
    }
}
