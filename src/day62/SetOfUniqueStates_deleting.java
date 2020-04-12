package day62;

import java.util.*;

public class SetOfUniqueStates_deleting {


    public static void main(String[] args) {


        //removing item from set :
        //NEVER USE FOR EACH TO MODIFY ! (since no indexes in for each loop)
        //WE CANNOT USE FORI either since we do not have index in SET
        // we can use ITERATOR or Lambda expression :

        //states.removeIf(each->each.contains("A")); //lamda expressing removal

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
//        states.remove("GA");
//        System.out.println("states after  = " + states);

//LAMBDA EXPRESSION :
//        states.removeIf(each->each.contains("A"));
//        System.out.println("states = " + states);


        //Iterator :
        //if we do not safe the .next item as each:
        // we will get an error or unexpected result!
        //because : it calls .next twice!!!! and it will skip an item !!!
        //NEVER CALL NEXT method twice in ONE ITERATION

        //      remove all the states with letter A
        Iterator<String> stIter = states.iterator();
        // Iterator has 3 methods hasNext() next() remove() works together
        // to remove item while iterating over a collection
//        while (stIter.hasNext() ){
////
////            String each = stIter.next();
////            if(each.contains("A") ){
////                System.out.println("removing = " + each);
////                stIter.remove();
////            }
////
////        }

        while (stIter.hasNext()) {

            // PLEASE DO NOT CALL NEXT METHOD TWICE IN ONE ITERATION OR IT WILL SKIP TO NEXT ITEM
            String each = stIter.next();
            if(each.contains("A") ){
               System.out.println("removing = " + each);
               stIter.remove();
           }

        }


        System.out.println("states after   = " + states);

//    if (strer.next().contains("A")) {
//        System.out.println("removing item" + strIter.next());
// if we were not printing it it would have been ok actually
//        strIter.remove() ;
//    }


    }

}

/** ITERATOR </E> iterator();
 * Returns an array containing all of the elements in this list in proper
 * sequence (from first to last element).
 *
 * <p>The returned array will be "safe" in that no references to it are
 * maintained by this list.  (In other words, this method must
 * allocate a new array even if this list is backed by an array).
 * The caller is thus free to modify the returned array.
 *
 * <p>This method acts as bridge between array-based and collection-based
 * APIs.
**/


