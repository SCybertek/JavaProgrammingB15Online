package MentoringSessions;

import java.util.Scanner;

public class SsnChecker {
    public static void main(String[] args) {



    // write a program taht promts user to enter SSN in this format : DDD-DD-DDDD
    //pseudo code:
    // divide String into 3 parts
    //check each part seperately and check
    //if each parts checks out write valid SSN if not not valid SSN

    Scanner input = new Scanner (System.in);
        System.out.println("Enter Your SSN please: ");

    String ssn = input.next();

    String firstPart ="";
    String secondPart = "";
    String thirdPart = "";

    firstPart = ssn.substring(0, ssn.indexOf("-"));
    secondPart =ssn.substring(ssn.indexOf("-")+1, ssn.lastIndexOf("-"));
    thirdPart = ssn.substring(ssn.lastIndexOf("-")+1);

        System.out.println(firstPart);
        System.out.println(secondPart);
        System.out.println(thirdPart);

        boolean firstCondition = false;
        boolean secondCondition= false;
        boolean thirdCondition = false;

        if (firstPart.length() ==3) {
            firstCondition = true;}
        if (secondPart.length()==2){
            secondCondition = true;}
        if (thirdPart.length() ==4){
            thirdCondition = true; }

        if (firstCondition && secondCondition && thirdCondition ){
            System.out.println("Valid SSN");
        } else {
            System.out.println("Invalid SSN");
        }

    }
}
