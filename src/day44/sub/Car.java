package day44.sub;

import day25.CheckArrayIsSortedOrNOt;
import day44.Vehicle;

public class Car extends Vehicle {

    // when you are in different package youhave to import class (?)
    // our sub package is inside the package.. but we have to show it to java still
    // even if they are both public

    // all access modifier we talked baout they were inside the class
    // we did not talk about public class Vehicle

    // what car has that train does not have?
    // they are becoming its attributes:
    
    // default access modifier are aceble only in the same pakage!
    // we didnot inherit String make: because it has default access modifier 
    // we didn ot inherit private int year .. because it is private 
    
    int mileage ;

    public static void main(String[] args) {

        Car c1 = new Car () ;
        c1.mileage = 39637 ;
        c1.make = "Toyota Corolla" ;
        System.out.println("c1.make = " + c1.make);

        System.out.println("c1.mileage = " + c1.mileage);
        
        
        c1.setYear(2016);
        System.out.println("c1.getYear() = " + c1.getYear());
    }
}
