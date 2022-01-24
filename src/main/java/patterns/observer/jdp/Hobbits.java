package patterns.observer.jdp;

import lombok.extern.java.Log;

@Log
public class Hobbits implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        log.info("The hobbits are facing " + currentWeather.getDescription() + " weather now");
    }
}
