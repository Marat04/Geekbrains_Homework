package ru.geekbrains.java_core.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static HashMap<String, String> phoneBook = new HashMap<String, String>();


    public void addEntry(String phone, String name) {
        phoneBook.put(phone, name);
    }


    public void printPhonebook(){
        System.out.println("Телефонный справочник: ");
        for(Map.Entry<String,String> k: phoneBook.entrySet()){
            System.out.println(k.getValue()+": "+ k.getKey());
        }
        System.out.println();
    }


    //FindNumberPhone - производит поиск списка номеров по фамилии заданой в качестве аргумента
    //возвращает массив строк
    public static String[] getEntry(String surname){
        List<String> result = new ArrayList<String>();
        for (Map.Entry entry : phoneBook.entrySet()) {
            if (surname.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("абонент с такой фамилией не найден");
        return result.toArray(new String[0]);
    }



}