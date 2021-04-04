package ru.geekbrains.java_core.lesson3;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner (System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        guessNumberFromRandom();
        sc.close();


    }

     public static void guessNumberFromRandom() {
        int wantToPlayMore = 1;
        int countTrials;

        while (wantToPlayMore==1) {
            System.out.println("У вас есть 3 попытки чтобы угадать число");
            int number = rand.nextInt(10); //сгенерированное число
            System.out.println("Подсказка " + number);
            for (countTrials=1; countTrials<=3; countTrials++) {
                System.out.println("Попытка №" + countTrials);

                System.out.print("Введите число от 0 до 9 -> ");
                int guess = sc.nextInt(); //чтение загаданного пользователем числа

                if (guess > 10 || guess < 0) {
                    System.out.println("Введенное значение некорректно. Введите число от  до 9 ");
                } else if (guess > number) {
                    System.out.println("Введенное значени больше загаданного");
                } else if (guess < number) {
                    System.out.println("Введенное значение меньше ! ");
                } else {
                    System.out.println("Вы угадали! ");
                    countTrials = 4;
                }
            }
            System.out.print("Хотите сыграть еще? (1 - Да|  0 - Нет)-> ");
            wantToPlayMore=sc.nextInt();
            if (wantToPlayMore !=1 && wantToPlayMore !=0) {
                System.out.println("Не понятно, хотите ли Вы играть");
                countTrials = 0;
            }
        }
    }

}
