package com.company.devices;

import com.company.creatures.Human;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public abstract class Car extends Device implements Comparable<Car> {
    public Double value;
    public ArrayList<Human> owners;
    public ArrayList<Integer> transactions;
    public Integer transact;
    static Integer DEFAULT_NUMBER_OF_TRANSACTIONS = 0;


    public Car(String model, String producent, Integer yearOfProduction, Double price) {
        super();
        this.transact = DEFAULT_NUMBER_OF_TRANSACTIONS+1;
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
        if (!seller.haveCar(this) && !seller.owner(this)){
            throw new Exception("This car is stolen");
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

    public ArrayList<Human> getOwners(){
        return owners;
    }

    public Human getCurrentOwner(){
        return this.owners.get(this.owners.size()-1);
    }

    public void checkOwner (Human owner){
        if (this.owners.contains(owner)){
            for (Human owners : getOwners()) {
                System.out.println(owners.firstName + "" + owners.lastName + " ");
            }
        }else {
            System.out.println("No owner.");
        }
    }

    public boolean wasOwner(Human owner){
        return this.owners.contains(owner);
    }

    public void humanAsoldToHumanB(Human a, Human b) {
        if (wasOwner(a) && wasOwner(b)){
            System.out.println("Was sold.");
        }else {
            System.out.println("Wasn't sold.");
        }
    }

    public int numberOfTransactionOnThisCar(){
        return this.transactions.size();
    }
}
