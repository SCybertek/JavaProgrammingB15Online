package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperations {
    public static void main(String[] args) {

        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon") ;
        // thi sis undmodieable list .. go get your grocery
        System.out.println("groceries = " + groceries);

        // now we need something modifiable .. so :
        ArrayList <String> newList = new ArrayList<>(groceries);
        // now it is modifieable
        newList.add("Diet coke");
        newList.add("Sugar");

        System.out.println("newList = " + newList);

        // actually I have list of item for you here : Pasta, asparagus, spinach
        //good news I already created a list object for you so you can just add them all to your existing list
        
        List<String> newItemsToAdd = Arrays.asList("Pasta", "Asparagus", "Spinach");
        // adding one list to another list 
        /// we want to add all items inseide newItemsToAdd to newList
        
        newList.addAll(newItemsToAdd) ;
        System.out.println("newList with all items= " + newList);



    }
}
