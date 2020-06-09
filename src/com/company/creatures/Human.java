package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.sql.Timestamp;
import java.util.Arrays;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    private Double salary = 1000.0;
    Timestamp lastCheckDate;
    public Phone iphone;
    public double cash = 1000.0;
    public Car[] garage;
    public Integer DEFAULT_GARAGE_SIZE = 2;


    public Human() {
        super("Human");
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        super("Human");
        this.garage = new Car[garageSize];
    }

    public Car getCar(Integer carSpace) {
        return garage[carSpace];
    }

    public void setCar(Car car, Integer carSpace) {
        this.garage[carSpace] = car;
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public double valueOfCars() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }
        return sum;
    }

    public void sortCars(){
        Arrays.sort(this.garage);
    }

    public boolean haveCar(Car newCar) {
        for (Car car : garage){
            if (car == newCar){
                return true;
            }
        }
        return false;
    }

    public boolean haveFreeSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void deleteCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) throws Exception {
        if (this.haveFreeSpace()) {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = newCar;
                    break;
                }
            }
        } else {
            throw new Exception("There is not enough place for that");
        }
    }


    /*public void removeCar(Car car) throws Exception {
        boolean removed = false;
        if (canSellDevice(car)){
            this.garage = null;
            removed = true;
        } if (!removed){
            throw new Exception("U don't have car.");
        }
    }*/



    public void setIphone(Phone iphone){
        this.iphone = iphone;
    }

    /*public void removeIphone(Phone iphone) throws Exception {
        boolean removed = false;
        if (canSellDevice(iphone)) {
            this.iphone = null;
            removed = true;
        } if (!removed) {
            throw new Exception("U don't have phone.");
        }
    }*/

    public Double getCash(){
        return cash;
    }

    public void setCash(Double cash) throws Exception {
        if (cash >= 0.0) {
            this.cash = cash;
        } else {
            throw new Exception("You are broke.");
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

    /*public boolean canSellDevice(Device device){
        if (device instanceof Car){
            return this.car == device;
        } else if (device instanceof Phone){
            return this.iphone == device;
       }
        return false;
    }*/

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

    public boolean owner(Car car) throws Exception{
        throw new Exception("pls work");
    }
}
