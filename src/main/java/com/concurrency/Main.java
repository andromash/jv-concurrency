package com.concurrency;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        FirstThread extendedThread = new FirstThread(counter);
        Thread runnableThread = new Thread(new SecondThread(counter));

        extendedThread.start();
        runnableThread.start();
    }
}
