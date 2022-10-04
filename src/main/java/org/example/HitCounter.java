package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Component @Scope(SCOPE_SINGLETON)
public class HitCounter {

    private final AtomicInteger counter = new AtomicInteger(0);

    public void inc() {
        this.counter.getAndIncrement();
    }

    public String toString() {
        return "Value of hitcounter " + hashCode() + " = " + counter.get();
    }
}
