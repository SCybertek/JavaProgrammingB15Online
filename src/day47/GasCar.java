package day47;
// this is called concrete class
// this sub class is implimenting abstract super class

public class GasCar extends Car {

    int gasLevel ;

    @Override
    public void start() {
        System.out.println("gas car starts");
    }

    @Override
    public void goForward() {
        System.out.println("gas car goes forward");
    }

    @Override
    public void goBackward() {
        System.out.println("gas car goes backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("gas car goes to " + direction);
    }
}
