package day56;

import java.util.ArrayList;
import java.util.List;

// How does contains decide you have an object you are looking for in your list ?
// it will call .equals method of that type , if it's overridden to check for content
// then it will return desired result according to the content (attributes)
// else it will always return false

// same thing for remove ? how can i remove an item from the list using remove method that accept object ?
// first it decide whether you have that object or not by checking using contain method .
// if you have it then you remove ,  if contains return false you can not remove because we cant remove what we don't have

public class ProductListPractice {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add( new Product("Macbook Pro", 2999) ) ;
        productList.add( new Product("Sony TV", 499) ) ;
        productList.add( new Product("Macbook Air", 1299) ) ;
        productList.add( new Product("Iphone X", 999) ) ;
        productList.add( new Product("Iphone XL", 1299) ) ;
        productList.add( new Product("Sumsung 10", 1188) ) ;
        productList.add( new Product("Sumsung",1288));


        System.out.println("productList.size() = " + productList.size());

        //check whether we have "Sony TV" with 499

        //How does contains method decide whether the List contains the object we are looking for?
        //it will intrenally call the equals method of that type (product here)
        //if it return true then cointains method will true if not, return false

        ///wehn we cooment out Equals method in Product class then the result of our first statement is false , but why?

        Product sony = new Product("Sony TV",499);
        boolean result = productList.contains(  new Product("Sony TV", 499) ) ;
        System.out.println("Has Sony TV with price 499 or not result = " + result);
//
//        boolean result2= productList.contains( new Product ("Apple TV",1500));
//        System.out.println("Does list have Apple TV with price 1500 result2 = " + result2);
//
//        productList.remove(sony);
//        System.out.println("productList has Sony been removed?  = " + productList.contains(sony));

//        System.out.println("Has Apple TV, with 299 or not result2 = " + result2); // false , no apple

        // index of works exactly same way , it calls .equals of Product to decide where is the object
        System.out.println("productList.indexOf(sony) before = " + productList.indexOf(sony));
        // remove method will remove the object if the list contains the object
        // again this contains logic is using .equals to decide whether it exists in the list
        // if we have it we remove it(remove method return true)
        // if we don't have it do nothing (remove method return false)
        productList.remove(sony);
        // checking whether we have the Sony after calling remove method
        System.out.println("Has Sony TV after removing? = " + productList.contains(sony));
        System.out.println("productList.indexOf(sony) after = " + productList.indexOf(sony));

//        boolean result = false ;
//        for ( Product each : productList) {
////            if (each.getName().equals("Sony TV") && each.getPrice()==499) { //here equlas is coming from String methods !
////                result = true ;
////            }
//
//            //we just created .equal method in our product class. lets try using that
//
//            if ( each.equals(new Product("Sony TV",499)) ){
//                result = true;
//            }
//        }





    }
}
