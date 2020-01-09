package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {
    public static void main(String[] args) {


        //create list of 6 double in short way
        // we will just read them
        // and will not add or remove items

        List<Double> prices = Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.76, 0.99) ;
        System.out.println("prices = " + prices);
//        prices.add(12.8);
//        prices.remove(0);
        // both we cannot do because when we create a short way of List we cannot 
        // add or remove! size has to stay the same!
        
        //we are going to count how many numbers are less than 5 
        
        int count = 0 ; 
        
        for (Double each : prices) {
            if (each>5) {
                ++count;
            }
        }
        System.out.println("count = " + count);

        // I want to add 2 more price s. how should I do ?
        // we copy first to be able to modify it

        ArrayList<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(199.99);
        newPrices.remove(0.99); // remove method will first occurence of the value 
        System.out.println("newPrices = " + newPrices);

        // do{ newPrices.remove(0.99)} while( !newPrices.contains(0.99))

        // create a ArrayList object is one short with many items so we can add or remove
        
        
        
        // this is one option to create ArrayList Object in one short version : 

        ArrayList<Double> oneShotPrice =
                new ArrayList<>(  Arrays.asList(9.99, 5.55, 3.76, 8.99) );
        // here we copy paste unmodifiable arrayList and made it modifiable 

        // how we add item 100.99 after 9.99
        oneShotPrice.add(1,100.99);

        //remove item 3
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice = " + oneShotPrice);
        //bulk operations:
        // removing list of something is another idea
        // 2 shopping cards.. create another arraylist where you take only the common part of 2 parts


        
    }
}
