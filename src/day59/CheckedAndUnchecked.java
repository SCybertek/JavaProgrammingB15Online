package day59;

import java.io.IOException;

public class CheckedAndUnchecked {

    public static void main(String[] args) {

        String x = "abc";
        //        System.out.println(x.charAt(100));

        // Exception Hiearachy
//        Throwable  ->> child class -->>  Exception
        // Under Exception class ,
        // there is one sub class known as RunTimeException
        // Anything IS-A RunTimeException regarded as UncheckedException
        // UncheckedException are not required to be handled at compile time

        // How do we know the exception is UncheckedException
        // check whether it's a RunTimeException or sub class of RunTimeException

        // try to throw the exception programmatically if it compile , it means it's RunTimeException
       //throw new RuntimeException("just throwing it out!") ; // will compile

        // what is checked exception
        // everything that sub class of Exception but not RunTimeException
        // programmers are required to handle(or declare) this type of exception

        // is the class Exception a type of checked exception or unchecked ? CHECKED!
        try {

            throw new IOException("just throwing this away"); // will not compile unchecked ex.

        } catch (IOException e) {
            System.out.println("Exception caught");
        }


        //unchecked exeption you are not required to handle at Compile Time
        // it is not mandatory to handled unchecked ex. but will will blow up your program! so you better handle them


        //so throws threatens that it might happen, throw actually make it happen


         }
}
