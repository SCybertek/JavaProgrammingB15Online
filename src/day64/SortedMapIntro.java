package day64;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapIntro {
    public static void main(String[] args) {

        //SortedMap extends Map and it will keep the sorted order
        //TreeMap is the implementation

        SortedMap<String, Double> groceryPriceMap = new TreeMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        //sorting by natural order of the KEY!!!
        //groceryPriceMap = {Apple=1.89, Banana=1.99, Grape=3.99, Potato=2.99, Tomato=1.99}

        //cannot sort with VALUE !!!
        //try to come up with different solution for this!!!!! to sort with value


        /** INTERVIEW Q
         *  Difference between HashMap , LinkedHashMap , TreeMap
         *  HashMap: faster, no duplicates , no sorted order , no natural order ( order due to hashcode)
         *  LinkedHashMap : slightly slower, keeps insertion order , no duplicates
         *  TreeSet : slowest, sorted , no duplicates
         *
         *  Difference between HashMap and HashSet
         *
         *  HashSet is implementation of Set interface
         *  store unique elements per item
         *
         *  HashMap is implementation of Map interface
         *  it stores key value pair - keys are unique
         *  TWO COMPLETELY DIFFERENT DATA STRUCTURE
         */



    }
}
