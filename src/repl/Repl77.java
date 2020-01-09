package repl;

import java.util.Scanner;

public class Repl77 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        //                     01234567890123456789
        // user will provide : mike_tyson@gmail.com
        // first name : Mike
        // etc.
        //logic : take email apart to take first name and lats name and domain and top-level domain
        // we need to use string methods like index of and substring
        //also i need to make sure first letter of every word is upper case

        String firstName = email.toUpperCase().substring(0,1);
        firstName=firstName+email.substring(1,email.indexOf("_"));

        String lastName = email.toUpperCase().substring(email.indexOf("_")+1,email.indexOf("_")+2);
        lastName += email.substring(email.indexOf("_")+2, email.indexOf("@"));

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        String topLevelDomain = email.substring(email.indexOf(".")+1);

        System.out.println("First name: "+ firstName);
        System.out.println("Last name is: "+ lastName);
        System.out.println("Domain: "+ domain);
        System.out.println("Top-Level Domain: "+ topLevelDomain);





    }
}
