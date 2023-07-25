package com.qa;

public class Car {
    private String model;
    private double capacity;
    private String engine;

    public Car(String model, double capacity, String engine) {
        this.model = model;
        this.capacity = capacity;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", engine='" + engine + '\'' +
                '}';
    }
}
