package repl;

import java.util.Arrays;

public class Repl141 {
    public static void main(String[] args) {
//Given an int array, print a new array with double the length
// where its last element is the same as the original array,
// and all the other elements are 0. The original array will be length 1 or more.
// Note: by default, a new int array contains all 0'

        //Logic:
        // take first array and find out the length and element numner at the last location
        // then assign it as alst element to a new array (concatenate everything with a loop ?)

        int [] nums = {4,5,6} ;

        int [] nums2 = new int[nums.length*2];
        int razmer = nums.length*2 ;

        int lastIndex = nums.length-1;
        int lastIndexNum2 = razmer-1;

        int temp = nums [lastIndex] ;
        nums[lastIndex] = nums2[lastIndexNum2] ;
        nums2[lastIndexNum2] = temp ;

        System.out.println(Arrays.toString(nums2));

        // also Serdars code:

//        int[] output = new int[size*2];
//        output[size*2-1] = nums[size-1];
//        System.out.println(Arrays.toString(output));



    }
}
