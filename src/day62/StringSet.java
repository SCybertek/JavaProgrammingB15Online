package day62;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringSet {

    public static void main(String[] args) {

        //create a set of String called states
        //add bunch of states with some duplicates
        //iterate over them! using each and everything you know!


        Set<String> states = new HashSet<>();
        states.add("MA");
        states.add("MA");
        states.add("VA");
        states.add("LA");
        states.add("NH");
        states.add("NY");
        states.add("NY");

        //any type of collection has size method to count the items
        System.out.println(states.size() );

        System.out.println("Iterate using FOR EACH LOOP");
        for ( String each : states) {
            System.out.println("each state = " + each);
        }

        System.out.println("Iterate using FOR LOOP");
        System.out.println("we cannot iterate using fori !!! since there is no indexes");

        System.out.println("Iterate using ITERATOR");

        //creating iterator
        Iterator<String> myIter = states.iterator();
        
        while (myIter.hasNext()) {
            System.out.println("myIter.next() = " + myIter.next());
        }
        System.out.println("LAMBDA EXPRESSION TO ITERATE");
        states.forEach(each-> System.out.print(each+" ")); // LAMBDA EXPRESSION!!  REVIEW THIS ONE!!!


    }
}
