package ru.geekbrains.java_core.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pirat", "white", 2);
        cat.animalRun(150);
        cat.animalRun(205);
        cat.animalSwim(10);
        Dog dog = new Dog("Vin", "gray",4);
        dog.animalRun(150);
        dog.animalRun(600);
        dog.animalSwim(23);



    }
}
