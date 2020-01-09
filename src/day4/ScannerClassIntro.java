package day4;

import java.util.Scanner;

public class ScannerClassIntro {
    public static void main(String[] args) {
        //scanner is already included in your JAVA
        //import scanner class --> import java.util.Scanner;
        //scanner object --> Scanner input = new Scanner(System.in);



//I want to save users input after asking some questions
        //and I want to save this input so I can do something with it
        //Step 1: Use Scanner class to create scanner object
                //that have this functionality
        Scanner abc = new Scanner(System.in);//can be Scanner SCAN
        //ask user to enter name
        System.out.println("Enter your first name please: ");
        //capture what user typed on keyboard in console
        //abc.next() is to capture a single word
        String firstName = abc.next();
        //print the result of what we saved from user input for name
        System.out.println("You have entered: "+ firstName);
        //Ask question before
        System.out.println("What is your age? : ");
        //capture what user typed on keyboard in console
        int age = abc.nextInt();
        //scan.nextInt() to capture number
        //print the result of what we saved from user input for age
        System.out.println("Your age is : " + age);
    }
}
