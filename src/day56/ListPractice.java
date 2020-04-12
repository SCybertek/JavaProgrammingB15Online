package day56;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(10); // add method is coming from ArrayList object (which implements List interface)
        // action is done by arraylist object
        //when we say contain..it is calling from ArrayList object 
        nums.add(11);
        nums.add(20);
        nums.add(22);
        nums.add(13);
        nums.add(1);
        nums.add(70);


        // every Wrapper Class has overridden Equal method?

        System.out.println("nums = " + nums);
        System.out.println("nums.contains(10) = " + nums.contains(10));
        System.out.println("nums.indexOf(70) = " + nums.indexOf(70)); // coming from the List ! ArrayList is implementing it!
    }
}
