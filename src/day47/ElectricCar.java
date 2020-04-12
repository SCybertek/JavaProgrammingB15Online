package day47;

public class ElectricCar extends Car {

    // if you inherit a Car that has abstract idea. you must provide the implementation of the idea

    int batteryLevel ;


    @Override
    public void goForward () {
        System.out.println("Car is going forward");
    }

    @Override
    public void goBackward () {
        System.out.println("car is going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("turning " + direction);
    }

    @Override
    public void start() {
        System.out.println("This is how electric car starts ");

    }



        }


