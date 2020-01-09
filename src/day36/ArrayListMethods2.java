package day36;

import java.util.ArrayList;

public class ArrayListMethods2 {
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
        // practically you will not add null , but it is an option
        //lst.add( null ) ; // you can add null element into a list

        System.out.println("lst =" + lst);
        System.out.println("lst.size() item count = " + lst.size());
        
        // Task: 
        // insert an item in certain location :
        // I want to insert 125 between 100L and 150 L 
        
        lst.add(2,125L);
        System.out.println("lst = " + lst);

        System.out.println(" New value for lst.get(3) = \n\t" + lst.get(3));
        
        //updating value at certain index : set method
        
        lst.set(3,195L);
        System.out.println("lst.get(3) = \n\t" + lst.get(3));

//        //removing item from arraylist by its value
//
//        lst.remove(100L) ; // when we remove L it converts to index 100; and gives error when we run the code
//
//        // What if we are removing the Int ???? NEED TO EXPERIMENT
//        System.out.println("lst after removing 100 = \n\t" + lst);
//
//        // removing item by its index
//        lst.remove(2) ;
//        System.out.println("lst after removing item in index 2 = \n\t" + lst);

        //looking for location of certain item
        System.out.println("location of 100L using lst.indexOf(100L) is  = " + lst.indexOf(100L));

        //what if we dont have such value :
        System.out.println("location of 23L " + lst.indexOf(23L)); // -1

        //check whether a list is empty or not

        System.out.println("\nlist.isEmpty() or not = " + lst.isEmpty() );

        // also
        //check the size, if it is more than 0 elements then it is not empty

        System.out.println("\nlst.size() > 0 = "+ (lst.size() > 0));

        // how do I delete everything inside my ArrayList
//        lst.clear();
//        //System.out.println("lst after using lst.clear() = " + lst);
//
//        System.out.println("lst.isEmpty() = " + lst.isEmpty());
//
        // check whether we have certain item or not
        // with contain
        // or : we can use indexOf() .. meaning if there is location then we have 100

        System.out.println("list.contans(100L) = " + lst.contains(100L));
        System.out.println("list.contans(10L) = " + lst.contains(10L));

        //how do I check whether a list contain an item without using contains method
        // USE indexOf method
        // if it returns -1 ..it means we dont have it

        System.out.println("Do I have 10L = " + (lst.indexOf(10L) !=-1));




       
    }
}
