package day08;

import java.util.Scanner;

public class IfTaskTwo {

        public static void main(String[] args) {

            Scanner Mosh = new Scanner(System.in);

            System.out.println(" guess my favorite number");
            int   myFavoriteNumber = Mosh.nextInt();

            if ( myFavoriteNumber <= 300) {
                System.out.println("Bingo");

            } else {
                System.out.println(" you are not my best friend ");}






        }
    }