package Car;

public abstract class Car {
    private final  String mark ;
    private final String model;
    private final  int engineVolume;

    //-----------------------------------------------------------------------------------
    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getEngineVolume() {
        return engineVolume;
    }


    //-------------------------------------------------------------------------------------

    public Car(String mark,
                     String model,
                     int engineVolume
                     )

    {
        if (mark!=null&&!mark.isEmpty()&&!mark.isBlank()) {
            this.mark = mark;
        } else this.mark = "default";

        if (model!=null&&!model.isEmpty()&&!model.isBlank()) {
            this.model = model;
        } else this.model = "default";

        if (engineVolume>0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 500;

    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void printType();

    public abstract boolean check();


}
