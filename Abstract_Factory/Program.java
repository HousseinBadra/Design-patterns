package Abstract_Factory;

public class Program {
    public static void main(String args[]) {
        Client user = new Client(Provider.Tesla);
        Factory factory = FactoryProvider.createFactory(user);

        Automobile car = factory.createCar();
        car.drive();

    }
}
