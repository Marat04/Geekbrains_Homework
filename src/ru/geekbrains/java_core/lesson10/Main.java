package ru.geekbrains.java_core.lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("========Пункт 1==========");
        String[] wordsArray = {"humpty", "dumpty", "sat", "on", "a", "wall",
                "humpty", "dumpty", "had", "a", "great", "fall"};
        System.out.println("Начальный список слов: ");
        System.out.println(Arrays.asList(wordsArray));
        System.out.println();
        int counter = 0;

        HashMap<String, Integer> uniqueWordsHM = new HashMap<>();
        for (String word : wordsArray) {
            if (!uniqueWordsHM.containsKey(word))
                uniqueWordsHM.put(word, 1);

            else {
                counter = uniqueWordsHM.get(word);
                counter++;
                uniqueWordsHM.put(word, counter);
            }
        }

        System.out.println("Уникальные слова и количество повторов: ");
        System.out.println(uniqueWordsHM);







        System.out.println();
        System.out.println("========Пункт 2==========");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addEntry("+7960123456", "mccartney");
        phoneBook.addEntry("+1123415", "mercury");
        phoneBook.addEntry("+546657623456", "butusov");
        phoneBook.addEntry("+6753673", "mccartney");
        phoneBook.addEntry("+123421342", "deacon");
        phoneBook.addEntry("+77121342", "Leva Bi2");
        phoneBook.addEntry("+888888", "Leva Bi2");
        phoneBook.addEntry("+12989677", "Leva Bi2");

        phoneBook.printPhonebook();


        String searchName;

        searchName = "Leva Bi2";
        System.out.println("Поиск по фамилии "+ searchName + ":");
        String[] numbers = phoneBook.getEntry(searchName);
        for (String number : numbers) {
            System.out.println(number);

        }
    }
}


