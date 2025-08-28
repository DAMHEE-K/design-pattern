package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 옵저버에게 알려하는 데이터가 담긴 클래스
 */
public class WeatherData implements Subject{
    private List<Observer> observers; // Observer 객체 목록 (구독자들)
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) { // 구독자 목록을 돌며 update()를 호출하여 상태 변경
//            o.update(temperature, humidity, pressure);
            o.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers(); // 기상 스테이션으로부터 갱신된 측정값을 받아 옵저버에게 알림
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }
    public float getHumidity() {
        return this.humidity;
    }
    public float getPressure() {
        return this.pressure;
    }
}
