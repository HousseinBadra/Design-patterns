package Observer;

// Client code to demonstrate the Observer Pattern
public class Client {
    public static void main(String[] args) {
        // Create a Weather Station (Subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create displays (Observers)
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        // Register displays with the weather station
        weatherStation.addObserver(phoneDisplay);

        // Simulate new weather data
        weatherStation.setWeatherData(new WeatherObservable(25.5f, 65.0f, 1013.1f));
        System.out.println("---");
        weatherStation.setWeatherData(new WeatherObservable(27.3f, 70.0f, 1012.5f));
    }
}