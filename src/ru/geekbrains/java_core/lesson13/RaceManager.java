package ru.geekbrains.java_core.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class RaceManager {

    public static final int CARS_COUNT = 4;
    public static ReadyBlocker readyBlocker = new ReadyBlocker(CARS_COUNT);
    public static FinishLine finishLine = new FinishLine();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        Thread[] carThreads = new Thread[cars.length];
        for (int i = 0; i < cars.length; i++) {
            carThreads[i] = new Thread(cars[i]);
            carThreads[i].start();
        }

        readyBlocker.waitOtherCarsAreReady();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        for (Thread t : carThreads) {
            t.join();
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}

