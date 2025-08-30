package com.daruuu.teorywithexamples;

public class Person {
    private String  name;
    private int     age;

    //  create a constructor and call other constructor using this()
    Person (String name) {
        this (name, 0);
    }

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
}
