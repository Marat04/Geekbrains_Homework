package ru.geekbrains.java_core.lesson1;

public class Main {
    public static void main(String[] args) {

        // пункт №2 домашнего задания - инициализация переменных
        byte b = -3;
        int i = 10;
        short s = -4;
        long l = 14L;
        double d = 6.4;
        float f = 4.5f;
        char c = 'l';
        String line = "any text";



        //Методы 3-8 из ДЗ названы по номеру пунктов,например метод из задания 3 называется point3, из задания 4 - point4 и т.д.
        //Ниже вызываю все написанные методы для проперки их работы.
        System.out.println(point3(4, 6, 14, 2));
        System.out.println(point4(4, 3));
        point5(6);
        System.out.println(point6(7));
        point7("Marat");
        point8(200);
        point8(800);
        point8(1500);
        point8(4400);

    }

    public static float point3(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;

    }


    public static boolean point4(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }


    }

    public static void point5(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }


    public static boolean point6(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false; }
    }

    public static void point7(String names) {
        System.out.println("Привет " + names);

    }

    public static void point8(int year) {
        if (year % 4 != 0) {
            System.out.println(year + " Год не високосный");
        }
        else
        if ((year % 100 == 0) && (year % 400 != 0)) {
            System.out.println(year + " Год не високосный");
        }
        else {
            System.out.println(year + " Год  високосный");
        }

    }
}
