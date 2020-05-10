package exercises.technology.main;

import exercises.technology.main.Computer;

public class Laptop extends Computer {

    private double screenSize;
    private double batteryPercentage = 100;

    public Laptop(double aScreenSize, String aManufacturer, double aRam){
        super(aManufacturer, aRam);
        screenSize = aScreenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(double batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public void useLaptop(double hours) {
        if(batteryPercentage - (20*hours) <=0) {
            batteryPercentage = 0;
        } else {
            batteryPercentage = batteryPercentage - (20*hours);
        }
    }
}
