package com.qa;

public interface ConsoleLoggable extends Loggable{
    @Override
    default void log(String message) {
        System.out.println( "Console log> " + message);
    };
}
