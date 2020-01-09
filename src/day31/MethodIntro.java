package day31;

public class MethodIntro {

    // why do we need a METHOD
    // REUSABLE CODE!
    // AVOID code duplicate



    public static void main(String[] args) {

        // The execution flow always start from Main method???
        //YES


        //TWO Way to call static methods!
        // ClassName.methodName (external data if needed)
        //if you are in same class
        // you can directly call them without using your class name


        //loop is not only way to make your code reusable


        //MY CLASS NAME:
        //MethodIntro

   //     MethodIntro.sayHello(); this is optional if you are in the same Class!!! IMPORTANT
        System.out.println("Begin");
        sayHello(); // we added sedond sayHello(); what we will get??
        System.out.println("----");
        sayHello();
        System.out.println("The End");

        //program flow:

        // line 22--> 23 (37, 43,44,45) -->24 --> 25 (37, 43,44,45) --> line 26 -- DONE


    }
    // DO NOT CREATE A METHOD INSIDE THE MAIN METHOD!!
    // it should be outside the main method
    // method we created should be INSIDE the CLASS and outside of any other METHOD WE HAVE/ main
    // WE HAVE TO HAVE MAIN METHOD: to print the code

    public static void sayHello () {
        //void means GIVE nothing!

        // have this RESUABLE PIECE OF CODE!
        // we can call it whenever we need

        System.out.println("Hello World ");
        System.out.println("My name is Juma ");
        System.out.println("I love Java");


    }

}
