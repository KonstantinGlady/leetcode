package patterns.throttling;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class CallsCount {

    //private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CallsCount.class);
    private final Map<String, AtomicLong> tenantCallsCount = new ConcurrentHashMap<>();

    public void addTenant(String tenantName) {
        tenantCallsCount.putIfAbsent(tenantName, new AtomicLong(0));
    }

    public void incrementCount(String tenantName) {
        tenantCallsCount.get(tenantName).incrementAndGet();
    }

    public Long getCount(String tenantName) {
        return tenantCallsCount.get(tenantName).get();
    }

    public void reset() {
        tenantCallsCount.replaceAll((k, v) -> new AtomicLong(0));
      //  log.info("reset counters");
        System.out.println("reset counters");
    }
}
