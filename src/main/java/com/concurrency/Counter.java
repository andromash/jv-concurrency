package com.concurrency;

public class Counter {
    public static final int END_POINT = 100;
    private int value;

    public int getValue() {
        return value;
    }

    public int increment() {
        return value++;
    }
}
