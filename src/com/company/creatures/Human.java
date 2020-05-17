package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.sql.Timestamp;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    private Car car;
    private Double salary = 1000.0;
    Timestamp lastCheckDate;
    public Phone iphone;
    public double cash = 1000.0;

    public Human(String species) {
        super(species);
    }

    public Human() {
        super("Human");
    }

    public Car getCar(){
        return car;
    }

    public void setCar(Car car){
        this.car = car;
    }

    public void removeCar(Car car) throws Exception {
        boolean removed = false;
        if (canSellDevice(car)){
            this.car = null;
            removed = true;
        } if (!removed){
            throw new Exception("U don't have car.");
        }
    }

    public void setIphone(Phone iphone){
        this.iphone = iphone;
    }

    public void removeIphone(Phone iphone) throws Exception {
        boolean removed = false;
        if (canSellDevice(iphone)) {
            this.iphone = null;
            removed = true;
        } if (!removed) {
            throw new Exception("U don't have phone.");
        }
    }

    public Double getSalary(Double salary){
        lastCheckDate = new Timestamp(System.currentTimeMillis());
        System.out.println("Last salary was sent: " + lastCheckDate);
        System.out.println("Last salary was: " + salary);
        return this.salary;
    }

    public Double setSalary(Double salary){
        if (salary < 0){
            System.out.println("I don't think that's possible");
        } else {
            System.out.println("New data has been sent to the accounting system.");
            System.out.println("U need to pick up annex from Mrs Hanna. U can find her at human resources.");
            System.out.println("Don't try to be sneaky with your income, ZUS and US already know everything.");
        }
        return this.salary;
    }

    public String toString(){
        return firstName+""+lastName;
    }

    public boolean canSellAnimal(Animal animal){
         return this.pet == animal;
    }

    public boolean canSellDevice(Device device){
        if (device instanceof Car){
            return this.car == device;
        } else if (device instanceof Phone){
            return this.iphone == device;
        }
        return false;
    }

    public boolean canBuyDevice(Device device, Double price){
        return price <= this.cash;
    }

    public boolean canBuyAnimal(Animal pet, Double price) {
        return price <= this.cash;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        throw new Exception("Boi, selling hoomans is forbidden!");
    }
}
