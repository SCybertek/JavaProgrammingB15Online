package day5;

import java.util.Scanner ;
public class TheScannerWay {
    public static void main(String[] args) {
        //ask user for name
        //and capture the result
        //print your name as is
        //ask user for birth year
        //and capture the result
        //print the age
        //ask user for height
        //and capture the result
        //print the height
// You can name your variable whatever you want, we called it here as SCAN
        //Scanner is data type, scan is the variable name, new Scanner(System.in) is value
        Scanner scan = new Scanner(System.in); //SCANNER OBJECT -like coffee machine

        System.out.println("What is your name: ");
        //String name = "Sam";
        String name = scan.next(); // this helps is to capture the answer
        System.out.println("Your name is "+ name);
/* getting single word as string --> scan.next();
getting single word as int --> scan.nextInt();
getting single fractional number as double --> scan.nextDouble();
getting single fractional number as float --> scan.nextFloat();


 */

        System.out.println("What is your birth year: ");
        int birthYear = scan.nextInt();
        int age = 2019 -birthYear;
        System.out.println("Your age is: "+ age);

        System.out.println("What is your height? ");
        double height = scan.nextDouble();
        System.out.println("Your height is: " + height);






    }
}
