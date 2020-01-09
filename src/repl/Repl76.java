package repl;

import java.util.Scanner;

public class Repl76 {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String email = scan.next();
            String firstName = "",
                    lastName = "",
                  newEmail ="";
        String tempContainer= ""; // this is needed to swap

        if (email.contains("_")) {
            firstName = email.substring(0,email.indexOf("_"));
            lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));

            tempContainer= firstName; // mike is temporary container
            firstName = lastName ; // now mike is converting to Tyson
            lastName = tempContainer ; // tyson is in temporary container

            newEmail=firstName + "_"+ lastName + email.substring(email.indexOf("@"));


//            System.out.println("this is new first name :" + firstName); --> tyson i snew first name
//            System.out.println("this is new last name : "+ lastName); --> mike is new last name
            System.out.println(newEmail);

        } else {
            System.out.println(email);

        }


//            if(input.contains("_")){
//                firstName = input.substring(0 , input.indexOf("_"));
//                lastName = input.substring(input.indexOf("_") + 1 , input.indexOf("@"));
//
//                newEmail = input.replace(lastName, firstName);
//                newEmail = input.replaceFirst(firstName, lastName);
//            }
//            System.out.println(newEmail);// ???, ,    nm n bmnnm
        }
    }


