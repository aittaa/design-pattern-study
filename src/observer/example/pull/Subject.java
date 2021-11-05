package observer.example.pull;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	public WeatherInfoVO getInfo();
}
