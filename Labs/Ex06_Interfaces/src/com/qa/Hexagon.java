package com.qa;

public class Hexagon implements ConsoleLoggable, TimeLoggable{
    @Override
    public void log(String message) {
        TimeLoggable.super.log(message);
    }
}
