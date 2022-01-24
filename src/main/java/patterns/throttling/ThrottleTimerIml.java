package patterns.throttling;

import java.util.Timer;
import java.util.TimerTask;

public class ThrottleTimerIml implements Throttler {

    private final int throttlePeriod;
    private final CallsCount callsCount;

    public ThrottleTimerIml(int throttlePeriod, CallsCount callsCount) {
        this.throttlePeriod = throttlePeriod;
        this.callsCount = callsCount;
    }

    @Override
    public void start() {
        new Timer(true).schedule(new TimerTask() {
            @Override
            public void run() {
                callsCount.reset();
            }
        }, 0, throttlePeriod);
    }
}
