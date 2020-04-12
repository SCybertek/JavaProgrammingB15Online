package day64;

import java.util.*;

public class Map_valuesView {
    public static void main(String[] args) {

        //in order to get all the values in the map and store it to collection
        //we can use values method from the map at it will return
        //a collection objcet that contains all the value

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Collection<Double> itemValue = groceryPriceMap.values();

        System.out.println("itemValue = " + itemValue);
        itemValue.remove("Tomato");
        System.out.println("itemValue = " + itemValue);
        //view is strongly connected to original item !! so when youiterate and tremove the map itself will change as well
        //if you do not want changes to reflects.. the WHOLE KEY VALUE PAIR IS GONE!!
        //we copy


        Collection<Double> itemValueCopy = new LinkedList<>(itemValue); //or groceryPriceMap.values() inside here
        itemValue.remove(1.89);
        System.out.println("itemValueCopy = " + itemValueCopy);
        System.out.println("itemValue = " + itemValue);
    }
}
