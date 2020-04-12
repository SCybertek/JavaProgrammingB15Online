package day43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starbucks {

    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        System.out.println("c1 = " + c1);

//        List<String > lst = new ArrayList<>() ;
//        lst.add("abc");
//        lst.add(null) ; // null means NO OBJECT
//        lst.add(null) ;
//        // any non primitive type can be assigned to null
        // null means no POINTER  in the BOX!


        //Coffee c1 = new Coffee("decaf", 12,2.5) ;
       // c1.setPrice(-4.99);
       // System.out.println(c1);

//        c1.setType("Turkish");
//        c1.setCaffeineLevel(8);
//        c1.setPrice(-4.99);
//        System.out.println("c1 = " + c1.toString());

        Coffee c2 = new Coffee("Intensito", 9);
        System.out.println("c2 = " + c2);

        Coffee c3 = new Coffee("Blonde", 5, 1.6);
        System.out.println("c3 before = " + c3);
        c3.setPrice(-100);
        System.out.println("c3 after= " + c3);

        Coffee c4 = new Coffee("Latte", 3, -2.6);
        System.out.println("c4 = " + c4);


        double sumOfAllCoffee = c1.getPrice() + c2.getPrice() + c3.getPrice() + c4.getPrice();
        System.out.println("sumOfAllCoffee = " + sumOfAllCoffee);


//        String str = null ;
//        Scanner scan = null ;
//        Coffee cx = null ;
// LISTEN TO jan 18 recording from 1140AM till 12:00 PM I guess ..above part of null


    }
}
