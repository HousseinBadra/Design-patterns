package Abstract_Factory;

import Abstract_Factory.products.Car;
import Abstract_Factory.products.Motorcycle;

public interface Factory {
   Car createCar();
   Motorcycle createMotorcycle();
}
