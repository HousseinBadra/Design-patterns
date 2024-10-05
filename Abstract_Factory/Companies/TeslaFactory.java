package Abstract_Factory.Companies;

import Abstract_Factory.Factory;
import Abstract_Factory.products.Car;
import Abstract_Factory.products.Motorcycle;

public class TeslaFactory implements Factory {
    @Override
    public Car createCar() {
        return new TeslaCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new TeslaMotorcycle();
    }

}

class TeslaCar implements Car {
    public void drive() {
        System.out.println("Tesla car drive");
    }

    public void stop() {
        System.out.println("Tesla car stop");
    }

}

class TeslaMotorcycle implements Motorcycle {
    public void drive() {
        System.out.println("Tesla Motorcycle drive");
    }

    public void stop() {
        System.out.println("Tesla Motorcycle stop");
    }

}