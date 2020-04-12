package day45;

public class Fruit {

    //LESSON: 1- always create no arg constructor in SUPER CLASS!!!
    //to avoid unnecessary error
    //super class no Args cons!

    // 2- to understand default behavior :
    // this is default behavior: first there is always default const
    // second it is calling super!


    public Fruit() {
        System.out.println("fruit consructor message ");
    }

    //if we comment out this one.. our child constructor is getting RED !!


    public Fruit(String str) {
        System.out.println("one arg Fruit constructor");
    }
}

// if a class is not extend any class using extend class
// it automatically eztends to super!
// who is a parent to all in Java?
// it is object class! !!all classes are a subclass of object class!!!


