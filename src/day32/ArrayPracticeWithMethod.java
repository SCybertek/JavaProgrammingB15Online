package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {

        // this is passing the array object directly into the method
        printArrayItems(new int[]{1, 6, 5, 3, 12, 3});
        // this is assigning the array object into a variable
        // and then pass it into the method
        int[] scores = {2, 5, 8, 23, 4, 5, 6};
        printArrayItems(scores);

        printMaxOfIntArray(scores);
        printMinOfIntArray(scores);
        printSumOfIntArray(scores);

        compareArraySize(new String[] {"Sezgin", "Sofiya"}, new String[] {"Mervin"});
        String[] names1 = {"SuperWoman", "Batman", "Cyborg"};
        String[] names2 = {"Black Panter","Aquaman","Flash"};
        compareArraySize(names1,names2);

    }

 public static void printMaxOfIntArray (int[] nums){
        //int [] nums = {23,56,8};
        //find max
     // printMaxOfIntArray
     // this method has one int array as parameter
     // and it will print the max number inside the array

        int max = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if ( max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max + " max");

    }

    // printArrayItems
    // create a method that has one int array as a parameter
    // print out each item in this format
    // arrays has items : --->>> all the items here
    public static void printArrayItems(int[] nums) {

        System.out.println("arrays has items :" + Arrays.toString(nums));

    }


    // printMinOfIntArray
    // this method has one int array as parameter
    // and it will print the min number inside the array

    public static void printMinOfIntArray(int[] nums) {

        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("min = " + min);
    }

    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers

    public static void printSumOfIntArray(int[] nums) {

        int sum = 0;
        for (int each : nums) {
            sum = sum + each;  //sum+=each ;
        }
        System.out.println("sum = " + sum);
    }

    //compare two array size
    //create a method that accepts 2 String array object
    //and compare the item count inside these two arrays
    //if arr1 is more then print arr1 has more item
    // if arr 2 is more print arr2 has more item
    //else print they have the same item count

    public static void compareArraySize (String [] arr1, String [] arr2){
        if(arr1.length > arr2.length) {
            System.out.println("arr1 has more item");
        }else if (arr1.length < arr2.length){
            System.out.println("arr2 has more item");
        }else {
            System.out.println("they have same item count");
        }
    }

    // OPTIONALLY
    // checkScoresAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether all the numbers are more than 60
    // if so print everyone passed
    // if not print someone has failed


        /*
        printMaxOfIntArray
        this method has one int array as parameter
        and it will print the max number inside the array
         */


    }


