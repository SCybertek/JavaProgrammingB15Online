package day38;

import java.util.*;// we can use this to import any class under java util package

public class SortingListObject {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));
        System.out.println("nums before sorting = " + nums);

        // 2 Ways to sort an ArrayList
        // Use Collections utility class (just like Arrays utility class for array object )
        //Collections is a Class coming from java util package
        // it can be called to work with collections like ArrayList

        Collections.sort(nums);
        System.out.println("nums after sorting  = " + nums);

        // This version of Sort method accepts 2 arguments
        // 1st is the list to be sorted
        // 2nd a Comparator Object that contains comparing logic
        // good news is there is ready method already in java
        // we can get reverse order comparator object by calling
        // Comparactor.reverseOrder () , just take it and use it !
        // example of sorting 5 students in front of Akbar.. by what ? by age or hight? there has to be something

        // we haeve to use Comparactor. reverse.. to provide logic.. if we have only ascending order then we can use only sort
        // also we can avoid using Comparactor. then we can just loop in reverse ..

        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("nums after sorting in reverse = " + nums);


        // List itself also has sort method that accpet one Comparator Object

        // 2 Simple way to get Comparator Object are:
                // Comparator.naturalOredr() -- Low to high order
                // Comparator.reverseOrder() -- high to low order

        nums.sort(Comparator.naturalOrder());
        System.out.println("nums after using nums.sort(Comparator.naturalOrder()) = \n" + nums);


        nums.sort(Comparator.reverseOrder());
        System.out.println("nums after using nums.sort(Comparator.reverseOrder()) = \n" + nums);

        // if we dont use list.sort method then we can use Bubble Sort
        // this sort methdo and collections. sort are relatively new .. introduced in java 8 i guess
    }
}
