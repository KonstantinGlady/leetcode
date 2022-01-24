package patterns.observer.jdp;

import lombok.extern.java.Log;

@Log
public class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        log.info("The orcs are facing " + currentWeather.getDescription() + " weather now");
    }
}
