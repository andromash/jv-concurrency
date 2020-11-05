package com.concurrency;

import org.apache.log4j.Logger;

public class SecondThread implements Runnable {
    private static final Logger logger = Logger.getLogger(SecondThread.class);
    private final Counter counter;

    public SecondThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getValue() <= Counter.END_POINT) {
            int i = counter.increment();
            logger.info("Runnable thread: " + i);
        }
    }
}
