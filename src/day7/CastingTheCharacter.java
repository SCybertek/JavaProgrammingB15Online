package day7;

import java.sql.SQLOutput;

public class CastingTheCharacter {
    public static void main(String[] args) {
          char grade= 'B';
          System.out.println(grade);

          int letterInNumber = 'B';
          //output will be a number = 66 it is represented in ASCII table
        // here the char is automatically widened to Int and stored as number! IMPLICIT casting

        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        //----------------------------------

        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);

        // print your name in ASCII

        int letterS ='S';
        int letterO ='O';
        int letterF ='F';
        int letterI ='I';
        int letterY ='Y';
        int letterA ='A';

        System.out.println(letterS) ;
        System.out.println(letterO) ;
        System.out.println(letterF) ;
        System.out.println(letterI) ;
        System.out.println(letterY) ;
        System.out.println(letterA) ;

char letterG ='a';
System.out.println(" "+ letterG+1); //programm runs from left to right








    }
}
