package com.qa;

import java.time.LocalDateTime;

public interface TimeLoggable extends Loggable {
    @Override
    default void log(String message){

        System.out.println( LocalDateTime.now() + message );
    }
}
