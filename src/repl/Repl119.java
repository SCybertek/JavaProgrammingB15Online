package repl;

import java.util.Scanner;

public class Repl119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String[] emailSeparated = email.split("@");

        if (!email.contains("@") || emailSeparated.length > 2) {

            System.out.println("invalid email");
        } else {

            System.out.println("Email id: " + emailSeparated[0]);
            System.out.println("Email domain: " + emailSeparated[1]);
        }


    }
    }

