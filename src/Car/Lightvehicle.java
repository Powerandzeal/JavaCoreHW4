package Car;

public class Lightvehicle extends Car implements Compete {

    private TypeOfBody typeOfBody;
    public enum TypeOfBody {
        SEDAN   ,
        HATCHBACK,
        COUPE,
        UNIVERSALIS,
        OFF_ROAD_CAR,
        CROSSOVER,
        PICKUP,
        WAGON,
        MINIVAN;

        private String typeOfCarcase;



        }
//        public static Car.Lightvehicle.TypeOfBody check(String type) {
//            return Car.Lightvehicle.TypeOfBody.valueOf(type);}
//        }
//        private Car.Lightvehicle.TypeOfBody typeOfCarcase;

    public Lightvehicle(String mark, String model, int engineVolume,TypeOfBody typeOfBody) {
        super(mark, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }


    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Information is not have");
        } else System.out.println("Type of body"+ typeOfBody);

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
