/**
 * The purpose of this class is to model a television
 * @author pradhanaroonav
 * 02/13/2020
 */


public class Television {

    private final String MANUFACTURER; // marked as final once set cannot be modified for the object
    private final int SCREEN_SIZE; // marked as final once set cannot be modified for the object
    private boolean powerOn;
    private int channel;
    private int volume;

    // constructor to initialize all the instance variables of the object
    public Television(String brand, int size) {
        this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }
    // getter method that returns the volume of the television
    public int getVolume() {
        return volume;
    }
    // getter method that returns the channel
    public int getChannel() {
        return channel;
    }
    // getter method to return the manufacturer name
    public String getManufacturer() {
        return MANUFACTURER;
    }

    // getter method to return the screen size
    public int getScreenSize() {
        return SCREEN_SIZE;
    }
    // setter method to set the channel
    public void setChannel(int channel) {
        this.channel = channel;
    }
    // toggles the power on and off
    public void power() {
        this.powerOn = !powerOn;
    }
    // increase the volume by 1 unit
    public void increaseVolume() {
        volume += 1; // increase teh volume by 1
    }
    // decrease the volume by 1 unit
    public void decreaseVolume() {
        volume -= 1; // decrease the volume by 1
    }


}

