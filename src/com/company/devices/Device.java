package com.company.devices;

import com.company.creatures.Human;
import com.company.salleable;

public abstract class Device implements salleable {
    public String model;
    public String producent;
    public Integer yearOfProduction;
    public Double value;

    public String toString(){
        return model;
    }

    public abstract void turnOn();

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
    }
}
