package com.company.creatures;

import com.company.salleable;

public abstract class Animal implements salleable, Feedable {
    String species;
    private Double weight = 10.0;
    public String name;
    public Double foodWeight;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;

    public Animal(String species) {
        this.species = species;
        if (species.equals("dog")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
    }

    public Animal() {

    }

   // void feed() {
   //     if (weight <= 0) {
   //         System.out.println("U can't feed dead animal...");
   //     } else {
   //         weight++;
   //         System.out.println("Not too much, i don't wanna be fat, i weigh now " + this.weight );
   //     }
   // }

    public void takeForAWalk() {
        weight--;
        if (weight <=0) {
            System.out.println("U too will die of hunger!");
        } else {
            System.out.println("I love u human, i weigh now " + this.weight );
        }
    }

    public String toString(){
        return name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.canSellAnimal(this) && buyer.canBuyAnimal(this,price)){
            buyer.cash -= price;
            seller.cash += price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Transaction was successful.");
        } else System.out.println("Transaction failed.");
    }

    @Override
    public void feed(){
        feed(1.2);
    }

    public void feed(Double foodWeight){
        if (weight <=0){
            System.out.println("U can't feed dead animal...");
        } else {
            weight += foodWeight;
            System.out.println(this.weight );
        }
    }
}
