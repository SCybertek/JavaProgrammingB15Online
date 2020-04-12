package day47;

public class Garage {

    public static void main(String[] args) {

        //abstarct class cannot be instantiated
        // it makes imposible to create an object out of it
       // Car c1 = new Car() ;
            //we cannot do that ..sinceCar class is abstract

            ElectricCar c1 = new ElectricCar() ;
            c1.start();

            //final and abstract ar e2 enemies :
            // final method cannot be overriden
            // abstract method asks to be overridden

        c1.goForward();
        c1.goBackward();

        GasCar abc = new GasCar();
        abc.gasLevel = 200 ;
        abc.goBackward();
        abc.goForward();
        abc.start();
        abc.turn("left");
        abc.year = 2020 ;
        System.out.println("abc.year = " + abc.year);

        c1.accelerate();



        }
}
