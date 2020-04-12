package day44;


// what is inherited from super class:
//fields and methods that visible to sub class are inherited
// constructors are not inherited

public class Train extends Vehicle {
    //relationship build between these 2 classes
    // Vehicle is SUper class / more general
     // Train is Sub class/ more specific
    // only thing we did not get is CONstructor

    // you cannot inherit PRIVATE !!!


int wagonCount ;
public void makeChoChoSound () {
    System.out.println("Chooooo Choooo");
}

    public static void main(String[] args) {



    Train t1 = new Train();
    t1.makeChoChoSound();

// these attributes we got from vehicle
    t1.make = "Thomas" ;
    t1.year = 1999 ;
    //calling the method we got from Vehicle

        t1.start();
        t1.goForward();
    }
}
