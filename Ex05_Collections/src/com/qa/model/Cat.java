package com.qa.model;

public class Cat extends Animal {

    // do not need to define private variables like name and age here
    // because Cat inherits from Animal
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Oh. It's you. Hello." + getName();
    }

    @Override
    public String move() {
        return "If you insist...";
    }

    public String toString(){
        return "Cat: " + super.toString();
    }
}
