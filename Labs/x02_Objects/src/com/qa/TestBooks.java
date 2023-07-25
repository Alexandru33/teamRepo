package com.qa;

public class TestBooks {
    public static void main(String[] args) {

        Shirt[] shirtArray = new Shirt[3];
        shirtArray[0] = new Shirt("red", "XL" , 10);
        shirtArray[1] = new Shirt("black", "L" , 12);
        shirtArray[2] = new Shirt("brown", "S" , 7);

        for ( int x = 0 ;  x < shirtArray.length; x++)
        {
            System.out.println(shirtArray[x]);


        }


        String[] arr = {"Mike", "Martina", "Peter"};
        Book b1 = new Book("title", arr, 10.99);
        Book b2 = new Book("title2", arr, 5.99);
        Book b3 = new Book("title3", arr, 1.00);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Book[] bookArray = new Book[3];
        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;


        for( int x= 0 ; x< bookArray.length ; x++)
        {
            System.out.println(bookArray[x]);
        }

    }



}
