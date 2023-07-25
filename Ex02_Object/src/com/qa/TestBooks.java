package com.qa;

public class TestBooks {
    public static void main(String[] args) {
        String[] arr = {"Margaret", "J.R.R Tolkien", "Peter"};
        Book[] bookArr = new Book[3];

        Book b1 = new Book("Gone with the Wind", arr, 39.99);
        Book b2 = new Book("The load of the Rings", arr, 99.99);
        Book b3 = new Book("Oak tree", arr, 19.99);

        bookArr[0] = b1;
        bookArr[1] = b2;
        bookArr[2] = b3;

        for (int i = 0; i < bookArr.length; i++) {
            System.out.println(bookArr[i]);
        }
    }
}
