package day19;
import java.util.Scanner;

public class Shazam {
    public static void main(String[] args) {
//          * Write a program to
//        * repeatedly ask user for keyword to turn into super hero
//                * unless user say SHAZAM! in case insensitive manner
//                * program will keep asking
//                * and when you user enter Shazam! it will print you are now Super Hero!
//                *
//                hint : use do while loop
//                * */

        Scanner scan = new Scanner(System.in);
      //  System.out.println("Enter keyword to turn into superhero");
      //  String keyword = scan.next();

        String keyword;
        do {
            System.out.println("Enter keyword to turn into superhero");
           keyword =scan.next();

        } while (!keyword.equals("SHAZAM"));

        System.out.println("You are now a Super Hero!!");






    }
}
