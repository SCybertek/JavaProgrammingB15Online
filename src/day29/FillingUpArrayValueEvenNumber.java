package day29;

import java.util.Arrays;

public class FillingUpArrayValueEvenNumber {
    public static void main(String[] args) {
        // create an int array with size 100 and fill it up as below

        // fill up this array with evenn number from 0 to 100

        int[] numbers = new int[100]; // this 100: how many elements are in the Array

//                                           \n will move it to next line
        System.out.println("Before filling up \n" + Arrays.toString(numbers));

        // this is how we fill up array manually
//        numbers[0] = 0; // 0 * 2
//        numbers[1] = 2; // 1 * 2
//        numbers[2] = 4;
//        numbers[3] = 6;
//        numbers[4] = 8;
//        numbers[5] = 10;
//        numbers[6] = 12; //6 * 2
//       // ...
//        numbers[99] = 198; //99 * 2

        //we see the pattern
        // numbers[x] = x * 2 ;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
            // numbers[i] = i * 2 +1; this is to fill up an array with odd numbers
        }

        System.out.println("After filling up our array with even numbers "+ Arrays.toString(numbers));

        // fill up array by skipping by 2/ by 3 .. everything can be done with the same logic

        // fill up an array with String

        String sentence = " I love Java";

        String [] sentenceArray = new String [300];

        //manually

        sentenceArray [0] = "I love Java";
        sentenceArray [1] = "I love Java";
        sentenceArray [2] = "I love Java";
        sentenceArray [3] = "I love Java";
        sentenceArray [4] = "I love Java";

        sentenceArray [299] = "I love Java";

        //formula
      //  sentenceArray[j] = sentence;
        for (int i = 0; i < sentenceArray.length; i++) {
            sentenceArray[i] = sentence;
        }

        System.out.println(Arrays.toString(sentenceArray));



    }
}
