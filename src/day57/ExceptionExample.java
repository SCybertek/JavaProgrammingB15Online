package day57;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("Hello B15 On Campus Friends!");
        //int num = 2.5; // this is Compile Error
        int [] nums = new int[3];
        // if we are storing 3 elements we need to type 3 in here
        nums[0] = 1;
        nums[1] = 55;
        nums[2] = 56;
      //  nums[10] = 100; // -- this is fine by compiler!! even if we do not have index 10 !!

        //java.lang.ArrayIndexOutOfBoundsException --- RUNTIME ERROR

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        //	at day57.ExceptionExample.main(ExceptionExample.java:14) -- 14 :this is line where the error is

        //behind the scene
        // there is a class called ArrayIndexOutOfBoundsException
        //whenever there is a problem the object is created from the class
        //every exception is created for a certain reason! read the Exception Line!!

        //there is a link at the very end that takes us to the place where the error is


       // System.out.println("Bye Bye B15 Online Friends" ) ;

        int result = 10 / 0 ; // compile fine
        //but :
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at day57.ExceptionExample.main(ExceptionExample.java:31)

        System.out.println("result = " + result);
        ArithmeticException i ;

    }
}
