package day6;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        //5 5 divided by 2 is 2 and remainder is 1
        //2*2 + 1= 5
        System.out.println(5%2);
        //10*9+9=99
        System.out.println(99%10);
        System.out.println(100%10);
        System.out.println("---- modulus.remainder---");

        //Task
        //declare a variable called minutes data type int
        //ask user to enter a minute
        //print the result in x hour y minutes format
        //for example 135 min, 2 hours 15 min
        Scanner scan = new Scanner(System.in);


        System.out.println("Can you give me number of minutes?");
        int minute = scan.nextInt();
        int hourPart = minute/60; //135/60;
        int minPart = minute%60; //135%60;
        System.out.println(minute+ "is "+ hourPart
                          + " hours and "+ minPart+"min");









    }
}
