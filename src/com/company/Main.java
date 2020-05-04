package com.company;

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
    }
}
