package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main  {

    public static void main(String[] args) throws Exception {

	Human me = new Human();
	me.firstName = "Cezary";
	me.lastName = "Cieślik";
	me.pet = new Animal() {
        @Override
        public void takeForAWalk() {
            super.takeForAWalk();
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        public void feed() {
            super.feed();
        }

        @Override
        public void feed(Double foodWeight) {
            super.feed(foodWeight);
        }
    };
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



    System.out.println(me);
    System.out.println(Rusty);
    System.out.println(smart);

    smart.turnOn();
    Rusty.turnOn();

    me.pet.sell(me, boi, 200.0);
    System.out.println(me.pet + " " + me.cash);
    System.out.println(boi.pet + " " + boi.cash);

    me.iphone.sell(me, boi, 500.0);
    System.out.println(me.iphone+""+me.cash);
    System.out.println(boi.iphone+""+boi.cash);

    Pet cat = new Pet("Cat");
    cat.feed(1.0);
    }
}
