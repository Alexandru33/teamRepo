package com.qa;

public class Shirt {

    private String colour;
    private String size;
    private int price;

    @Override
    public String toString() {
        return "Shirt{" +
                "colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public Shirt(String colour, String size, int price) {
        this.colour = colour;
        this.size = size;
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
