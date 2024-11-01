package Observer;

public class WeatherObservable implements Observable {
    final float temperature;
    final float humidity;
    final float pressure;

    WeatherObservable(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
    }
}
