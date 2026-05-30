package observer;

import observer.observer.CurrentConditionsDisplay;
import observer.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(30, 60, 20);
        weatherData.setMeasurements(10, 90, 20);
    }
}
