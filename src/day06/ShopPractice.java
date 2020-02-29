package day06;
import java.util.Scanner;

public class ShopPractice {
    public static void main(String[] args) {
        //create a program to calculate the final discounted price of an item
        //create 3 double variables called regularPrice, sale price and discountPercentage
        //ask user questions using scanner for regularPrice and discountPrecentage ans dave the result into the variable
        //calculate sale price using above infor
        //ex: 80 regiular price, 0.2 for discount , salePrice --> 64
        //print out: regular price is 80 , disount 0.2 and you get deal for 64
        Scanner scan = new Scanner(System.in);


        System.out.println("How much does it cost? :");
        double regularPrice = scan.nextDouble();
        System.out.println("What is discount rate:  ");

        double discount= scan.nextDouble();

       // System.out.println("What is the sale price?");

        double salePrice = regularPrice -(regularPrice*discount);
        System.out.println("With sales price "+ regularPrice+ "and discount price "+ discount+ "your final price is "+ salePrice);




    }
}
