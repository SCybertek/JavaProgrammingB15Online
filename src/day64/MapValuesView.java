package day64;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapValuesView {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        //copy??

        Collection<Double> allPrices = groceryPriceMap.values();
        //why collections for all prices? because the return type is collection!!!
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        //remove method first come first served
        System.out.println("allPrices = " + allPrices);
        allPrices.remove(1.99); //potato
        System.out.println("groceryPriceMap = " + groceryPriceMap);


    }
}
