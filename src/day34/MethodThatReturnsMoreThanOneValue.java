package day34;

import java.util.Arrays;

public class MethodThatReturnsMoreThanOneValue {
    public static void main(String[] args) {

        String sentence = " I love Java";
        char[] eachChar = sentence.toCharArray();
        //System.out.println(Arrays.toString(eachChar));
        String[] eachWords = sentence.split(" ");
       // System.out.println(Arrays.toString(eachWords));

        int[] resultArr = returnBoysVSGirlsResult();
        System.out.println(Arrays.toString(resultArr));

    }

    //create a method than return int array
    // returnBoysVSGirlsResult
    public static int [] returnBoysVSGirlsResult () {
        int [] boysAndGirlsCount = {56,52 };
        return boysAndGirlsCount;
    }

}
