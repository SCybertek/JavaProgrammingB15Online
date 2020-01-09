package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {
    public static void main(String[] args) {
        int [] [] myExcel = {
                             {10,27,88,99 }, // index 0 : thi is first 1D array
                             { 87,100}, // index 1:  this is second 1D array
                            {90,45,65  }, // index 2:  this is third 1D array
                                     }; // thi is the ending of 2D array

        //we need to print out the whole thing
        //deepToString what does it do:
        // takes multiD array and turn it into a String with all items
        // just to print
        //do you need to provide extra data:
        //the multi d array object or variable
        //what do I get out of it:
        //string representation of multiD array

        // if you want to work with one single item in arrya DO NOT use this!


        System.out.println(Arrays.deepToString(myExcel));

        for (int[] eachRow : myExcel) {

            for (int eachCell : eachRow) {

                System.out.print(eachCell + " ");

            }
            System.out.println();
        }


    }
}
