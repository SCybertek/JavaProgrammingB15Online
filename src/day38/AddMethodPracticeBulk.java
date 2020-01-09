package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class AddMethodPracticeBulk {

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(45);
        nums2.add(12);

// adding num2 inside num1 :
        nums1.addAll(nums2);


        System.out.println("num1 " + nums1);
        System.out.println("num2 " + nums2);

        //Arrays.asList will return List Object that contains items it specified
        // add 4 items to nums2 using add all 100,200,300,400
        nums2.addAll(Arrays.asList(100,200,300,400)) ;
        System.out.println("nums2 after adding 4 items = " + nums2);

    }
}
