package day47;

public abstract class Shape {

    String name ;
    int area ;

    // add constructor to set the value:

//    public Shape () {
//
//    }

    public Shape (String name) {
        this.name = name ;
    }

    //abstract method to calculate the area :

    public abstract void calculateArea () ;

    /// I want to enfore subclasses to provide toString Method
    public abstract String  toString () ;






}
