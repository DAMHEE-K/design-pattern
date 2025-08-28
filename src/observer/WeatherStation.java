package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;
import observer.display.StatisticsDisplay;

/**
 * 옵저버 패턴(Observer pattern)
 * 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고
 * 자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의한다.
 * 보통 주제 인터페이스와 옵저버 인터페이스가 들어가있는 클래스 디자인으로 구현한다.
 */
public class WeatherStation {
    public void station() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(85, 70, 29.2f);
        weatherData.setMeasurements(85, 75, 29.2f);
    }
}
