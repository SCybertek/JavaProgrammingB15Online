package day64;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        //this is keeping insertion order comparing to hashmap that does not!
        //it has 2 jobs..both no duplicates and sorting

        Map<String, Double> groceryPriceMap = new LinkedHashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}
