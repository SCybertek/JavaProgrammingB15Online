package day16;

import java.util.SortedMap;

public class IntroToWhileLoop {
    public static void main(String[] args) {
         int x=0;
        while (x<5){
            System.out.println("Happy new year " + x);
            ++x;

        }

        System.out.println("---------------------------");

        int count = 1;
        System.out.println("Hello World");
        //count = count+1 ;
        //count +=1; //compound shorthand operator

        ++ count;
        System.out.println("Hello World");
        ++ count;
        System.out.println("Hello World");
        ++ count;
        System.out.println("Hello World");
        ++ count;
        System.out.println("Hello World");

        System.out.println("Count is "+ count);


        System.out.println("---------------------------");

        int cnt = 1;
        while (cnt<=5){
            System.out.println("Hello World");
            System.out.println("cnt value is "+ cnt);
            ++ cnt;
        }
        //itiration... one time going through the loop
        /*
        1st time in the loop: count = 1;
        check this 1 <=5 --> true
        hello worldcnt increase by 1
        increase the cnt value to 2

        2nd time in the loop : count = 2;
        check this 2 <=5 --> true
        count value is 2


         3rd  time in the loop: count = 3;
        check this 3 <=5 --> true
        hello worldcnt increase by 1
        increase the cnt value to 4

        4th time in the loop: count = 4;
        check this 4 <=5 --> true
        hello worldcnt increase by 1
        increase the cnt value to 5

        5th time in the loop: count = 5;
        check this 5 <=5 --> true
        hello worldcnt increase by 1
        increase the cnt value to 6

        6th time in the loop: count = 6;
        check this 6 <=5 --> false
        GET OUT OF THE LOOP!!!!!
         */


    }
}
