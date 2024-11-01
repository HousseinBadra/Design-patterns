package Observer;

class PhoneDisplay implements Observer<WeatherObservable> {
    @Override
    public void update(WeatherObservable message) {
        System.out.println("Phone Display - Temperature: " + message.temperature + "C, Humidity: " + message.humidity + "%, Pressure: " + message.pressure + "hPa");
    }
}