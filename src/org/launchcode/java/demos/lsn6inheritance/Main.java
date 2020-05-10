package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main (String[] args) {

        //intro to subclass
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        //constructor
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());
        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        //inheritance
        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

        //abstraction
//        Cat salem = new Cat(8);

        //casting
        Cat suki = new HouseCat("Suki", 8);
        suki.noise();
        // doesn't work because isSatisfied() does not exist in Cat
//        suki.isSatisfied();
        //but this works, but we should only do it if we are 100% sure that suki is a Housecat
        ((HouseCat) suki).isSatisfied();

    }
}
