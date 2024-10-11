package Abstract_Factory;

import Abstract_Factory.Companies.TeslaFactory;
import Abstract_Factory.Companies.ToyotaFactory;

class FactoryProvider {
    public static Factory createFactory(Client client) {
        switch (client.getProvider()) {
            case Tesla:
                return new TeslaFactory();

            case Toyota:
                return new ToyotaFactory();

            default:
                return null;
        }
    }
}
