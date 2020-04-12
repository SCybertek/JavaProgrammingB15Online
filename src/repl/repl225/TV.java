package repl.repl225;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false ;
    String brand = "undefined";

    public TV () {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV (String brand) {
        this.brand = brand ;
        System.out.println("Creating TV object using 1 Args- constructor");
    }

    //getters and setters :
    public int getChannel () {
        return channel ;
    }
    public void setChannel (int channel) { // add condition channel cannot be - or 0  and channel <120
        if ( (this.on == false ) || (channel <= 0) || (channel > 120) ) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else {
            this.channel = channel ;
        }
    }

    public int getVolumeLevel () {
        return volumeLevel ;
    }
    public void setVolumeLevel (int volumeLevel) {// add condition volume should be between 1 and 7 and TV has tobe on
        if( (this.on == false) || (volumeLevel<1 || volumeLevel >7) ) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }else {
            this.volumeLevel = volumeLevel ;
        }
    }

    public String getBrand () {
        return  brand;
    }
    public void setBrand (String brand) {
        this.brand = brand ;
    }
    //methods : channelUp() and channelDown()
    public void channelUp () {
        this.channel++ ;
    }
    public void channelDown() {
        this.channel-=1;
    }
    //volumeUp and volmeDown
    public void volumeUp () {
        this.volumeLevel++;
    }
    public void volumeDown () {
        this.volumeLevel -=1;
    }
    //on and off:
    public void isOn() {//checking the status
        if (this.on == true) {
            this.on = true;
        }else {
            this.on = false;
        }
    }
    public void turnOn () {
        if (this.on == true) {
            System.out.println("TV is already ON");
        } else {
            this.on = true ;
        }
    }

    public void turnOff() {
        if (this.on == false) {
            System.out.println("TV is already OFF");
        }else {
            this.on = false;
        }

    }


}
