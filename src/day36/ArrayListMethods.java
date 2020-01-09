package day36;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {


        //create ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();
        //C.R.U.D
        //   Create, read, Update, Delete
        //add item , insert an item, read item, update an item, remove an item, check location

        lst.add( 12L ) ;
        lst.add( 100L ) ;
        lst.add( 150L ) ;
        lst.add( 200L ) ;

        System.out.println("lst =" + lst);

        // to check how many items in ArrayList
        // counting item inside arrayList

        System.out.println("counting item using list.size = " + lst.size() );

        //getting items inside ArrayList object
        System.out.println("First item is lst.get(0) = " + lst.get(0));

        //Task:
        //get the sum of above ArrayList item
        long sum = 0;

//        for (int i = 0; i < lst.size(); i++) {
//                sum += lst.get(i) ;
//        }
//        System.out.println(sum);
//

        for (Long each : lst) {
            sum += each;
        }
        System.out.println(sum);



        //Task: get the max of above arraylist items
        long max = lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if ( lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        System.out.println(max);
    }
}
