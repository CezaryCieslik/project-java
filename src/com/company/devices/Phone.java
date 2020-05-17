package com.company.devices;

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
}
