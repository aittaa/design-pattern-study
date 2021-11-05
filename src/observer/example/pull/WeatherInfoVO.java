package observer.example.pull;

public class WeatherInfoVO {
    private float 온도, 습도, 기압, windSpeed; // 관심 정보

    public WeatherInfoVO(float 온도, float 습도, float 기압, float windSpeed) {
        this.온도 = 온도;
        this.습도 = 습도;
        this.기압 = 기압;
        this.windSpeed = windSpeed;
    }

    public float get온도() {
        return 온도;
    }

    public float get습도() {
        return 습도;
    }

    public float get기압() {
        return 기압;
    }

    public float getWindSpeed() {
        return windSpeed;
    }
}
