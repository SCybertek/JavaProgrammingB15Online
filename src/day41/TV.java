package day41;

public class TV {

    //attributes :

    String brand ;
    boolean isOn ;
    int currentChannel ;
    // range (1 -50)


    // behaviours :
//    turnOn

    public void turnOn () {
        if (isOn == false) { // if tv is fals ethen turn it on
            System.out.println("Turning TV on");
            isOn = true;
        }
    }

//    turnOff

    public void turnOff () {
        if (isOn == true) {
            System.out.println("Turning TV off");
            isOn = false;
        }
    }
//    getcurrentChannel

    public int getCurrentChannel () { // is it getting something ? or does it need to get some parameters?
        //naming is very important

        return currentChannel ;
    }
//    setcurrentChannel (newChannelNumber)

    public void setCurrentChannel (int newChannel) {
        if ((isOn == true) && (newChannel>=1 && newChannel <=50)) {
            this.currentChannel = newChannel ;
        } else {
            System.out.println("turn your tv on first!");
        }
    }

    //if my channel is out of range then get out of th emethod
    //!!!!!COOpyy : break for loop and switch
//    moveForward

    public int moveForward () {

        return currentChannel + 1 ;
    }
//    moveBackward

    public int moveBackward () {

        return  currentChannel - 1 ;
    }

    @Override
    public String  toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
