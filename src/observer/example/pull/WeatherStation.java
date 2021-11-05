package observer.example.pull;

public class WeatherStation {
    public static void main(String[] args) {
        // subject 생성
        WeatherData weatherData = new WeatherData();

        //Observers 생성
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        NewObserver newObserver = new NewObserver(weatherData);

        //기상대 시뮬레이션
        weatherData.setMeasurements(80, 65, 30.4f, 15);
        weatherData.setMeasurements(82, 70, 29.2f, 2);
        weatherData.setMeasurements(78, 90, 29.2f, 14);
    }
}