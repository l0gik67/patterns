package observer.observer;

import observer.dto.WeatherDto;
import observer.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(WeatherDto weather) {
        temperature = weather.getTemperature();
        humidity = weather.getHumidity();
        display();
    }

    public void display() {
        System.out.printf("Current conditions displayed: temperatures - %s, humidity - %s", temperature, humidity);
    }
}
