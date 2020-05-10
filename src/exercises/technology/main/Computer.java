package exercises.technology.main;

public class Computer extends AbstractEntity {

    private String manufacturer;
    private double ram;
    private boolean isOsCurrent = false;

    public Computer(String aManufacturer, double aRam) {
        super();
        manufacturer = aManufacturer;
        ram = aRam;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public boolean isOsCurrent() {
        return isOsCurrent;
    }

    public void setOsCurrent(boolean osCurrent) {
        isOsCurrent = osCurrent;
    }

    public void upgradeRam() {
        if(ram + 8 >=64) {
            ram = 64;
        } else {
            ram +=8;
        }
    }

    public void upgradeOs() {
        isOsCurrent = true;
    }
}
