package ru.geekbrains.java_core.lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood(int n){
        food += n;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
