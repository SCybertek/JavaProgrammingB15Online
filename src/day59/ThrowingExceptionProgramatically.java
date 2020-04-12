package day59;

public class ThrowingExceptionProgramatically {

    public static void main(String[] args) {

        // Null pointer exception has a constructor that is overloaded
        //we get the e1 with no parameter
        //and e2 with a message !! this message will pop up when we type e.getMessage();
       // NullPointerException e1 = new NullPointerException();

        NullPointerException e2 = new NullPointerException("Back to earth");// here we created an objcet ourselves and created the message
       // System.out.println(e2.getMessage());

        //AKBARS COPY :
        // How do I programmatically throw exception myself
        // we use throw keyword followed by exception object
        // (or the variable that point to the exception object )
//        System.out.println(e2);



        //if the user enterece this many numbers -- throw this exception
        //if invalid passoword - throw this exception
        //instead of putting whole bunch of If statemnt put in try catch block


        throw e2 ;
        //throw is a keyword that has one purpose of throwing the exception to the  run time


//        System.out.println("THE END"); // this line will not be read..since it was exception at the line 28 -- unreachable code!!
//        throw new NullPointerException("Back to earth");

        //throwing and printing difference:
        //exception happening is throwing
        //printing  ---> just print the info of object (like to String), throw---> is creating exception
        //THROW AND THROWS:
        //completely different things, DO NOT MIX UP
        //top interview question: stay tuned

        //THROW: keyword can be used to programmatically throw the exception to the runtime
        //to control the program flow


//        Benefits of throws : helps our code to compile
//        disadvantages : if exception happen run time code will stop!
    }
}
