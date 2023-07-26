package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        System.out.println("Multiple result: " + bc.mult(2, 3));

        try{
            System.out.println("Div result: " + bc.div(6, 1));
        } catch (ArithmeticException ae) {
            System.out.println("Calculation error caught");

            // print the error
            System.out.println(ae);
            // show where this error happens
            ae.printStackTrace();
        }

        MyConsoleReader mcr = new MyConsoleReader();
        mcr.readInputPrint();
    }
}
