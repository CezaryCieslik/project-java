package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.*;

public class Main  {

    public static void main(String[] args) throws Exception {

	Human me = new Human(2);
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
	Human boi = new Human(1);
	boi.firstName = "Alfred";
	boi.lastName = "Maj";

	Human boi2 = new Human(3);
	boi2.firstName = "Jan";
	boi2.lastName = "Kowalski";

	me.iphone = new Phone();


	me.pet.feed();
	me.pet.feed();
	me.pet.takeForAWalk();
	me.pet.feed();
    me.pet.takeForAWalk();

    Car rustyOne = new LPG("Rapid","Scoda",2010,5000.0);
    Car cleanOne = new Disel("Octavia","Scoda",2012,6000.0);
    Car dirtyOne = new Electric("Fabia","Scoda", 2015,7000.0);

    /*me.getSalary(3000.0);
    me.setSalary(-1.0);

    Phone smart = new Phone();
    smart.system = "Android";
    smart.model = "Pocophone";
    smart.producent = "Xiaomi";



    System.out.println(me);
    System.out.println(smart);

    smart.turnOn();

    me.pet.sell(me, boi, 200.0);
    System.out.println(me.pet + " " + me.cash);
    System.out.println(boi.pet + " " + boi.cash);

    me.iphone.sell(me, boi, 500.0);
    System.out.println(me.iphone+""+me.cash);
    System.out.println(boi.iphone+""+boi.cash);

    Pet cat = new Pet("Cat");
    cat.feed(1.0);

    boi.iphone.installAnApp("TESTER");
    boi.iphone.installAnApp("TESTER","CHICKEN");
    boi.iphone.installAnApp("TESTER","CHICKEN","bronz4eva.au");

    List<String> appTest = new ArrayList<String>();
    appTest.add("Messenger");
    appTest.add("YouTube");
    appTest.add("Steam");
    boi.iphone.installAnApp(appTest);

    URL apptest = new URL("ABC", "POOP","pifpaf.com");
    boi.iphone.installAnApp(apptest);

    rustyOne.refuel();
    System.out.println();
    cleanOne.refuel();
    System.out.println();
    dirtyOne.refuel();
    System.out.println();
*/
    me.setCar(rustyOne,1);
    rustyOne.humanAsoldToHumanB(me,boi);
    System.out.println(rustyOne.numberOfTransactionOnThisCar());
    }
}
