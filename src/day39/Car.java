package day39;

public class Car {

    int year ;
    String model ;
    String make ;
    String color ;

    // instance method are tied to the object
    // it does not have static keyword
    // we need an object when we call them


    // this a template ! we cannot run it

    // this below is BEHAVIOR

    public void goForward () {
        System.out.println( make + " going forward");
    }

    // the whole point of INStance method is you need an object with its attributes
    // thats why no STATIC!!!
    // if it is static there is no need for OBject to call
    // this method BELONGS TO THE OBJECT



    ///TAsk 1 : how old is this car?

    public void printCarAge () {
        System.out.println("car age : " + (2020 - year));
    }

    // Lets create 1 method that accepts parameter
    // Task : create the method to change the color

    public void changeColor (String newColor) {
        //write bunch of code here to validate user is actually passing correct color
        // ex: red, blue,
        // abc , efg is NOT!

        color = newColor ;

    }


}
