package DesignPatterns.chapter02;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        //생성자에 weatherData 라는 주제가 전달되며, 그 객체를 써서 디스플레이를 옵저버로 등록함.
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display(); //업데이트가 호출되면 온도와 습도를 저장하고 디스플레이를 호출함
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + "F, 습도 " + humidity + "%");
    }
}
