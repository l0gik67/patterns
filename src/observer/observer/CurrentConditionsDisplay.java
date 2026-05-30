package observer.observer;

import observer.dto.WeatherDto;
import observer.subject.Subject;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable){
        observable.addObserver(this);
        this.observable = observable;
    }

    public void display() {
        System.out.printf("Current conditions displayed: temperatures - %s, humidity - %s", temperature, humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherDto weather = (WeatherDto)arg;
        temperature = weather.getTemperature();
        humidity = weather.getHumidity();
        display();
    }
}
