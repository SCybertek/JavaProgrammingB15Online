package officeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Practice_02_19_2020_IteratorPractice {


    public static void main(String[] args) {


//        -- Iterator -- see it as a tool to iterate over a collection
//        -- with basic functionality
//
//        in order to get an Iterator object we can call the method

        List<Integer> lst = new ArrayList<>(Arrays.asList(20,10,44,3,11));

        Iterator<Integer> numIter = lst.iterator();
        //This iterator initially at the location right before your first element! your flashlight

        // 3 methods available : hasNext() , next() , remove

        System.out.println("numIter.hasNext()  check if there is an element at the next location \n= "
                + numIter.hasNext());

        System.out.println("numIter.next() will move the pointer to the next element and get the value \n= "
                + numIter.next());

        // //= Now time to iterate over using the iterator
        //        //  First thing first need to decide when we keep looping ?
        //        //      as long as we have next element  numIter.hasNext()
        //        //  How to move to the next and get the value
        //        //      numIter.next()

        while (numIter.hasNext()) { // this condition is needed because we need to make sure there is an element at next index
            int x = numIter.next();
            if (x > 10) {
                System.out.println("numIter.next() = " + x ) ;//numIter.next());
                // this next method will skip to the next element so when we added the condition then it printed NoSuchElementException
            }
        }
        // output :numIter.next() = 10
        //numIter.next() = 44
        //numIter.next() = 3
        //numIter.next() = 11

        //IMPORTANt iterator does not Always starts at the beginning
    }
}
