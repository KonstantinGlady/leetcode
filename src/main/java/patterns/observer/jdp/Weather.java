package patterns.observer.jdp;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

@Log
public class Weather {

    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather() {
        this.currentWeather = WeatherType.SUNNY;
        this.observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal()+1) % enumValues.length];
        log.info("The weather changed " + currentWeather);
        notifyObservers();
    }

    public void notifyObservers() {
        for (var o : observers) {
            o.update(currentWeather);
        }
    }
}
