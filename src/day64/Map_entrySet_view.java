package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_entrySet_view {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        //to get key and value together as an entry we need this method: 
        //entrySetView : methods  .getValue .setValue .getKey


        //what can you do with it?

        //MAP IS NOT iterable :
        //but entry set view is : you can iterate and store something for example
        //in order to iterate we use map store ket value pair as ENTRY internally and
        //we get this Entries Out using entrySet() view


        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();
        System.out.println("entryView = " + entryView);



        for ( Map.Entry<String, Double> each : entryView ) {
            System.out.println("Key for current entry is : each.getKey() = " + each.getKey());
        // w=from where these are coming from ? getKey getValue setValue : I guess they are methods of entrySet/ YES
            System.out.println("Value for current entry is : each.getValue() = " + each.getValue());

            //update the value of grocery if the grocery name has exact 5 chars

            if (each.getKey().length() == 5 ) { // if length of the key is 5 (grape)
                each.setValue((15.0)); //make its value : 15
            }
        }
        System.out.println("groceryPriceMap = " + groceryPriceMap);



        
    }
}
