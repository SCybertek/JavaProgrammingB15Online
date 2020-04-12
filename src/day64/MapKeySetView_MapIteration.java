package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySetView_MapIteration {
    public static void main(String[] args) {

        //map is not iterable
        //we can convert map into set using keysey view and iterate now

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap.get(\"Apple\") = " + groceryPriceMap.get("Apple"));
        //how to iteraite over set 
        
       Set<String> grocerySet =groceryPriceMap.keySet();
        System.out.println("grocerySet = " + grocerySet);

        for ( String eachItem : grocerySet) {
            System.out.println("each name is " + eachItem + "| Value is " + groceryPriceMap.get(eachItem) );
        }

//        grocerySet.forEach(everyItem -> System.out.println("everyItem = " + everyItem + " its value " + groceryPriceMap.get(everyItem)));
    }
}
