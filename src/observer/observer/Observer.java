package observer.observer;

import observer.dto.WeatherDto;

public interface Observer {
    void update(WeatherDto weatherDto);
}
