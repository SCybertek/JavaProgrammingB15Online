package day42;

public class Bike {

    int gear ;
    int speed ;

    public Bike() {
        System.out.println("message from constructor");
        gear = 1 ;
    }

    // if we put void like :
//    public void Bike () {
//        System.out.println("this is not a message from constructor ");
//    }

    // constructor can be public and other


    // constructor is a block of code
    // that has same name as classname
    // and has no return type

   // task: // I wan to be able to set the default gear to any number I specify when object being created

     public Bike( int newGear) {
        gear = newGear ;
        //this.gear = newGear
     }

     // task: // I want the Bike object with both
    //        // speed and gear set the value I specify

    public Bike ( int newGear , int newSpeed) {
        gear = newGear ;
        speed = newSpeed ;
    }
// this does n othing to the gear and speed
    public Bike (String str) {
        System.out.println("accept string!!!");
    }

}
