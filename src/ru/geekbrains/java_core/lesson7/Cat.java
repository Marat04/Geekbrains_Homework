package ru.geekbrains.java_core.lesson7;

import java.util.Scanner;

public class Cat {
    Scanner sc1 = new Scanner(System.in);
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite){

            p.decreaseFood(appetite);
            full = true;
            System.out.println(name + " съел " + appetite + " единиц еды. Он сыт и доволен.");
            System.out.println("В миске осталось: " + p.getFood());
            System.out.println();
        }
        else {
            System.out.println(" В миске недостаточно еды! " + name + " такую мелочь есть отказывается! Он голоден!");
            full = false;

            System.out.print("Сколько корма подбавить? ->" );
            int foodToAdd = sc1.nextInt();
            if (foodToAdd > 0) p.addFood(foodToAdd);
            p.info();

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}