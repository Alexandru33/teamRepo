package com.qa.model;

public class Dog extends Animal {

    @Override
    public String toString() {
        return "Dog " + super.toString();
    }

    @Override
    public String sayHello() {
        return "Ham Ham";
    }

    @Override
    public String move() {
        return "Yes, sir!";
    }

    public Dog(String name, int age) {
        super(name, age);
    }


}
