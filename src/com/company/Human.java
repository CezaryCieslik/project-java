package com.company;

import java.sql.Timestamp;
import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Car car;
    private Double salary = 1000.0;
    Timestamp lastCheckDate;
    private Double raise;

    void setCar(Car car){
        this.car = car;
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
}
