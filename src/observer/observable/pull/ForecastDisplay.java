package observer.observable.pull;


import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public ForecastDisplay(Observable weatherData) {
		weatherData.addObserver(this);
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable weatherData, Object o) {

		WeatherInfoVO info = ((WeatherData)weatherData).getInfo();

		lastPressure = currentPressure;
		currentPressure = info.get기압();

		display();
	}
}
