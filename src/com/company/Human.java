package com.company;

import com.company.devices.Car;

import java.sql.Timestamp;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    private Car car;
    private Double salary = 1000.0;
    Timestamp lastCheckDate;

    public Car getCar(){
        return car;
    }

    public void setCar(Car car){
        if (this.salary > car.value){
            System.out.println("Purchase was successful.");
            this.car = car;
        } else if (this.salary * 12 > car.value){
            System.out.println("U managed to buy it on credit.");
            this.car = car;
        } else {
            System.out.println("U are too poor, find a way to earn more money.");
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
}
