package observer.observable.pull;


public class WeatherStation {
    public static void main(String[] args) {
        // subject 생성
        WeatherData weatherData = new WeatherData();

        //Observers 생성
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //기상대 시뮬레이션
        weatherData.setMeasurements(80, 65, 30.4f, 15);
        weatherData.setMeasurements(80, 65, 3.4f, 15);
        weatherData.setMeasurements(80, 65, 37.4f, 15);

    }
}