package repl;

import java.util.Scanner;

public class Repl104 {

    public static void main(String[] args) {

        //parsing practice :
        //take out of string name and lastname
        //use subsrtring() to slice string .and indexOf to find indexes

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        int firstName = json.indexOf("firstName");
        int firstComma = json.indexOf(",",firstName); // first comma after firstName
        int lastName = json.indexOf("lastName");
        int lComma = json.indexOf(",",lastName); //index of comma after last name

        System.out.println("First name: " + json.substring(firstName + 13 , firstComma-1));

        System.out.println("Last name: " + json.substring(lastName + 11, lComma -1));


    }
}
