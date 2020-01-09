package day27;

import java.util.Arrays;

public class SingleDimentionalArray {
    public static void main(String[] args) {
        /*
        single dimensional array: contains values or elements
        //each index in this array is single value / linear array

        int[] arr= {1,2,3};
         */

       /*
        multi dimensional array can contain another array or arrays
        there is a math formula for any numbers of dimensions in Array:
                            N dimensional Array MUST contain (N-1) dimensional array
        */

       int [] arr1D = {1,2,3};
       //  [] represents index number of specific array

       //2D array: is an array that contains single dimensional arrays
        // int [] [] arr2D = { {1,2} {2,3} } ;
        // in 2 dimensional [] represents each single dimensional array

        //                 0 1 2    0 1 2
        int[][] arr2D = { {1,2,3}, {4,5,6} };
        //index:             0   , 1
        // the length of 2 d is determined by how many single dimensional array it contains
        // arr2D[0] ==> {1,2,3}
        // [INDEX NUM OF 1D ARRAYS] [INDEX NUM OF ELEMENTS]
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0])); // return the array
        System.out.println(Arrays.toString(arr2D[1]));

        // arr2D[0][2] == > 3 should return an element

        System.out.println(arr2D[0][2]); //return the int value

        //print 5: arr2D[1][1]

        System.out.println(arr2D[1][1]);

        //System.out.println(arr2D); //[[I@38af3868
        // you CANNOT print array like that !!

        System.out.println(Arrays.toString(arr2D[1]));//IT is ONLY applicable to single dimensional ARRAYS!!

        //for MULTI dimension we have to use
        //Arrays.deepToString(multi D-arrays);

        System.out.println(Arrays.deepToString(arr2D));



    }
}
