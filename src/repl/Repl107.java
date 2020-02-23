package repl;

import java.util.Scanner;

public class Repl107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, digit1, digit2, digit3, digit4, digit5;
        num = scan.nextInt();


        //repl code:
        digit1 = num / 10000 ;
        digit2 = num % 10000 / 1000 ;
        digit3 = num % 10000 % 1000 / 100 ;
        digit4 = num % 10000 % 1000 % 100 / 10 ;
        digit5 = num % 10000 % 1000 % 100 % 10 ;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);

        //PERFCET SOLUTION :

        String num1= num+"";
        for (int i=0;i<num1.length();i++) {
            System.out.println(num1.charAt(i));
        }

        //use / and % operators

        // ex: 1234 -->
        // outcome : 1
        //           2
        //           3
        //           4
//        digit1 = num % 10;
//        System.out.println(digit1); // 3
//
//        num = num /10; //12
//
//        digit2 = num % 10;
//        System.out.println(digit2);
//
//        num = num /10;
//
//        digit3 = num % 10;
//        System.out.println(digit3);//1
//
        // not turn it into for each loop !!!




        for (int i = num; i >= 1 ; i=i/10) { // 123 = i ; 12 = i  ; 1 = i
            //num=num/1000;
            System.out.println(i%10); // print 3 ; 2 ; 1

        }

    }
}
