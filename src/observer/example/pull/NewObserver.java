package observer.example.pull;

public class NewObserver implements Observer, DisplayElement{

    private float temp;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    NewObserver(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        WeatherInfoVO info = weatherData.getInfo();
        pressure = info.get기압();
        humidity = info.get습도();
        temp = info.get온도();
        display();
    }

    @Override
    public void display() {
        System.out.println("== updated weather data ==");
        System.out.println("temp = " + temp);
        System.out.println("humidity = " + humidity);
        System.out.println("pressure = " + pressure);
    }
}
