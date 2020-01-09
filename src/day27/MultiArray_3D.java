package day27;

import java.util.Arrays;

public class MultiArray_3D {

    public static void main(String[] args) {
        // N dimesional Array MUST contain (N-1) dimesional arrays

        // 2D Array: contains 1 dimensional array

        int[][] arr2D = {{1,2,3}, {4,5,6}};

        //3D Array : contains 2 dimensional array
        // index :                  0                   1                   2
        int [][][] arr3D = { {{1,2,3}, {4,5,6}}, {{7,8,9}, {10,11,12}} , {{1,2,3}, {4,5,6}}   };
        //index of 1D            0      1           0           1           0           1
        //index of value       0,1,2    0,1,2      0,1,2 .... etc
        //each array in this array is 2 dimesioanl array !!
        // [index num of 2D array] [index num of 1D array] [index number of values]


        //print 9:
        System.out.println(arr3D[1][0][2]); // return value

        //print 2:
        System.out.println(arr3D[0][0][1]); // return value

        //print {1,2,3}:
        System.out.println(Arrays.toString(arr3D[0][0])); // returns 1D array thats why you have to convert to String// !!! string class

        //print {10,11,12}:
        System.out.println(Arrays.toString(arr3D[1][1])); // returns single dimensional array

        //{{7,8,9}, {10,11,12}}

        System.out.println(Arrays.deepToString(arr3D[1])); // returns 2D array thats why you cannot use toString
        //you hav eto use deep

        System.out.println(Arrays.deepToString(arr3D));





    }
}
