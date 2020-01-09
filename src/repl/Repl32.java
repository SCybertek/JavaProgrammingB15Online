package repl;

import java.util.Scanner;

public class Repl32 {

        public static void main(StringMethodsPractice[] args) {
            //YOUR CODE HERE:
            Scanner scan = new Scanner(System.in);
            int inputSeconds, hours, minutes, seconds;

            System.out.println("Enter seconds");
            inputSeconds = scan.nextInt();

            hours = inputSeconds / 3600;
            minutes = (inputSeconds-3600*hours)/60;
            seconds = inputSeconds-3600*hours - minutes*60;
            System.out.println(hours+" hours, "+ minutes+" minutes, and "+seconds+" seconds");

        }
    }
