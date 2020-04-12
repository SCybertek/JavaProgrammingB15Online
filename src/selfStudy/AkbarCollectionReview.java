package selfStudy;

import java.util.*;

public class AkbarCollectionReview {
    public static void main(String[] args) {

        /**
         *  UNIQUE :
         *         how it decides ? listen hashset deciding uniqueness using hashCode and equals Method
         *         equals method and hasCode method from Object class
         *         to provide logic for uniqueness in HashSet, we need to override them
         */

                // Lets assume you are searching for iphone on amazon
                // many search results came in
                // i want you to store all the price element on the result page
                // in the meantime ,I want you to store all the price text into a List
                // we can use findElements and getText together
                // it will give us a List<String> that contains prices
                // but we want to get List<Double>


       // List<String> priceLstStr = new ArrayList<>(Arrays.asList("99.99", "57.29", "982.50","79.99") );
        //NOT modifiable : Arrays.asList("99.99", "57.29", "982.50","79.99");
        //in collection you can always dump one list into another list !
        //here we make it modifiable by doing so: new ArrayList<>(Arrays.asList("99.99", "57.29", "982.50","79.99") );

        //Arrays.asList("3","2"); ==> outcome is List .. //it returns an Objcet that we dump into another ArrayList()
        //AND THATS why we have 2 objects in here!!!!

        /**
         * public static <T> List<T> asList(T... a) {
         *         return new ArrayList<>(a);
         *     }
         *      this is the method that we used and it has return type of a new OBJECT !
         */

        String price = " 100.99";
        double priceNum = Double.parseDouble(price);

        System.out.println("price = " + price);

        List<String> priceLstStr = new ArrayList<>(Arrays.asList("982.50","99.99", "57.29", "982.50","79.99","79.99") );

        // I want to geth the prices inside List<Double>
        List<Double> prices = new ArrayList<>();

        for (String each : priceLstStr) {
            prices.add(Double.parseDouble(each));
        }
        System.out.println("prices in double = " + prices);

        //how do I get max price , min , and average
//LOGIC:
        //get list of price!!! each item price should share same attribute\
        //get the list of names of the items
        //they all are sharing the same index..if the item APPLE is index 0 the price for that apple will be on the index one as well



        //remove items above the average


        //get the unique prices
        //logic: if requirement does not say DO NOT use Set then just use it

        Set<Double> uniquePrices = new HashSet<>(prices);
//        for ( Double eachPrice : prices) {
//            uniquePrices.add(eachPrice);
//        }
        System.out.println("uniquePrices from our Double list = " + uniquePrices);

        //what if we want to have a list that contains


        //SOFTSKILLS:
        //Zephyr ... someting like Jira-XRay
    }

    }

