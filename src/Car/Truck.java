package Car;

public class Truck extends Car implements Compete {

    private LoadCapacity loadCapacity;

    public enum LoadCapacity{
        N1(0.0,3.5),
        N2(3.5,12.0),
        N3(12.0,null);

        private Double from;
        private Double to;

        LoadCapacity(Double from, Double to) {
            this.from = from;
            this.to = to;
        }

        public Double getFrom() {
            return from;
        }

        public void setFrom(Double from) {
            this.from = from;
        }

        public Double getTo() {
            return to;
        }

        public void setTo(Double to) {
            this.to = to;
        }
    }

    public Truck(String mark, String model, int engineVolume,LoadCapacity loadCapacity) {
        super(mark, model, engineVolume);
        this.loadCapacity=loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Information is not have");
        } else System.out.println("load capacity this truck start "
                +loadCapacity.getFrom()+"to "+loadCapacity.getTo());


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
