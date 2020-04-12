package day61;

import java.util.*;

public class CollectionContinue {

    public static void main(String[] args) {
        //here Collection interface as super type, pointing to an ArrayList object
        // whey we cando it?
        // collection as a reference type. --- Polymorphism
        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,6,4,5,7,8)); // not resizable ! (almost like an array kinda )
        System.out.println("nums = " + nums);

        //can we use get method when we have Collection as reference type?
        //big NO

        // I want to sort this collection :
       // Collections.sort(nums);// this does not work because our refrence type is Collection and this method accepts only List!
        //we can always cast: 2 Ways to do so :
//        Collections.sort((List<Integer>) nums);
//        System.out.println("nums = " + nums);
        Collections.sort((ArrayList<Integer> )nums);
        System.out.println("nums = " + nums);

        //but we chose to : create a new List

        List <Integer> nums2 = new ArrayList<>(Arrays.asList(10,7,4,11,67,8));
        //I want to sort this List 
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);

        

    }
}
