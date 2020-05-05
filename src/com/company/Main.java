package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

	Human me = new Human();
	me.firstName = "Cezary";
	me.lastName = "Cieślik";
	me.pet = new Animal( "dog");

	me.pet.feed();
	me.pet.feed();
	me.pet.takeForAWalk();
	me.pet.feed();
    me.pet.takeForAWalk();

    Car Rusty = new Car();
    Rusty.producent = "Scoda";
    Rusty.model = "Rapid";
    Rusty.yearOfProduction = 2015;

    me.getSalary(3000.0);
    me.setSalary(-1.0);

    Phone smart = new Phone();
    smart.system = "Android";
    smart.model = "Pocophone";
    smart.producent = "Xiaomi";

    Animal doggo = new Animal("dog");
    doggo.name = "Jaskier";

    System.out.println(me);
    System.out.println(Rusty);
    System.out.println(smart);
    System.out.println(doggo);
    }
}
