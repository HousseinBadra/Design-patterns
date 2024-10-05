package Abstract_Factory;

import Abstract_Factory.Companies.TeslaFactory;
import Abstract_Factory.Companies.ToyotaFactory;
import Abstract_Factory.products.Car;
import Abstract_Factory.products.Motorcycle;

public class Program {
    public static void main(String args[]) {
        ToyotaFactory toyota = new ToyotaFactory();
        Car toyotaCarina = toyota.createCar();
        Motorcycle motorcycleProMax = toyota.createMotorcycle();

        TeslaFactory Tesla = new TeslaFactory();
        Car modelX = Tesla.createCar();
        Motorcycle motorcycleProMaxUltra = Tesla.createMotorcycle();

        toyotaCarina.drive();
        toyotaCarina.stop();

        motorcycleProMax.drive();
        motorcycleProMax.stop();

        modelX.drive();
        modelX.stop();

        motorcycleProMaxUltra.drive();
        motorcycleProMaxUltra.stop();

    }
}
