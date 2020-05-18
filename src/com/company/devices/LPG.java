package com.company.devices;

public class LPG extends Car {


    public LPG(String model, String producent, Integer yearOfProduction){
        super(model,producent,yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Your car has been refueled.");
    }
}
