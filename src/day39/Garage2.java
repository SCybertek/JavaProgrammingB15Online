package day39;

public class Garage2 {

    public static void main(String[] args) {

        // Create car object using Class
        // or
        // Get an instance of Car class

        Car transport = new Car () ;

        transport.color = "white" ;
        transport.make = "Audi";
        transport.model = "Q7";
        transport.year = 2020;
        transport.goForward(); // Audi going forward
        transport.printCarAge();
        transport.changeColor("Blue");
        System.out.println("transport.color = " + transport.color);
        System.out.println("--------------");


        Car car2 = new Car();
        car2.year = 2017;
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "black";

        car2.goForward(); // Hyundaai going forward
        car2.printCarAge();
        System.out.println("THE END");
    }
}
