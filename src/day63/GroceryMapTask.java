package day63;

import java.util.*;
public class GroceryMapTask {

    public static void main(String[] args) {
        //create a Map of grocery items : 
        
        Map<String , Double> groceryItemMap = new HashMap<>(); 
        //add 7 items . try adding duplicates
        groceryItemMap.put("tomato",1.88);
        groceryItemMap.put("potato",2.88);
        groceryItemMap.put("tomato",2.00); // this one came in second so the value got updated
        groceryItemMap.put("watermelon",3.50);
        groceryItemMap.put("lemon",0.55);
        groceryItemMap.put("banana",0.99);
        groceryItemMap.put("apricot",4.99);

        //NO ORDER WHEN PRINTING THIS HASHMAP !

        System.out.println("groceryItemMap = " + groceryItemMap);
        groceryItemMap.putIfAbsent("potato",1.78); // did not update the items with new potato value since the method was used is putIfabsent!
        System.out.println("groceryItemMap after put if absent potato with different money = " + groceryItemMap);

        //get the 3rd item value ?

        System.out.println("groceryItemMap.get(\"watermelon\") = " + groceryItemMap.get("watermelon"));
        
        //double the price of the first and last item  ???
        System.out.println("groceryItemMap.replace(\"tomato\",2.00) new doubled pice = " + groceryItemMap.replace("tomato",2.00 ,4.00));
        System.out.println("groceryItemMap.get(\"tomato\") = " + groceryItemMap.get("tomato"));

        //but if did not know the old value ?? how to do that ?
        groceryItemMap.replace("apricot",groceryItemMap.get("apricot") * 2) ;
        System.out.println("groceryItemMap.get(\"apricot\") = " + groceryItemMap.get("apricot"));
        
        
        //remove tomato :
        //to check if tomato exists :
        if (groceryItemMap.containsKey("tomato")){
            groceryItemMap.remove("tomato");
            System.out.println("No more tomato!");
        }

        System.out.println("groceryItemMap = " + groceryItemMap);
    }
}
