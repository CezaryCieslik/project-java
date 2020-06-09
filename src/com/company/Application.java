package com.company;

public class Application {
    public String name;
    public Double version;
    public Double price;

    public Application(String name, Double version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getVersion() {
        return version;
    }

    public Double getPrice() {
        return price;
    }
}
