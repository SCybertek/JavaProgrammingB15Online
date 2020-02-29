package repl;

import java.util.Scanner;

public class Repl86 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // int x= 1;
        String guestName= "";
        String guestName1 = "";
        String guestList = "";

        do {
            System.out.println ("Please enter guest name:");
            guestName = input.next();
            System.out.println ("Do you want to enter new guest name:");
            guestName1 = input.next();
            if (!guestName1.equalsIgnoreCase("no")) {
                guestList += guestName + ", ";
            } else {
                guestList += guestName;
            }

        } while ( guestName1.equalsIgnoreCase("yes"));

        if ( guestName1.equalsIgnoreCase("no")) {
            System.out.println("Guest's list: " + guestList);
        }

        }
}
