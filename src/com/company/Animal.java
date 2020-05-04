package com.company;

public class Animal {
    final String species;
    private Double weight;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;

    public Animal(String species) {
        this.species = species;
        if (species.equals("dog")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
    }

    void feed() {
        if (weight <= 0) {
            System.out.println("U can't feed dead animal...");
        } else {
            weight++;
            System.out.println("Not too much, i don't wanna be fat, i weigh now" + this.weight );
        }
    }

    void takeForAWalk() {
        weight--;
        if (weight <=0) {
            System.out.println("U too will die of hunger!");
        } else {
            System.out.println("I love u human, i weigh now" + this.weight );
        }
    }
}
