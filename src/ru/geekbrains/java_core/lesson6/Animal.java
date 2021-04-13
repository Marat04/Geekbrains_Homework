package ru.geekbrains.java_core.lesson6;

public class Animal {
    public String name;
    public String color;
    public int age;

    public Animal(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

    public void animalRun(int distance) {
        System.out.println(name + " пробежал " + distance + " метров");
    }

    public void animalSwim(int distance) {
        System.out.println(name + " проплыл" + distance + " метров");
    }

}
