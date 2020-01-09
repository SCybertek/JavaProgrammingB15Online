package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllPractice {
    public static void main(String[] args) {


        /**
         * Retains only the elements in this list that are contained in the specified collection.
         * In other words,
         * removes from this list all of its elements that are not contained in the specified collection.
         */

                ArrayList<Integer> nums1 = new ArrayList<>();
                nums1.add(100);
                nums1.add(200);
                nums1.add(300);
                nums1.add(400);
                nums1.add(500);
                nums1.add(600);
                System.out.println("nums1 = " + nums1);

                List<Integer> nums2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));
                System.out.println("nums2 = " + nums2);
                nums1.retainAll(nums2);
                
                // this method will only keep the common part of 2 
                // only 1 parameter can be entered
                // you cannot compare more than 2 arrays

                System.out.println("nums1 = " + nums1);
                
                nums2.retainAll(nums1);

                System.out.println("nums2 = " + nums2);

                // both num1 and num1 have changed

        System.out.println("Does num1 has the same elements as num2 = " + nums1.equals(nums2) );
        // check if 2 List object has same item in a same order




    }
}
