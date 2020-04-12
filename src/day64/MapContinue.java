package day64;
import java.util.* ;


public class MapContinue {
    public static void main(String[] args) {

        //map is not iterable and thats why we have to use methods of map like :
        //keySet view = set, value view= collection , entrySet view = set
        //in order to convert it into a set and we can iterate !!!!!

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);
        groceryPriceMap.putIfAbsent("Apple", 100.0);

        //Map VIEW:
        //keySet view , value view , entrySet view
        
        //How do I store all the keys into a Collection ? 
        //what do you think the data type will be to store such collection? 
        //SET -- because keys are unique 
        
        // to get ONLY key :
        Set<String> allNames = groceryPriceMap.keySet();
        //this is a method of MAP.. the result can be any set ! hasshet or anything we do not care 
        System.out.println("allNames = " + allNames);
        //how do we remove :
//        allNames.remove("Tomato"); // how to remove from the SET ?
//        System.out.println("allNames no tomato = " + allNames);

        System.out.println("groceryPriceMap after= " + groceryPriceMap); //it is still connected to original MAP
        //so tomato is removed from the original as well

        ///what if we do not want such relationship and we just want to use the keys somewhere else?
        //get A COPY of the set into different object

        Set<String > namesCopy = new HashSet<>(allNames);
        //now we have it in here and all names collection will not be modified
        //advantages of constructor . we can dump all collection in here
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);




        

        // to get ONLY  values : value view = collection

        // to get everything in a set : ENTRY SET VIEW (?)


    }
}
