package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {
        //print all even number backwards from 100 - 0
        //try to use if statemnet rather than -2

        int number = 100 ;
         while ( number>=0) {
             if (number%2==0){
                 System.out.println("number is even: " + number);
             }
             //else {
               //  System.out.println("it is odd number: "+ number);

             --number;
             }



         }
    }

