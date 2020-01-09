package day36;

import java.util.ArrayList;

public class FindingUniqueUsingArrayList {
    public static void main(String[] args) {
        int[] nums = {11, 33, 44, 11, 33, 44, 22, 22, 55, 44, 33};

        ArrayList<Integer> uniqueList = new ArrayList<>();
        // I want to add items from array to arraylist if it does not contains that item 

        for (int each : nums) {

            //System.out.println("each = " + each);
            if (!uniqueList.contains(each)) {
                uniqueList.add(each);
            }

        }

            System.out.println("uniqueList = " + uniqueList);

            // how to add items to array list
            // call .add method



    }
}
