package repl;

import java.util.Scanner;

public class Repl35 {

    public static void main(StringMethodsPractice[] args) {
Scanner scan =new Scanner(System.in);

        String  item = scan.nextLine();

        int price = scan.nextInt();

        int currentBalance =100-price;

          if (!item.equals("Smartphone")|| !item.equals("Laptop") || !item.equals("Charger") || !item.equals("USB cable")
                || !item.equals("Headphones") || !item.equals("Pants") || !item.equals("Hat") || !item.equals("Socks")
                || !item.equals("Blanket") || !item.equals("Pillow"))
        {
            System.out.println("Invalid item!");
        } else if (price <=100) {
            System.out.println ("Thank you for your purchase!");
            System.out.println("You current balance is: "+currentBalance+"$");
        }else {
            System.out.println("Sorry, not enough funds on your gift card!");
        }


    }
}
