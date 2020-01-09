package day10;

import java.util.Scanner;

public class OfficeHour {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scan.nextInt();
        scan.nextLine(); // This is there to capture the ENTER
        System.out.println("What is your full name?");
        String fullName = scan.nextLine();
        System.out.println(("Your name is "+ fullName+ " ,your age is "+age));
//yesterdays office hoyr bakkkk


        /* Conditional statement

        if else
        if
        if else if... else
        switch


        If (some boolean condition here) {
        take this action if its true}
        else{
        take some other action if its false
        }

        few common mistakes:
        int x = 10;
        if(x>9) --> paranthesis is closed early!
        if (x>9); { --> NO SEMI COLON!
        Writing if else if -- accidentally become isolated if statements
        if (x>10) {
        some action here}
        if (x<10) {
        //something else here}

         */



    }


}
