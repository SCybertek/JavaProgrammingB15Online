package day60.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



// a class extends another class
// an interface extends another interface
// a class implements one or more interfaces


public class CollectionIntro {

    public static void main(String[] args) {


        //    List<String> names = new ArrayList<>();

        // List interface extends Collection interface
        // and ArrayList implements List interface
        // So we can safely say ArrayList IS-A Collection
        // List is the only data structure that have index(order) , none of the other data structure has index



        Collection<String> names = new ArrayList<>();
        // with this assignment we can access only what Collection interface have
        // so we can learn what any type of Collection including Set , Queue , List have in common
        //
        // collection is an interface
        //list is the only type of collection that has index!!!! Collection doe snot have the.get method!!!
        //does not care about duplicates! CAN HAVE DUPLICATES

        names.add("Hasan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana") ;
        names.add("Daria");
        names.add("Lorin");

        names.addAll(names); // addAll method parameter type is Collection (interface) so we can pass anything IS-A Collection


        System.out.println("names = " + names);
        names.remove("Hasan"); //removes the first occurence


        //if we want to remove all the Object in the Collection ! :
        names.removeAll(Arrays.asList("Hasan")); //we can use new ArrayList<String> etc.but it will be 2 steps
        // it accepts a collection
        //requirement: removeAll expects another collection object

        //two step method:
        //quickly generation a type of list object and assign it to super type collection
        Collection<String> toRemove = Arrays.asList("Abdullo");
       // toRemove.add("Mervin"); it will compile but will throw exception : UnsupportedOperationException . Unmodifiable collection
        names.removeAll(toRemove);


//        for (String eachName : names) {
//            System.out.println("eachName = " + eachName);
//        }
        
        // the method that actually can provide the for each logic in one shot :
// OPTIONALLY : THIS IS HOW WE CAN USE forEach method to print out everything in one shot
        names.forEach(each -> System.out.println("each = " + each)); // -> this is Lambda expression !! read discussion on Canvas!!!





        //addAll method asks for collection

       // System.out.println("first item " + names.get(0));

        /**
         * The word Collection everywhere :
         *
         *
         * Collection Framework -->> referring entire things , entire topic
         *
         * Collection Interface --->> one interface under the entire Collection Framework
         *
         * Collections class  -->> (it has s at the end, just like Array and Arrays )
         *                   -->>  is a utility class with many static methods
         *                 for example : Collections.sort(your collection object1)
         *
         *
         * */



    }
}
