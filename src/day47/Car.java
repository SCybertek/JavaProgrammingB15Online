package day47;

//I dont need to create car object using this class
//I only want this class to be super class
//that provides reusable fields and methods for sub classes

//this class is designed to be a super class


public abstract class Car {

    int year ;
    String brand ;

    public abstract void start() ; // no {  ... } no body
    // it ends with ;
    //it meanst to be overridden to provide body!! in sub class



    //abstract class has to have a child

    // add:
    //go backward
    //goForward

    public abstract void goForward () ;

    public abstract void goBackward () ;

    public abstract void turn ( String direction ) ;

    public void accelerate () { // ; cannot end like abstract method
        System.out.println("non abstract method can be in abstract class- cars can accelerate");
    }

    public static void carThing () {
        System.out.println("static method inside abstract method");
    }


}
