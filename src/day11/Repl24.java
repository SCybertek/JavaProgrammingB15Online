package day11;

import java.util.Scanner;
import java.util.SortedMap;

public class Repl24 {
    public static void main(String[] args) {

//     // String firstName, lastName, fullName, email, street, state, city, address, contacts;
//     int age;
//     int zipcode;
//     double height;
//     double weight;
//     boolean isMarried;
//     long workPhoneNumber;
//     long personalPhoneNumber;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println( "Enter your last name");
        String lastName = scan.next();

        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();

        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.next();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String contacts =("Contacts: work phone number - "+ workPhoneNumber+ ", personal phone number - "+
                personalPhoneNumber+", email: "+ email);
        String fullName =("Full name: "+ firstName+", "+lastName);
        String address = ("Address: "+street+ ", "+ city +", "+state+" "+zipcode);

        System.out.println("Patient personal information");
        System.out.println(fullName);
        System.out.println(address);
        System.out.println(contacts);
        System.out.println("Age: "+ age);
        System.out.println("Height: "+ height);
        System.out.println("Weight: "+ weight+" pounds");
        System.out.println("Married?: "+ isMarried);




    }
}
