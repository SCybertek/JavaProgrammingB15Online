package day08;

import java.util.Scanner;
public class ReplIT22 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1 and its price: ");
        String item1 = scan.next();
        float price1 = scan.nextFloat();

        System.out.println("Enter Item2 and its price: ");
        String item2 = scan.next();
        float price2 = scan.nextFloat();

        System.out.println("Enter item3 and its price: ");
        String item3 = scan.next();
        float price3 = scan.nextFloat();

        float totalPrice = price1 + price2 + price3;

        String report = ("Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3 + "\n" + "Total price: " + totalPrice);

        System.out.println(report);
    }
}
