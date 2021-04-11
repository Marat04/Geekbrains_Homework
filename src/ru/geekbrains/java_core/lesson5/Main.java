package ru.geekbrains.java_core.lesson5;

public class Main {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mail.ru", "892312312", 30000, 30);
        persArray[1] = new Person("Alekseev Aleks", "driver", "alaleks@mail.ru", "892854908", 25000, 38);
        persArray[2] = new Person("Mironov Mikhail", "CEO", "mironov@mail.ru", "896614817", 120000, 45);
        persArray[3] = new Person("Mazhaev Marat", "developer", "mazhaev@mail.ru", "891784356", 45000, 33);
        persArray[4] = new Person("Petrov Petr", "accountant", "petrov@mail.ru", "898576543", 39000, 52);
        for (int i = 0; i < persArray.length; i += 1) {
            if (persArray[i].getAge() > 40) {
                persArray[i].printInfo();
            }
        }

        }

}