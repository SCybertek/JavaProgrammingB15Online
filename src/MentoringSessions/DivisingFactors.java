package MentoringSessions;

import java.util.Scanner;

public class DivisingFactors {
    public static void main(String[] args) {


/**
 * What we will use for solving?
 *  Loop
 *  modulus operator
 *  Step by step divide this number
 *
 *  User input a number
 *  find factors of this number from in increasing order
 *
 *
 *  4%2==0
 *  15%2 == 1
 *  15%3 == 0
 *
 *  120%2=0     2 is a factor
 *  120/2=60
 *  60%2=0
 *
 *
 */

                Scanner input= new Scanner(System.in);
                System.out.println("Please enter a number : ");
                int number=input.nextInt();
                int divider=2;

                while(number>1){
                    if(number%divider==0) {
                        System.out.println(divider);
                        number = number / divider;
                        System.out.println("Divided number "+number);
                        while(number%divider == 0){
                            System.out.println(divider);
                            number = number / divider;
                            System.out.println("Divided number "+number);

                        }
                    }
                    divider++;
                }
            }
        }

    //anlamay acalis

