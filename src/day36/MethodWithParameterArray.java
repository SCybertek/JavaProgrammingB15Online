package day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {

        int [] nums = { 1,2,5,7,3};
      //  System.out.println("before sort nums : " + Arrays.toString(nums));
       // Arrays.sort(nums);

      //  System.out.println("after sorting nums "+ Arrays.toString(nums));
        System.out.println("before chnage nums : " + Arrays.toString(nums));
        changeArraysFirstItemto100(nums);
        System.out.println("after change nums : " + Arrays.toString(nums));


    }

    //this is what happens behind:
    //public static void changeArraysFirstItemto100 () { // no parameter when running
    // numbers variable copies whatever is inside nums !
    // !!!! What is INSIDE NUMS VARIABLE?
    // ANSWER : ADDRESS!!
    // if we copy whatever is inside nums into a number , what are you copiing? the address of array object
    // so now numbser have same address of the object as nums
    // both leash are pointing to the same object !!
    // if you use different remote for the same TV, thats why TV will change
    // original nums will change !!! (that was the point here )

    // int [] numbers = nums;
    //        numbers[0] = 100 ;
    //
    //    }

//
//        // THIS IS WHAT WE CALLED PASS-BY-VALUE
//        //  when you pass a variable to a method parameter :
//        // you are only passing the copy of that variable


    // when you pass a variable to a method parameter :
    // you are only passing the copy of that variable
    // for primitives -->  the copy hold the value itself
    // changing the value does not change original value that passed

    // for reference type -->> the copy hold same address of the object
    // changing the value will affect original object
    // because both method parameters and passed variables are pointing to same object



    // if you copy reference : you copy addrress ( create another leasH, original will change as well .. you control same dog with 2 leash )

    //if you copy primitive : you copy number itself (original will not change )

    //JAVA is a pass BY VALUE LANGUAGE :!!!!
    // when it comes to passing arguments to the method

    /**
     *
     * @param numbers
     */
    public static void changeArraysFirstItemto100 ( int [] numbers) {
        numbers[0] = 100 ;

    }



}
