package ru.geekbrains.java_core.lesson5;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String number;
    public int salary;
    private int age;



    public Person(String fio, String position, String email, String number, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo () {
        System.out.println(fio + " "+ position+" "+ email+ " " + number + " " +salary+ " " + age);
    }


}
