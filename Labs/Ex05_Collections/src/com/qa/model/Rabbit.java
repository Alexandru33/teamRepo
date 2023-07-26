package com.qa.model;

public class Rabbit extends Animal {


    @Override
    public String sayHello() {
        return "Snuffle Snuffle";
    }

    @Override
    public String move() {
        return "Hop hop hop!";
    }

    @Override
    public String toString() {
        return "Rabbit " + super.toString();
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }
}
