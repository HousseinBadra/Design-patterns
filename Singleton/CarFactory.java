package Singleton;

public class CarFactory {
    static CarFactory factory = null;

    private CarFactory() {

    }

    static CarFactory getCarFactory() {
        if (factory == null)
            factory = new CarFactory();
        return factory;
    }

    public void startProduction() {
        System.out.println("Production started");
    }
}
