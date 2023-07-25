package com.qa;

public class Rectangle extends Shape{

    private double width, height;


    public Rectangle(String name, String colour, double x, double y, double width, double height) {
        super(name, colour, x, y);

        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public Point getCentrePoint() {
        return  new Point( (getX() + width/2 ) , ( getY() + height/2 ) ) ;
    }


    public boolean isSquare ()
    {
        return (height == width ? true :  false) ;
    }

}
