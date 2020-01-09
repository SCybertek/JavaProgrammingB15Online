package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {

        //array: a variable that allows us to store multiple values
        //ARRAY size if FIXED !! do not change unless you reinitianalize it!/create new array I guess



        int num = 10; // reg var. 1 value ONLY
        int[]arr ={10,20};// however, array variable allows us to store more than 1 values

        /* array variables :

                        index = 0, 1, 2
                  int [] arr = {12,34,1};
          storage // shelf // object = think like that

          declaration:
                    Data-Type [] variableName= {data1, data2, data3... }
                    each element data type is same with arrays data type

          retrieve data :
                    arrayName[indexNumber] ==> element of the index number
          Ex:
          arr[2]==> 1 (result will be INT because array we declared was Int


          ARRAY must be converted to String in order to be printed

          ARRAy size is fixed and must be initianalize it before usagae. you do it with NEW keyword


         */
        int[] arr2 = {10,20,30,40,50,60};
        //length: it will return the total number of elements from the array
       // int num1=arr[arr2.length];
        //System.out.println(num1); //cannot compile
        //lastIndex num : arr.length-1

        int num1=arr2[arr2.length-1];
        System.out.println(num1);

        //how to print all values in ARRAY:

        //for loop
                    // x<=arr2.length-1

        System.out.println("=======================================");
        for (int x=0; x< arr2.length ; x++  ) {
            System.out.print(arr2[x]+" ");
        }

        System.out.println("\n ====================================");

        //ArraysToString(VariableNameofTheArray):
        //first import ARRAY class

        String str = Arrays.toString(arr2);
        System.out.println(str);


        //task : write a program that asks user to enter a number 5 times,
        // and store those numbers into int array

        int [] numbers = new int [5];
       // numbers[0] = 5; // YOU MUST initianlize the size of array before using it !

        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner (System.in);

//        System.out.println("Enter an int number : ");
//       int input = scan.nextInt(); //allows to capture users numbers
//                                //returns int data type
//        numbers[0] = input;  // this helps to initialize number to an array

//        System.out.println("Enter an int number : ");
//        int input2 = scan.nextInt(); //allows to capture users numbers
//        //returns int data type
//        numbers[1] = input;  // this helps to initialize number to an array

        //we have repetition so we use loop

        for (int i = 0; i<5 ; i++){
            System.out.println("Enter int number : ");
            int input = scan.nextInt(); //returns int data type
            //numbers[i] =scan.nextInt();
            numbers[i] = input;
        }

        System.out.println(Arrays.toString(numbers));

        //Arrays.sort(variableName): sort the array in ascending order

        //if you want to find the largest array num you have to sort it first
        //then you print the last index number

        //for min number: you sort first and print the num on index 0

        Arrays.sort(numbers);

        int largestNumber = numbers[numbers.length-1];
        System.out.println("Largest number is " +largestNumber);
        int minNumber = numbers[0];
        System.out.println("minNumber = " + minNumber);












    }
}
