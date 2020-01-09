package day36;

import java.util.Arrays;

public class MethodPractice2 {
    public static void main(String[] args) {


    long [] myLongs = {6L, 11L, 44L, 32L, 65L} ;
        System.out.println("before swapping myLongs " + Arrays.toString(myLongs));
        swapFirstAndLastValue(myLongs);
        System.out.println("after swapping my longs : " + Arrays.toString(myLongs));





        long[] myNums1 = new long [5] ;
        System.out.println("Arrays.toString(myNums1 = " + Arrays.toString(myNums1));

        Long [] myNums2 = new Long [5];
        System.out.println("Arrays.toString(myNums2) = " + Arrays.toString(myNums2));
        
        String [] name = new String [5];
        System.out.println("Arrays.toString(name) = " + Arrays.toString(name));

        String str = "abc";
        String str2 = null; // there is no DOG ! No ojcet.. the leash is pointing to nothing!!

        //empty string is STill an OBJECT -- like skinni dog
        //null is NO DOG at all

        //int x = null; // we cannot do this!!
        //DEFAULT VALUE OF ALL primitives is NULL
        // ONE THING WE CANNOT DO WITH PRIMITIVE IS :
        //WE CANNOT ASSIGN THEM TO NULL!!!

        //ANY NON _PRIMITIVE CAN BE ASSIGNED TO NULL
        //TO DEFINE IT IS NOT POINTING TO ANY OBJECT YET

        int x= 0;
        Integer x1 = null ; // We can do this because: it is a reference type .
        // LEASH WITH NO DOG (NO ADDRESS!!)


    }

//write a static void method to accept a long array.
//It should swamp first value with last value of the array

    /**
     *
     * @param nums long array
     */

    public static void swapFirstAndLastValue (long [] nums) {

        //nums [0] , nums [ nums.length -1]
        //for swapping we create temp variable

        // just like swapping the tea in tea cup with coffee in coffee cup
        // yo uneed a temporary cup to hold you tea so you can put your coffee in
        // and put your tea back into coffe cup
        // nums[0]   , nums[ nums.length-1 ]


        long temp = nums [0] ;  // putting tea in the teacup to temp cup
        nums [0] = nums [nums.length -1] ;  // putting coffee into tea cup
        nums [nums.length -1 ] = temp ; // putting tea ( in temp cup ) into coffee cup

    }
}
