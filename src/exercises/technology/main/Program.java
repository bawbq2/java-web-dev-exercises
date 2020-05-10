package exercises.technology.main;

import org.junit.Before;

public class Program {

    public static void main (String[] args) {
        Computer dellPc= new Computer("Dell", 16);
        Laptop lenovoLaptop = new Laptop(17, "Lenovo", 8);
        SmartPhone iPhone = new SmartPhone("Verizon", 7, "Apple", 6);
        Computer hpLaptop = new Computer("HP", 8);

        System.out.println(dellPc.getId());
        System.out.println(lenovoLaptop.getId());
        System.out.println(iPhone.getId());
        System.out.println(hpLaptop.getId());
    }
}
