package day39;

public class CarCreation {

    public static void main(String[] args) {
        // Create car object using Class
        // or
        // Get an instance of Car class

         Car transport = new Car () ;

         transport.color = "blue" ;
         transport.make = "Audi";
         transport.model = "Q7";
         transport.year = 2020;

        System.out.println("I have " + transport.make + " " + transport.model +
                " That was made in " + transport.year);

        Car car2 = new Car();
        car2.year = 2017;
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "black";
        System.out.println("car2.make = " + car2.model);
        System.out.println("car2.color = " + car2.color);

        car2.year = 2020;
        System.out.println("car2 year = " + car2.year);

        // I WANT TO CHANGE THE COLOR OF Hyundai TO THE COLOR OF Toyota
        car2.color = transport.color;  //car2.color = "white" ;

        // TO USE IN DIFFERENT PACKAGE :
        // import day39.yourClassName

        // get an instance out of class mean create and OBJECT  of the class






    }
}
