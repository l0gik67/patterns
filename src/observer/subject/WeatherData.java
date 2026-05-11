package observer.subject;

import observer.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i =  observers.indexOf(observer);
        observers.set(i, observers.getLast());
        observers.removeLast();
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
