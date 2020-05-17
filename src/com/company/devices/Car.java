package com.company.devices;

public class Car extends Device {
    public Double value;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producent='" + producent + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Brum...");
    }
}
