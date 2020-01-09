package day38;

import java.util.*;

public class DifferenceBetweenReverseOrderandSortingAfterReverse {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(200, 100, 700, 400, 500));

        // 200 , 100, 700, 400, 500
        // after reversing
        // 500, 400, 700, 100, 200

        Collections.reverse(nums);
        System.out.println("nums after reversing = " + nums);

        //after sorting in reverse order line 13
        // 700,500,400,200,100

        Collections.sort(nums, Comparator.reverseOrder()); // or Collections.reverseOrder()
        System.out.println("nums after sorting reverse order = " + nums);


    }
}
