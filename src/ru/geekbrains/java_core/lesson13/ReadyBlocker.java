package ru.geekbrains.java_core.lesson13;

import java.util.concurrent.atomic.AtomicInteger;

class ReadyBlocker {
    private AtomicInteger readyCounter = new AtomicInteger(0);
    private int amount;

    public ReadyBlocker(int amount) {
        this.amount = amount;
    }

    void carIsReady() {
        readyCounter.incrementAndGet();
    }

    synchronized void waitOtherCarsAreReady() {
        while (readyCounter.get() < amount) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
