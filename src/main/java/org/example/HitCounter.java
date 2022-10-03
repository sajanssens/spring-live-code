package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class HitCounter {

    private final AtomicInteger counter = new AtomicInteger(0);

    public void inc() {
        this.counter.getAndIncrement();
    }

    public String toString() {
        return "Value of hitcounter " + hashCode() + " = " + counter.get();
    }
}
