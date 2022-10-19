package Car;

public class Bus extends Car implements Compete {

    public Bus(String mark,
               String model,
               int engineVolume) {
        super(mark, model, engineVolume);
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
