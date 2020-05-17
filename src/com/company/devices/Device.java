package com.company.devices;

public abstract class Device {
    public String model;
    public String producent;
    public Integer yearOfProduction;

    public String toString(){
        return model;
    }

    public abstract void turnOn();
}
