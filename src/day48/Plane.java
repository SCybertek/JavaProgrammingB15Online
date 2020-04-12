package day48;

//we build relationship between class and interface
// using implement keyword! ( compare to extends keyword for class to class )
//it will build parent child relationship (is-a relationship )

//INTERFACE MEANT TO BE A SUPER TYPE!

//we can say plane is - a - flyable
// since we are inheriting abstract method we need to provide body by overriding it


public class Plane implements Flyable{

    String name ;
    int capacity ;
    int speed;


// public abstract void fly () ;

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    // like overriding abstract methods in concrete class
    // we need to provide body

    public static void main(String[] args) {
        Plane p1 = new Plane() ;
        p1.fly();

        //anything static we can access static way
        //including the static field of interface

        System.out.println(  Flyable.HAVE_WING );

        //if we have static field in this class
        // COPY HERE !!!!!

        System.out.println(HAVE_WING);
    }


}
