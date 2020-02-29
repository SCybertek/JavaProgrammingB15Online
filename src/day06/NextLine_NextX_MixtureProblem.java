package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = blabla.nextLine();
        System.out.println("Your name is "+ name);

        System.out.println("What is your age ? ");
        int age = blabla.nextInt();
        //String age = blabla.nextLine();

        //we need something to capture ENTER only
        blabla.nextLine(); //this guy is needed to capture ENTER
        System.out.println("Your age is "+ age);

        System.out.println("What is your address ? ");
        String address = blabla.nextLine();
        System.out.println("Your address is "+ address);

        //it did not ask a question for address
// IT went like this:
//        What is your name ?
//        sof
//        Your name is sof
//        What is your age ?
//        23  enter after this line
//        Your age is 23
//        What is your address ?
//        Your address is


    }
}
