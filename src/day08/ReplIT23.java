package day08;
import java.util.Scanner;
public class ReplIT23 {
    public static void main(String[] args) {

            //YOUR CODE HERE
            Scanner scan = new Scanner(System.in);
  System.out.println("Can you please give area code and local number");
            int areaCode = scan.nextInt();
            int localNumber = scan.nextInt();

            String phoneNumber = "("+areaCode+")-"+localNumber;

  System.out.println("Calling number "+phoneNumber);


        }




    }

