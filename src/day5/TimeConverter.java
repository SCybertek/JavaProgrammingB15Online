package day5;

import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {


        /* Task 3:
    Create an interactive program to ask user for day and generate minute that day have



     */
        Scanner abc = new Scanner(System.in);
        System.out.println("Tell me the number of days? ");

        int day = abc.nextInt();
        int calculateMinute = day*1400;

        System.out.println("There are "+ calculateMinute + " minutes in "+ day + " days");


    }



}
