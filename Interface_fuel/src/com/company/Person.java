package com.company;

public class Person {

    String name;
    int age;
    String type;
    Car myCar;


    public Person(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;

    }

    public void setMyCar(Car myCar) {
        this.myCar = myCar;
    }
}
