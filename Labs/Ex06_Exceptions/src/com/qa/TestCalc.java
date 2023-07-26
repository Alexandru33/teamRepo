package com.qa;

import java.sql.SQLOutput;

public class TestCalc {

    public static void main(String[] args) {
        BadCalc bc = new BadCalc();


        System.out.println("Multiplication of 2 and 4 result: " +  bc.mult(2,4));

        try {

            System.out.println("Division of 2 and 2 result: " + bc.div(2, 0));
        }
        catch( ArithmeticException ae)
        {
            System.out.println("Calculation error caught");
        }
    }
}
