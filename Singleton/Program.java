package Singleton;

public class Program {
    public static void main(String args[]) {
        CarFactory factory = CarFactory.getCarFactory();
        factory.startProduction();
    }
}
