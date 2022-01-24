package patterns.throttling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {

  //  private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        var callsCount = new CallsCount();
        var human = new BarCustomer("young human", 2, callsCount);
        var dwarf = new BarCustomer("dwarf soldier", 4, callsCount);

        var executorServices = Executors.newFixedThreadPool(2);

        executorServices.execute(() -> makeServiceCalls(human, callsCount));
        executorServices.execute(() -> makeServiceCalls(dwarf, callsCount));

        executorServices.shutdown();

        try {
            executorServices.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
          //  LOGGER.error("Executor service terminated: {} ", e.getMessage());
            System.out.printf("Executor service terminated: %s \n", e.getMessage());
        }
    }

    private static void makeServiceCalls(BarCustomer barCustomer, CallsCount callsCount) {

        var timer = new ThrottleTimerIml(1000, callsCount);
        var service = new Bartender(timer, callsCount);

        IntStream
                .range(0, 50)
                .forEach(i -> {
                            service.orderDrink(barCustomer);
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                              //  LOGGER.error("Thread interrupted: {}", e.getMessage());
                                System.out.printf("Thread interrupted: %s", e.getMessage());
                            }
                        }

                );
    }
}
