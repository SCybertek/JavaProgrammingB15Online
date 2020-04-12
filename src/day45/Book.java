package day45;

// if we do not explicitly (visibly / manually ) extends another class
// we always automatically extends Object class
//Object class is super class of all the classes in Java

public class Book  extends Object{

    public static void main(String[] args) {


        Book b1 = new Book () ;
        //all methods are coming from this super class
        System.out.println("b1.toString() = " + b1.toString());
        //prints hashCode = it is a result of this code that is coming from Object class
    }
//@Override // this is called annotation
// it is making it obvious to declare we are rewriting the inherited super class method
    public String toString () {
        return "my own version of toString";

        // you inherit the parent functionality
        // but you can override the instance method toString()

        //OVERRIDE is applicable to instance method ONLY

    }


}
