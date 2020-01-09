package day19;

import java.util.Scanner;

public class AddingNumbersWithinRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //HOMEWORK
        // create a program to ask user 2 number and add numbers within those range

        System.out.println("Give me two numbers");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        int sum = 0;

        for (int i = firstNumber; i < secondNumber; i++) {
          //  System.out.println(i);
            sum = sum + i;

        }System.out.println("Sum of numbers in this range is: " + sum);

        //Here I am assuming that first number entered is smaller than the second one
        //if user provides 8 and then 1 .. sum shows as : 0




    }
}
