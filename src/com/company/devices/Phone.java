package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {
    public String system;

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producent='" + producent + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Ding ding...");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if (seller.canSellDevice(this) && buyer.canBuyDevice(this,price)){
            buyer.cash -= price;
            seller.cash += price;
            seller.removeIphone(this);
            buyer.setIphone(this);
            System.out.println("Transaction was successful.");
        } else System.out.println("Transaction failed.");
    }
}
