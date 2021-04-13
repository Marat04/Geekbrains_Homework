package ru.geekbrains.java_core.lesson6;

public class Dog extends Animal {
    final int RUN_LIMIT = 500;
    final int SWIM_LIMIT = 10;
    public Dog(String name, String color, int age){
        super(name,color,age);
    }


    public void animalRun(int distance) {
        if (distance <= RUN_LIMIT) {
            super.animalRun(distance);
        } else {
            System.out.println(name + " не может бежать больше " + RUN_LIMIT + " метров");
        }

    }

    public void animalSwim(int distance) {
        if(distance <= SWIM_LIMIT){
            super.animalSwim(distance);
        }
        else {
            System.out.println(name+" не может плыть больше " + SWIM_LIMIT + " метров");
        }

    }

}