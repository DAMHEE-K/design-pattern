package observer.display;

import observer.Observer;
import observer.WeatherData;

/**
 * WeatherData 객체로부터 상태 변경 사항을 받기 위해 Observer 구현
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData; // 생성자에 weatherData 라는 주제가 전달됨
        weatherData.registerObserver(this); // 이 객체를 써서 해당 디스플레이를 옵저버로 등록
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + "F, 습도" + humidity + "%");
    }

//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.temperature = temp;
//        this.humidity = humidity;
//        display();
//    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
