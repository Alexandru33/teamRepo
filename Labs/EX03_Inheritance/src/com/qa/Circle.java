package com.qa;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, String colour, double x, double y,
                  double radius) {
        super(name, colour, x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius= " + radius +
                ", area = " + getArea() +
                ", centre point = " + getCentrePoint() +
                " }";
    }

    @Override
    public double getArea() {
        return radius*radius* Math.PI;
    }

    @Override
    public Point getCentrePoint() {
        return new Point(getX(), getY());
    }
}
