package day5;

import java.util.Scanner;

public class ScannerTemperatureConverter {
    public static void main(String[] args) {
        /*
        Task : Create a program to ask user fahrenheit and convert into Celsius
        (32F -32)*5/9= 0 celsius
        task: how many seconds there are in 1 hour
         */

        Scanner input = new Scanner (System.in);

        System.out.println ("What is the temperature in F? ");
        double fahrenheit = input.nextDouble();
        double celsius    = (fahrenheit-32)*5/9;
        //Fah 80 is 23 celsius
        System.out.println ("fahrenheit "+ fahrenheit +" is "+ celsius+ " in celsius");


    }
}
