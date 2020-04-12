package day62;

import java.nio.charset.IllegalCharsetNameException;
import java.sql.SQLOutput;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {

    public static void main(String[] args) {
        
        //SortedSet interface extends Set interface 
        //it is a data structure that store unique elements in sorted order
        //The implementing class is TreeSet 

        SortedSet<Integer> mySet = new TreeSet<>();
        
        mySet.add(70);
        mySet.add(60);
        mySet.add(30);
        mySet.add(50);
        mySet.add(50);
        mySet.add(70);
        mySet.add(25);

        System.out.println("mySet = " + mySet);
        //outcome is :
        //[25, 30, 50, 60, 70]
        //it keeps out the duplicate and sort in natural order

        //these extra methods belong to sorted set because it is already sorted:
        System.out.println("First element " + mySet.first() );
        System.out.println("mySet.last()  = " + mySet.last() );

        //tree set is special : how does it decide?
        //comparator : natural order
        //


        //tell me about difference between hashSet linkedHashSet and treeSet ?
        //does not have duplicate hashSet
        //everything sorted duplicates removed treeSet
        //no duplicates + insertion order LinkedHashSet
    }
}
