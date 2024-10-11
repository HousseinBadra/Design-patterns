package Abstract_Factory;

public class Client {
    private Provider provider;

    Client(Provider provider) {
        this.provider = provider;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
