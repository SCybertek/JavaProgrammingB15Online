package repl;

import java.util.Scanner;

public class Repl34 {

    public static void main(StringMethodsPractice[] args) {
        // int itemPrice, quarters, dimes, nickels;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price in cents:");
        int itemPrice = scan.nextInt();

        if (itemPrice < 25 || itemPrice > 100) {
            System.out.println("Invalid price!");
        } else if (itemPrice % 5 != 0) {
            System.out.println("Invalid price!");
        } else if (itemPrice % 5 == 0) {

            int quarters = (100 - itemPrice) / 25;
            int dimes = (100 - itemPrice - quarters*25)/10; // (100-itemPrice)%25/10;
            int nickels = (100 - itemPrice - quarters*25 - dimes*10)/5; // (100-itemPrice)%25%10/5;
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");


        }
    }
}
