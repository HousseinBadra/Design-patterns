package Abstract_Factory.Companies;

import Abstract_Factory.Factory;
import Abstract_Factory.products.Car;
import Abstract_Factory.products.Motorcycle;

public class ToyotaFactory implements Factory {
    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new ToyotaMotorcycle();
    }

}

class ToyotaCar implements Car {
    public void drive() {
        System.out.println("Toyota car drive");
    }

    public void stop() {
        System.out.println("Toyota car stop");
    }

}

class ToyotaMotorcycle implements Motorcycle {
    public void drive() {
        System.out.println("Toyota Motorcycle drive");
    }

    public void stop() {
        System.out.println("Toyota Motorcycle stop");
    }

}