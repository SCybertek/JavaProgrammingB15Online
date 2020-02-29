package day05;

public class VariablePractice {
    public static void main(String[] args) {

//        8 primitive data type
//        line1
        /* to start block comment  and to finish -->*/
        // whole number: int, byte,short, long
        // fractional numbers : float, double
        // logical: boolean (true, false)
        //character: char (single character in single quote)

        /*usually by default for whole numbers: just use INT
        usually by default for fractional numbers: just use double

         */
        //Is String part of primitive type? : NOOOO!!!
        //String is a sequence of character
       // age calculator
        //given birth year, please calculate the age
        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear-birthYear;

        System.out.println("I was born in year "+ birthYear+
                           ", and I am " + age +" years old. ");

        //Task 2: you are speeding today
        //speed limit is some number, and your current speed is this
        //generate this output of : you are driving 10 mph more than speed limit
        int speedLimit = 55;
        int currentSpeed = 65;
        int overTheLimit = currentSpeed- speedLimit;

        System.out.println("I am driving on a highway that has speed limit of "+ currentSpeed+ "mph that is "+ overTheLimit + "mph over the limit.");


    }
}
