package observer.example.pull;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float 온도, 습도, 기압, windSpeed; // 관심 정보
    private ArrayList<Observer> observers; // observer list

    public WeatherData() { observers = new ArrayList<Observer>(); }

    // Subject 인터페이스 구현:
    public void registerObserver(Observer o) { observers.add(o); }
    public void removeObserver(Observer o) { observers.remove(o); }
    public void notifyObservers() {
        for (Observer o : observers) o.update();
    }

    @Override
    public WeatherInfoVO getInfo() {
        return new WeatherInfoVO(온도, 습도, 기압, windSpeed);
    }

    public void setMeasurements(float t, float h, float p, float ws) { // 기상청이 호출함.
        온도 = t; 습도 = h; 기압 = p; windSpeed = ws;
        measurementsChanged();
    }
    public void measurementsChanged() { // 통지 방법에 융통성을 부여하기 위해.
        notifyObservers(); 			  	// (예) if ( condition ) notifyObservers();
    }
}