package selfStudy;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

    public static void main(String[] args) {

        int[] nums = {20, 45, 78, 98, 33, 56, 20, 27, 45, 98, 74, 36, 99, 20, 45, 21};
        //Please convert array to list and remove 20 and 45 using iterator.
        // Please share your code.
        //Task 2 - Then remove all off numbers.

        //to convert to list :
                                //unmodifiable :
        List<Integer> numsList = Arrays.asList(20, 45, 78, 98, 33, 56, 20, 27, 45, 98, 74, 36, 99, 20, 45, 21);
        //print before removing:
        System.out.println(numsList);
        //to iterate using Iterator interface :

        Iterator<Integer> myIter = numsList.iterator();

        while (myIter.hasNext()){
           // Integer each = myIter.next();
            if ( (myIter.next() == 20) || (myIter.next() == 45) ) {
                myIter.remove(); //UnsupportedOperationException ?? why run time exception ?
            }
        }
        System.out.println(numsList);
    }

    // while ( myIter.hasNext()) {
    //            if (myIter.next().getSalary() < 100000 ) {
    //                myIter.remove();
    //            }
}
