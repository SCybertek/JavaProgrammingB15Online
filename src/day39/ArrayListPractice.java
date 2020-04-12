package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> productList = new ArrayList<>(Arrays.asList
                ("iPhone 6s,449,18.71",
                        "iPhone 6s Plus,549,22.88",
                        "iPhone X,1149,56.16",
                        "MacbookPro,1499.99,79.49",
                        "ThumbDrive,39.99,2.68",
                        "Beats HeadPhones,349.99,15.12",
                        "Mous,79.99,8.98",
                        "Charger,39.99,4.56",
                        "iPad,429,18.31",
                        "Dyson Vacuum,399,16.25",
                        "TV,2199,89.49",
                        "Apple Watch,559,21.18"));


        System.out.println("productList = " + productList);

        System.out.println("product list element count = " + productList.size());

        System.out.println("\n--------------- TASK 1 ---------------\n");

        //task 1: print only item names

        for (String eachProduct : productList) {
            String namePart = eachProduct.split(",")[0];
            //get each product = cut by "," and get the first item :
            System.out.println("eachProduct = " + namePart);
        }

        // this is for loop version:

        for (int i = 0; i < productList.size(); i++) {
            String nameProduct = productList.get(i).split(",")[0];
            //name = first we get an item from array list. then we split by "," and we take out only first index ;
        }
        System.out.println("\n--------------- TASK 2 ---------------\n");
        //task2 : print all the prices more than 500

        for (String eachProduct : productList) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > 500) {
                System.out.println("price more than 500 = " + price);
            }
        }
        System.out.println("\n--------------- TASK 3 ---------------\n");
        //task3 : print average price

        double sum = 0;
        double average = 0;

        for (String eachProduct : productList) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum += price;


        }
        average = sum / productList.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        System.out.println("\n--------------- TASK 4 ---------------\n");

        //task4 : print all the items name that has less than $20 monthly payment.

        for (String eachProduct : productList) {

            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (monthly < 20) {
                System.out.println("monthly = " + monthly);

            }
        }
        System.out.println("\n--------------- TASK 5 ---------------\n");
        //Task5 : Print monthly payments for all the Iphone no matter what model


        for (String eachProduct : productList) {

            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }

        }
        System.out.println("\n--------------- TASK 6 ---------------\n");

        //Task6 : Print all info about most expensive item

        // to find an expensive item we have to find max first 

//        double maxPrice = Double.parseDouble(productList.get(0).split(",")[1] ) ;
//        //assuming that first item is max
//        int maxPriceIndex = 0 ;

//        for (int i = 0; i < productList.size(); i++) {
//
//            //  double price = Double.parseDouble(productList.get(i).split(",")[1]);
//
//            //or maybe cleaner way
//            // this is how we get each price part of items details
//            String priceStr = productList.get(i).split(",")[1];
//
//            //this is how we turn the priceString into double data type
//            double price = Double.parseDouble(priceStr);
//
//            if (price > maxPrice) {
//                maxPrice = price;
//                maxPriceIndex = i;
//            }
//        }
//        System.out.println("maxPriceIndex = " + maxPriceIndex);
//        System.out.println("maxPrice = " + maxPrice);
//        System.out.println("expensive item detail = " + productList.get(maxPriceIndex));

        // for each approach :


        System.out.println("\n--------------- TASK 6 with FOR EACH------------\n");
        double maxPrice = Double.parseDouble(productList.get(0).split(",")[1]);
        int maxPriceIndex = 0;
        String maxPriceItem = "";

        for (String eachProduct : productList) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > maxPrice) {
                maxPrice = price;
                maxPriceItem = eachProduct;
                // maxPrice becomes the new price
                // we need all info about max price
                // we need For LOOP!!!
                // to find the index ! ???

            }

        }

        System.out.println("maxPriceItem = " + maxPriceItem);
        System.out.println("maxPriceItem is at index :  "
                + productList.indexOf(maxPriceItem));


        System.out.println("\n--------------- TASK 7 ---------------\n");

        //Task 7 : Update Dyson price to %80 off
        // monthly payment (24 months) should also be calculated

        System.out.println(productList.contains("Dyson")); // fals e
        //STRING IS NOT A LIST
        System.out.println(productList.indexOf("Dyson")); //-1

        // find the location of dyson :
        int dysonIndex = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).startsWith("Dyson")) {
                dysonIndex = i;
            }
        }

        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetails = productList.get(dysonIndex);
        String name = dysonDetails.split(",")[1];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        dysonDetails = name + ", " + price * 0.2 + ", " + monthly * 0.2;
        System.out.println("dysonDetails = " + dysonDetails);

        productList.set(dysonIndex, dysonDetails);
        System.out.println("productLst = " + productList);



            System.out.println("\n--------------- TASK 8 ---------------\n");

            // count an item with more than average price

        int cnt = 0 ;
        for (String eachProduct : productList) {
            double price1 = Double.parseDouble(eachProduct.split(",")[1]);

            if (price1 > average) {
                ++cnt;
            }
        }
        System.out.println("cnt of items that have greater than average price = " + cnt);


            System.out.println("\n--------------- TASK 9 ---------------\n");
            // task 9 : remove all items with prices more than average price

        for (int i = 0; i < productList.size() ; i++) {
            double price1 = Double.parseDouble(productList.get(i).split(",") [1]) ;
            if (price1 > average) {
                productList.remove(i);
                --i; // we have to add this so our index after removing should decrease!!IMP
            }

        }
        System.out.println("productList count after removing = " + productList.size());

        System.out.println("\n--------------- TASK 10 ---------------\n");
        // task 10 : create 3 more array list objcets to seperately store
        // itemNames(String) , price (Double) , monthlyPayments (Double)

        ArrayList<String> itemNames = new ArrayList<>() ;
        ArrayList<Double> prices = new ArrayList<>() ;
        ArrayList<Double> monthlyPayments = new ArrayList<>() ;

        for (String eachProduct : productList) {
            // store the name part into ItemName list
            String name1 = eachProduct.split(",")[0];
            itemNames.add(name1);
            // store the name price into prices list
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            // store the name monthlyPart into monthlyParts list
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);

        }

        // list<Product> : customize your list
        System.out.println("itemNames = " + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);
        }
    }



