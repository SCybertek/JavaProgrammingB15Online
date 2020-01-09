package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListReturnType {
    public static void main(String[] args) {

        System.out.println( getListFrom1toFinalNumber(10) ) ;
        System.out.println( getListFrom1toFinalNumber(23) );

        List <Integer> myList = getListFrom1toFinalNumber(25) ;
        System.out.println("myList = " + myList);



    }
//create a method that accept a finalNumber as int
    //return an ArrayList of Integer containing numbers

    /**
     * This method will return a List of Integer that contains numbers
     * starting from 1 till finalNumber
     * @param finalNumber This is the last item of the list
     * @return List<Integer> that contains 1 till final number increased by 1 
     */

    public static List<Integer> getListFrom1toFinalNumber ( int finalNumber) {

        List<Integer> nums = new ArrayList<>() ; // this is our return type..
        // when we call it we get List of integer object

        for (int numbers = 1; numbers <= finalNumber ; numbers++) {
            nums.add(numbers);
        }
        return nums;

    }
}
