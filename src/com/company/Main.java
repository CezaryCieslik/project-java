package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

	Human me = new Human();
	me.firstName = "Cezary";
	me.lastName = "Cieślik";
	me.pet = new Animal( "dog");

	Human boi = new Human();
	boi.firstName = "Alfred";
	boi.lastName = "Maj";

	Human boi2 = new Human();
	boi2.firstName = "Jan";
	boi2.lastName = "Kowalski";

	me.iphone = new Phone();


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

    me.pet = doggo;

    System.out.println(me);
    System.out.println(Rusty);
    System.out.println(smart);
    System.out.println(doggo);

    smart.turnOn();
    Rusty.turnOn();

    me.pet.sell(me, boi, 200.0);
    System.out.println(me.pet + " " + me.cash);
    System.out.println(boi.pet + " " + boi.cash);

    me.iphone.sell(me, boi, 500.0);
    System.out.println(me.iphone+""+me.cash);
    System.out.println(boi.iphone+""+boi.cash);

    me.sell(boi2, boi, 50.0);
    }
}
