package day18;

import java.util.Scanner;

public class SmartLockOpenerDoWhileLoop {
    public static void main(String[] args) {

        //smart lock door has password
        //unless you enter correct password
        //it keep locks you out
        //assuming correct password is B15
        //keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);

        System.out.println("Knock knock!!");

        //entering password for the first time
        String password ;
       // int count =1;

        do {
            System.out.println("whats the password?");
            password = scan.next();


        } while (!password.equals("B15"));

        System.out.println("Door is open!!!");



    }
}
