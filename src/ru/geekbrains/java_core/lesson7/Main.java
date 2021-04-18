package ru.geekbrains.java_core.lesson7;

import java.util.Scanner;

public class Main{
    public static Scanner sc = new Scanner(System.in);
    public static int inputNumber;
    public static final int INITIALFOOD=5;
    public static void main(String[] args) {
        Cat[] catsArr = new Cat[3];
        catsArr[0] = new Cat("Пират", 10);
        catsArr[1] = new Cat("Черныш", 15);
        catsArr[2] = new Cat("Пушок", 5);


        System.out.println("Знакомьтесь, сегодня корм будут откушивать: ");
        for (int i=0; i<catsArr.length; i++){
            System.out.println((i + 1) + ". " + catsArr[i].getName()+", за раз съедает " +
                    catsArr[i].getAppetite() + " единиц еды");

        }


        Plate plate = new Plate(INITIALFOOD);
        plate.info();


        do
        {
            System.out.print("Введите номер кота, чтобы его покормить, или 0, чтобы выйти из программы - >");
            inputNumber = sc.nextInt();
            catsArr[inputNumber-1].eat(plate);
        }
        while (inputNumber!=0);
    }
}
