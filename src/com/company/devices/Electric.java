package com.company.devices;

public class Electric extends Car {
    public Electric(String model, String producent, Integer yearOfProduction, Double price) {
        super(model, producent, yearOfProduction, price);
    }

    @Override
    public void refuel() {
        System.out.println("Your car has been recharged.");
    }
}
