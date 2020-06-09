package com.company.devices;

import com.company.creatures.Human;

import java.util.concurrent.ExecutionException;

public abstract class Car extends Device implements Comparable<Car> {
    public Double value;

    public Car(String model, String producent, Integer yearOfProduction, Double price) {
        super();
    }

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
        if (!seller.haveCar(this)) {
            throw new Exception("There is no car.");
        }
        if (!buyer.haveFreeSpace()){
            throw new Exception("Not enough place for car.");
        }
        if (buyer.getCash() < price){
            throw new Exception("Not enough money.");
        }

        seller.deleteCar(this);
        buyer.addCar(this);
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        System.out.println("Transaction successful.");
    }

    public abstract void refuel();

    @Override
    public int compareTo(Car o){
        return (this.yearOfProduction-o.yearOfProduction);
    }
}
