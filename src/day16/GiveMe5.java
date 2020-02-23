package day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GiveMe5 {

    public static void main(String[] args) {


        // I want to ask user to enter a number
        // I will keep asking until user actually enter number 5

        Scanner scan = new Scanner(System.in);

//        System.out.println("GIVE ME FIVE !!!");
//        int userNumber = scan.nextInt() ;
//
//        if( userNumber != 5 ){
//            System.out.println("HEY YOU DID NOT GIVE ME 5!!");
//        }
        int userNumber = 0;

        while (userNumber != 5) {

            System.out.println("GIVE ME FIVE !!!");
            // userNumber = scan.nextInt();

            try {
                userNumber = scan.nextInt(); // ask user to enter number , might get letter instead
                if (userNumber == 5) { // if correct number we get out of the loop
                    System.out.println("BINGO! YOU HAVE ENTERED 5 !!!!");
                    break; // get out of while loop !!!!
                }
            } catch (InputMismatchException e) {
                System.out.println("Please Enter Number!");
                // to capture invisible blank line when entering anything not number
                scan.nextLine();
            }

        }


        System.out.println("END OF THE PROGRAM");


    }
}

