package day45;

public class Apple extends Fruit {



    // even if we comment out Apple constructore
    //we will still have a default one:
    // the default one of child is calling super() ALWAYS !!

    public Apple () {
        super("abc");// it HAS TO BE IN FIRST STATEMNET!
        // since we have 1 arg const. we have to put it .. or completely delete all const in Fruit class (super) so that we have 2 default in super and in child class!!IMPORTANT
    }
    //this is default behavior: first there is always default const
    // second it is calling super!


    //but why?
    // to write a shorter code



//    public Apple () {
//        // I want to reuse the functionality already written in
//        //super class constructor
//        // Constructor is not inherited
//        // we can CALL it
//        //super(); // this keyword helps to call super class constructor
//
//        // how to call superclass cons with 1 arg
//
//        super("test");
//
//        //can we call this super() more than once?
//        //NOOOOOOOOO!!!!!
//
//        System.out.println("message from Apple constructor");
//
//
//        //it is not inherited unless you write a constructor for the child class
//
//
//        // if you don't call super you automatically get it
//        // if you see then you will get what you were asking for
//
//        // a child cannot create an object unless it calls a super class constructor!
//    }

    public static void main(String[] args) {
        Apple a1 = new Apple() ;


    }
}
