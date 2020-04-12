package MentoringSessions;

import java.util.Arrays;

public class DuplicateArray {


    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14};
        int[] arr2 = new int[4];
        System.out.println(arr[1]);
        System.out.println("Before duplicating");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
//first way manually
//        arr2[0] = arr[3];
//        arr2[1] = arr[2];
//        arr2[2] = arr[1];
//        arr2[3] = arr[0];
//second way
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) { //i=3,2,1,0
            arr2[j] = arr[i];
            j++;
        }
//        third way one shot
//        for(int i = arr.length-1 , j=0 ;     i>=0    ; j++, i--){//i=3,2,1,0   j=0,1,2,3
//            arr2[j] = arr[i];
//        }
        System.out.println("==========================");
        System.out.println("After duplicating");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
//        System.out.println("Before duplicating");
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr2));
//
//        arr2 = arr;
//
//        arr2[0] = 20;
//        System.out.println("==========================");
//        System.out.println("After duplicating");
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr2));
    }
}
