package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl129 {

    public static void main(String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two", "three", "four"};
       System.out.println(Arrays.toString(getWithE(numbers)));
    }




    public static String [] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        //loop through numbers to check if there is an E
        //1 step see how many contains E

        int count = 0 ;
        for ( String each : arr) {
            if( each.contains("e") ){
                count++;
            }
        }
// 2nd loop and transfer them into a new array :
        int y = 0 ;
        String [] fewValues = new String[count];
        for (int x = 0 ; x < arr.length ; x ++) {
            if (arr[x].contains("e") ) {
                fewValues[y] = arr[x]; // adding elements
                y++; //making sure the index at new array shifts , so we do not add at the same index
            }
        }

        return fewValues;
    }}




            //YOUR CODE ENDS HERE -----------------------










