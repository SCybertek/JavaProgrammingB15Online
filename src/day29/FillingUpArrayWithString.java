package day29;

import java.util.Arrays;

public class FillingUpArrayWithString {
    public static void main(String[] args) {
        // fill up an array with String

        String sentence = " I love Java";

        String [] sentenceArray = new String [300];

        //manually

//        sentenceArray [0] = "I love Java";
//        sentenceArray [1] = "I love Java";
//        sentenceArray [2] = "I love Java";
//        sentenceArray [3] = "I love Java";
//        sentenceArray [4] = "I love Java";
//
//        sentenceArray [299] = "I love Java";

        //formula
        //  sentenceArray[j] = sentence;
        for (int i = 0; i < sentenceArray.length; i++) {
            sentenceArray[i] = (i+1)+"."+sentence;
            //or without numbers :
            // sentenceArray[i] = sentence;
        }

        System.out.println(Arrays.toString(sentenceArray));

        String str = new String ("ABC"); // this is string object with value ABC
        String[] strArr = new String[5]; //Empty String with capacity 5


    }
}
