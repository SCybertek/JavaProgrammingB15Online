package day62;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// primary difference between HashSet and LinkedHashSet is LinkedHashSet keep insertion order
// HashSet is always way faster since it has less responsibility

public class LinkedHashSetImplementation {

    public static void main(String[] args) {

        //SET is all about removing duplicates: if you want insertion order then use LinkedHashset
        //but if no need just use HashSet!!!!!!

        //if you want to keep insertion order (first come first served )
        //and it also removes duplicates

        //the only thing thats has index and insertion order : LIST!!!


        Set<Integer> myNums = new LinkedHashSet<>();
        //it is subClass of HashSet that implements Set interface !

        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums Linked Hashset = " + myNums);


        Set<Integer> myNums2 = new HashSet<>();

        //hashset is faster than linkedHashset

        myNums2.add(10);
        myNums2.add(10);
        myNums2.add(22);
        myNums2.add(13);
        myNums2.add(30);
        myNums2.add(30);

        System.out.println("myNums HashSet = " + myNums2);

    }
}
