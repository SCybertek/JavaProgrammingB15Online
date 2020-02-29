package day05;

import java.util.Scanner;
public class WageConverter {
    public static void main(String[] args) {

        /*Task 4 :
    *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.
    * */

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your hourly wage?");
        int wageInHour = scan.nextInt();
        int salary= wageInHour*2080;
        char dollarSign = '$';
        System.out.println("You earn "+ dollarSign +salary+" in a year" );



    }
}
