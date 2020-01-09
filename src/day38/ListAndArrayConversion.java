package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAndArrayConversion {

    public static void main(String[] args) {
        // copy from one list to anothe r
        // 2 way
        // Array.asList
        // second was .. :(

        // converting from one to another ? how .. from Array to ArrayList
        // how to Copy from Array to ArrayList ?

        // nothing worked :) )) Akbar was funny today :) and very tired it seems like

//        Integer[] nums = new Integer[] {1,4,5,7,8,5,3,2,19} ;
//        List<Integer> numsLst = Arrays.asList(new Integer[12]);
//        Integer[] numsArr = numsLst.toArray(new Integer[12]);

        // how do we copy everything from array into ArrayList object

        Integer[] nums = new Integer[]{1, 4, 5, 7, 8, 5, 3, 2, 19};
        System.out.println("nums array object = " + Arrays.toString(nums));

        // converting to the list
        List<Integer> numsLst = Arrays.asList(nums);
        System.out.println("numsLst object = " + numsLst);

        // converting back to the array again
        Integer[] numsArr = numsLst.toArray(new Integer[9]);
        System.out.println("numsArr object with exact same item count = \n\t"
                + Arrays.toString(numsArr));

        // it will fill up your array with null
        // if the newly defined array size is more than list element count
        Integer[] numsArr2 = numsLst.toArray(new Integer[20]);
        System.out.println("numsArr object with 20 item count = \n\t"
                + Arrays.toString(numsArr2));


        // it will create array with correct size
        // if the newly defined array size is less than list element count
        Integer[] numsArr3 = numsLst.toArray(new Integer[0]);
        System.out.println("numsArr object with 0 item count and automatically corrected = \n\t"
                + Arrays.toString(numsArr3));

    }
}
