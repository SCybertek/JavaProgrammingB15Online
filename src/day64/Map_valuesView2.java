package day64;

import java.util.*;

public class Map_valuesView2 {
    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Collection<Double> itemValue = groceryPriceMap.values();

        //remove all entries (key Value pair) if the price is greater than 3

        //use iterator
        // we cannot use FOR EACH
        //we do not have the index here as well
        //removing logic with Lambda expression !!
        itemValue.removeIf(eachPrice->eachPrice>3);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        //LOGIC!! WE iterating over the value view but since it has very strong connection between view and original map , it will remove in original as well

        //now with iterator :

//        Iterator<Double> item = itemValue.iterator();
//        while (item.hasNext()) {
//            if (item.next() > 3) {
//                item.remove();
//            }
//        }
//        System.out.println("itemValue after removing grape (more than 3)= " + itemValue); //outcome : [1.89, 1.99, 3.0, 1.99]
        
        //sort by value :
        System.out.println("itemValue = " + itemValue);
        String numbersString = itemValue.toString();
        Collections.sort(Arrays.asList(numbersString)); // DID NOT WORK!!!???? how to sort by value ?
        System.out.println("itemValue sorted= " + itemValue);
    }
}
