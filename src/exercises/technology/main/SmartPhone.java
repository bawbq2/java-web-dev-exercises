package exercises.technology.main;

public class SmartPhone extends Laptop {

    private String wirelessCarrier;
    private boolean isScreenCracked = false;

    public SmartPhone(String aWirelessCarrier,double aScreenSize, String aManufacturer, double aRam){
        super(aScreenSize, aManufacturer, aRam);
        wirelessCarrier = aWirelessCarrier;
    }

    public String getWirelessCarrier() {
        return wirelessCarrier;
    }

    public void setWirelessCarrier(String wirelessCarrier) {
        this.wirelessCarrier = wirelessCarrier;
    }

    public boolean isScreenCracked() {
        return isScreenCracked;
    }

//    public void setScreenCracked(boolean screenCracked) {
//        isScreenCracked = screenCracked;
//    }

    public void dropPhone(){
        isScreenCracked = true;
    }

    // you cannot upgrade RAM on a smart phone
    @Override
    public void upgradeRam() {
        this.setRam(this.getRam());
    }

    //Verizon has better signal so you don't roam and use more battery
    @Override
    public void useLaptop(double hours) {
        if (wirelessCarrier == "Verizon") {
            if(this.getBatteryPercentage() - (5*hours) <=0) {
                this.setBatteryPercentage(0);
            } else {
                this.setBatteryPercentage(this.getBatteryPercentage() - (5*hours));
            }
        } else {
            super.useLaptop(hours);
        }
    }
}
