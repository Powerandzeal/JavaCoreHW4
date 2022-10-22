import Car.Bus;
import Car.Car;
import Car.Lightvehicle;
import Car.Truck;
import Drivers.DriveLicenseTypeB;
import Drivers.DriveLicenseTypeC;
import Drivers.DriveLicenseTypeD;
import Drivers.Driver;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Paz","r1",150, Bus.CapacitySeats.HUGE);
        Bus bus2 = new Bus("gaz","21",120, Bus.CapacitySeats.MIDDLE);
        Bus bus3 = new Bus("vaz","4",260, Bus.CapacitySeats.LOW);
        Bus bus4 = new Bus("zaz","e3",300, Bus.CapacitySeats.ESPECIALLY_SMALL);

        Lightvehicle car1 = new Lightvehicle("Tesla","x1",500, Lightvehicle.TypeOfBody.COUPE);
        Lightvehicle car2 = new Lightvehicle("Ferrary","x1",500, Lightvehicle.TypeOfBody.CROSSOVER);
        Lightvehicle car3 = new Lightvehicle("Lamborginy","x1",500, Lightvehicle.TypeOfBody.COUPE);
        Lightvehicle car4 = new Lightvehicle("Tesla","x1",500, Lightvehicle.TypeOfBody.MINIVAN);

        Truck truck1 = new Truck("Ford","33",570, Truck.LoadCapacity.N1);
        Truck truck2 = new Truck("Ford","z1",700, Truck.LoadCapacity.N2);
        Truck truck3 = new Truck("Nissan","h3",890, Truck.LoadCapacity.N3);
        Truck truck4 = new Truck("Kamaz","k1",700, Truck.LoadCapacity.N3);
        System.out.println(truck4.toString());
        truck4.startMoving();
        System.out.println(truck4.pitStope());
        System.out.println(truck4.theBestLapTime());
        System.out.println(truck4.maxSpeed());
        truck4.endMoving();

        DriveLicenseTypeB mihalysh = new DriveLicenseTypeB (
                "Mihail Ivanovich",
                "Cat B", 4,car1);

        DriveLicenseTypeC vova = new DriveLicenseTypeC("ivan",
                "Cat C",2,truck1);

        DriveLicenseTypeD lexa = new DriveLicenseTypeD("Lexa","Cat D",
                4,bus1);

        mihalysh.info();
        vova.info();

        lexa.info();

        bus1.printType();

        truck3.printType();

        car1.printType();

        System.out.println(bus1.getCapacitySeats());















    }
}