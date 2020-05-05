package com.company.devices;

public class Car {
    public String model;
    public String producent;
    public Integer yearOfProduction;
    public Double value;

    public String toString(){
        return model + "" + producent + "" + yearOfProduction;
    }
}
