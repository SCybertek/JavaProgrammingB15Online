package thanksgivingTasks;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Ask user to enter a valid URL in below format
        www.blackfriday.com
        Write a program to print first Index of .(dot)
                and last index of .(dot)
                and eventually print the domain
        for example :
        www.nightwatch.com  --->> blackfriday

         */

        System.out.println("Enter valid URL");
        String email = scan.next();

        int indexOfDot = email.indexOf(".");
        System.out.println(indexOfDot);
        int lastIndexOfDot = email.lastIndexOf(".");
        System.out.println(lastIndexOfDot);



        System.out.println("domain is: "+email.substring(indexOfDot+1,lastIndexOfDot));



    }
}
