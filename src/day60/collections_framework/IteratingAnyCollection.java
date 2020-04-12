package day60.collections_framework;

import java.util.*;

public class IteratingAnyCollection {

    public static void main(String[] args) {
        // this the ArrayList constructor that accept any type of Collection object
        // public ArrayList(Collection<E> c) { }

                                    //= Arrays.asList("mama"); b- this is unmodifiable
        Collection<Integer> nums =  new ArrayList<>(Arrays.asList(10,4,5,22,88,13)) ;
        //using generic reference type to include everything List Maps etc
        //public ArrayList (Collection<E> c) {}

        //NO REMOVING ITEMS WITH FOR EACH LOOP : concurrentModificationException will come up!!!

        //task: remove the item while iterating
        //iterating over a collection object using iterator :
        Iterator<Integer> myIter = nums.iterator(); // flashlight??

        //what is the safest way you can remove an element while iterating over any collection
        //for each -- ERROR
        //for LOOp - OK : but no indexes in other collections type (only List has index numbers)
        //the safest code to remove something from all collection

        // // what is the best way to remove element while iterating over the collections
        //        // using the Iterator instead of for each loop / for loop / .....
       // We use iterator : it is common for all of collection types
//i check with hasNext() method if i do have the element, i keep going using next() and remove() method
        
        while (myIter.hasNext()) {
            //System.out.println("myIter.next() = " + myIter.next());
            if (myIter.next() <= 10 ) {
                myIter.remove();
            }
        }
        

        //hasNext() -- . check whether you have next item
//        System.out.println("myIter.hasNext()" + myIter.hasNext()); // /true of false
//
//        //next (0 -- > will move the pointer of iterator to the next element
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//
//        myIter.remove();
//
//        System.out.println("myIter.next() = " + myIter.next());
//
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());

        System.out.println("nums = " + nums);
        
        }

    }

