package MentoringSessions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        //Primitive Data Types
        //dataType variableName    Initialization
        boolean isPizzaDelicious = true;
        byte a1 = 12;
        short a2 = 321;
        char c1 = 'v';
        int a3 = 1234;
        long a4 = 1487523L;
        float a5 = 20.05f;
        double a6 = 20.05;
        //Those are regular variables, we can only have one value in each of them.
        //         index0 index1  index2   index3
        int[] arr = {12, 13, 14, 15};//first way to create an array
        int[] arr2 = new int[5];//second way of create an array
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;
        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//third way of create an array
        //variableName[indexNumber] = the value of an index;
        //index numbers start from 0;
        //when we create an array, we should initlialize Array's length
        //int arrayLength = arr.length;
        System.out.println("arrayLength = " + arr.length);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        System.out.println(arr2[2]);
        System.out.println(arr[3]);
        int[] arr4 = new int[6];
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));
        for (int j = 0; j < arr4.length; j++) {//j=0,1,2,3,4,5
            arr4[j] = 10;
        }
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));
        for (int i = 0; i <= arr4.length - 1; i++) { //i == last index i=0,1,2,3,4,5
            arr4[i] = 10 + (i * 10);
        }
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));
        Scanner scan = new Scanner(System.in);
    }
}
