package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

        //smart lock door has password
        //unless you enter correct password
        //it keep locks you out
        //assuming correct password is B15
        //keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);

        System.out.println("Knock knock!!");
        System.out.println("whats the password?");
        //entering password for the first time
        String password = scan.next();
        int x = 1; // x ==3 ..need to incorporate this thing


        while (!password.equalsIgnoreCase("B15")) {
            // equals("B15") it should be equals in real lief because case sensitivity is the AIM of PASSWORD
            System.out.println("Wrong combination!! Try again!");
            password = scan.next();
            ++x;

        }
        System.out.println("open sesame!!!");

        //try yourself how to do only 3 times and then lock down !!

    }
}
