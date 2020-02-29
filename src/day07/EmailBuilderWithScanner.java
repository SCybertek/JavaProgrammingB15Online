package day07;
import java.util.Scanner;
public class EmailBuilderWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name,last name, company separated by space:");

        String firstName, lastName, company, email;
        firstName= scan.next(); //"Sofiya";
        lastName= scan.next();// "Nuryyeva";
        company = scan.next(); //"verizon";
       // char atSign='@';
        email =firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is "+ firstName+ " "+lastName+" and I work for "+ company+ " and my email is "+email);

//space between words indicates that there is another word after it

    }

}
