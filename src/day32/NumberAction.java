package day32;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import javax.swing.plaf.IconUIResource;
import java.time.temporal.IsoFields;

public class NumberAction {
    public static void main(String[] args) {

        /*
        Create static methods:
        numberComparison
        has 2 parameters num1 and num2
        if num1 > num2 print num1 is bigger than num2
        if num2 > num1 print num2 is bigger than num1
        if they are equal print they are equal


         */
//        numberComparison(45, 9);
//        numberComparison(7, 12);
//        numberComparison(6, 6);
//
//        skipCountBy3From50();
//        countDownByEvenNumberFrom50to0();
        print1toX(7);
        print1toX(0);
        print1toX(1);
        //stringRepeater("Sofiya", 3);

        countDownFromXtoY(20,10);


    }


    public static void numberComparison(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println(num1 + " is equal to " + num2);

        }
    }
//    String repeater
//        this has 2 parameters
//    String strToRepeat and int count
//    repeat printing the string as many times as <count> number define

    public static void stringRepeater(String strToRepeat, int count) {

        //logic string = hello int 2
        //output should be hello , hello

        //String name = "mama";

        for (int i = 0; i <= count; i++) {
            System.out.println(strToRepeat);
        }


//     skipCountBy3From0to50
// *
// * * create a method that has no parameter
// * and skip count by 3 from 0 to 50
    }

    public static void skipCountBy3From50() {

        for (int i = 0; i <= 50; i = i + 3) {
            System.out.print(i);
        }
    }


//  countDownByEvenNumberFrom50to0
// * * create a method that has no parameter
// * and count Down By Even Number From 50 to 0
// * for example 50 , 48 , 46 .....0
// *

    public static void countDownByEvenNumberFrom50to0() {
//        for (int i = 50; i >= 0; i--) {
//            if (i % 2 == 1) {
//                continue;
//            }
//            System.out.print(i + " ");
//        }

        countDownFromXtoY(50,0);

        // it is possible to call method inside a method !!

    }

    //instead of counting down from 50 to 0 now count down from x to y

    public static void countDownFromXtoY (int x, int y) {

        for (int i = x; i >= y; i--) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

//    print1toX
// * * create a method that has 1 int parameter called x
// * print from 1 to that number in one line
// * print an empty line after the print.

    public static void print1toX(int x) {

        if (x > 1) {

            for (int i = 1; i <= x; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else if (x < 1) {

            for (int i = 1; i >= x; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.print("Number provided is 1");
        }
        System.out.println();


    }
}





