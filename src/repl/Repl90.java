package repl;
import java.util.Scanner;
public class Repl90 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

/*
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
 */

        System.out.println("Split:");
        String split = scan.next();
        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service quality:");
        String serviceQuality = scan.next();
        double totalTip = 0;

        if (serviceQuality.equalsIgnoreCase("poor")){
            totalTip = checkAmount*0.05;
        } else if (serviceQuality.equalsIgnoreCase("fair")){
            totalTip = checkAmount*10/100;
        } else if (serviceQuality.equalsIgnoreCase("good")){
            totalTip = checkAmount*15/100;
        } else if (serviceQuality.equalsIgnoreCase("great")){
            totalTip = checkAmount*20/100;
        } else if (serviceQuality.equalsIgnoreCase("excellent")){
            totalTip = checkAmount*25/100;
        }
        double totalToPay = checkAmount+totalTip;


        System.out.println("Number of people entered: &&&&&");
        System.out.println("Total to pay: "+ totalToPay);
        System.out.println("Total tip: "+ totalTip);
        System.out.println("Total per person: "+ totalToPay/numberOfPeople);
        System.out.println("Tip per person: "+ totalTip/numberOfPeople);




    }
}
