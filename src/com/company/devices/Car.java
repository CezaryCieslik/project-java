package com.company.devices;

import com.company.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if (seller.canSellDevice(this) && buyer.canBuyDevice(this,price)){
            buyer.cash -= price;
            seller.cash += price;
            seller.removeCar(this);
            buyer.setCar(this);
            System.out.println("Transaction was successful.");
        } else System.out.println("Transaction failed.");
    }
}
