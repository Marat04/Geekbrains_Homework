package ru.geekbrains.java_core.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

// Фруктовая часть

    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        FruitBox<Apple> appleBox1 = new FruitBox<>(apple, apple, apple);
        System.out.println("Вес appleBox1: "+ appleBox1.getWeight());

        FruitBox<Orange> orangeBox1 = new FruitBox<>(orange, orange);
        System.out.println("Вес orangeBox1: "+ orangeBox1.getWeight());

        FruitBox<Orange> orangeBox2 = new FruitBox<>();
        System.out.println("Вес orangeBox2: "+ orangeBox2.getWeight());

        orangeBox2.addFruit(orange);
        System.out.println("Новый вес orangeBox2: "+ orangeBox2.getWeight());

        if (orangeBox1.weightCompare(orangeBox2)){System.out.println("Коробки с апельсинами равны");}
        else {System.out.println("Коробки с апельсинами не равны");}

        orangeBox1.moveFruitsToAnotherBox(orangeBox2);
        System.out.println("Апельсины были пересыпаны из коробки 1 в коробку 2. Новый вес коробок:");
        System.out.println("Коробка с апельсинами 1:  "+orangeBox1.getWeight());
        System.out.println("Коробка с апельсинами 2:  "+orangeBox2.getWeight());

//задание на массивы1
        System.out.println();
        System.out.println("Перестановка двух элементов массива");
        GenericArray<Integer> genArray1 = new GenericArray<>(1,2,3,4,5,6);
        System.out.println(genArray1.toString());
        genArray1.replaceElements(1,3);
        System.out.println(genArray1.toString());


//задание на массивы2
        System.out.println();
        System.out.println("Преобразование массива в ArrayList");
        String[] arrayOfStrings = {"1", "2", "3", "4"};
        List<String> listOfStrings = new ArrayList<String>();

        listOfStrings = Arrays.asList(arrayOfStrings);
        System.out.println("Полученный ArrayList с помощью метода Arrays.asList()");
        for (String str : listOfStrings)
            System.out.print(" " + str);

    }


}
