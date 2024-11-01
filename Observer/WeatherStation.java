package Observer;

import java.util.ArrayList;

// Concrete Subject: WeatherStation
class WeatherStation implements Subject<WeatherObservable> {
    private ArrayList<Observer<WeatherObservable>> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    // Methods to add, remove, and notify observers
    @Override
    public void addObserver(Observer<WeatherObservable> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<WeatherObservable> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer<WeatherObservable> observer : observers) {
            observer.update(new WeatherObservable(temperature, humidity, pressure));
        }
    }

    // Method to update weather data and notify observers
    public void setWeatherData(WeatherObservable message) {
        this.temperature = message.temperature;
        this.humidity = message.humidity;
        this.pressure = message.pressure;
        notifyObservers();
    }
}