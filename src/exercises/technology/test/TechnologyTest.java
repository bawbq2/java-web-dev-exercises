package exercises.technology.test;

import org.junit.Before;
import org.junit.Test;
import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import exercises.technology.main.SmartPhone;
import exercises.technology.main.Program;
import static org.junit.Assert.*;

public class TechnologyTest {

    Computer test_computer;
    Laptop test_laptop;
    SmartPhone test_smartphone;

    @Before
    public void createComputerObject(){
        test_computer = new Computer("Dell", 16);
    }

    @Before
    public void createLaptopObject(){
        test_laptop = new Laptop(17, "Lenovo", 8);
    }

    @Before
    public void createSmartPhoneObject() {
        test_smartphone = new SmartPhone("Verizon", 7,"Apple",6);
    }

    //Computer Tests
    @Test
    public void upgradeRamWorks(){
        test_computer.upgradeRam();
        assertEquals(test_computer.getRam(),24,0.001);
    }

    @Test
    public void computerCannotHaveMoreThan64GbOfRam(){
        test_computer.setRam(62);
        test_computer.upgradeRam();
        assertEquals(test_computer.getRam(),64,0.001);
    }

    //Laptop Tests
    @Test
    public void useLaptopWorks(){
        test_laptop.useLaptop(2);
        assertEquals(test_laptop.getBatteryPercentage(),60,0.001);
    }

    @Test
    public void useLaptopWorksWhenBatteryGoesToZero() {
        test_laptop.useLaptop(10);
        assertEquals(test_laptop.getBatteryPercentage(),0,0.001);
    }

    //SmartPhone Tests
    @Test
    public void smartPhoneInheritsBothSupers(){
        assertEquals(test_smartphone.getManufacturer(),"Apple");
    }
    @Test
    public void overrideUpgradeRamMethodWorksForSmartphone(){
        test_smartphone.upgradeRam();
        assertEquals(test_smartphone.getRam(),6,0.001);
    }

    @Test
    public void dropPhoneMethodWorks(){
        test_smartphone.dropPhone();
        assertEquals(test_smartphone.isScreenCracked(), true);
    }

    @Test
    public void overrideUseLaptopMethodWorksForSmartphone(){
        test_smartphone.useLaptop(2);
        assertEquals(test_smartphone.getBatteryPercentage(),90,0.001);
    }

    @Test
    public void overrideUseLaptopMethodDefaultsToSuperIfCarrierIsNotVerizon(){
        test_smartphone.setWirelessCarrier("AT&T");
        test_smartphone.useLaptop(2);
        assertEquals(test_smartphone.getBatteryPercentage(), 60,0.001);
    }
}
