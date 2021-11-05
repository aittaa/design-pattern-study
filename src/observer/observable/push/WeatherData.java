package observer.observable.push;


import java.util.Observable;

public class WeatherData extends Observable {
    private float 온도, 습도, 기압, windSpeed; // 관심 정보

    public WeatherData() {}

    public WeatherInfoVO getInfo() {
        return new WeatherInfoVO(온도, 습도, 기압, windSpeed);
    }

    public void setMeasurements(float t, float h, float p, float ws) { // 기상청이 호출함.
        온도 = t; 습도 = h; 기압 = p; windSpeed = ws;
        setChanged();
        notifyObservers(getInfo());
    }

}