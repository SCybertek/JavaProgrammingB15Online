package day32;

import java.sql.Struct;

public class StringAction {
    public static void main(String[] args) {
        /*
        Create below static void methods :
and call them in main method to test.
reversePrintMyOwnName
* create a method that has no parameter
	and print your name in reversed order

         */
        // reversePrintOwnName();
        // print each and every char of the string with dash in between excluding the last one
        //logic:
        //keep adding dash after each char
        // at the last char do n ot add it
        // break after a last one -

        /*
        printStringWithDashInBetween
        it accepts one String parameter
        print each char with - in between
        but no - after last char
         */

        String name = "Akbar";


        //another solution
        //if(i ==name.length()-1){
        //    break;
        //}
        //System.out.print("-");


        //for reverse one
        //if (i != 0) {
        //    System.out.print(myName.charAt(i) + "-");
        //} else {
        //    System.out.print(myName.charAt(i));
        //}

        printStringWithDashInBetween("Mervin");
        printStringWithDashInBetween("Sofiya");
        printStringWithDashInBetween("Begli");
        printStringWithDashInBetween("Miles");
    }


    public static void printStringWithDashInBetween(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            //if i am not at last index then i print "-"
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }

        //   static:   i dont need an object
        //   void : nothing is stored (
        public static void reversePrintOwnName () {
            String name = "Akbar";
            // start from last char and print until the beginning
            for (int i = name.length() - 1; i >= 0; i--) {
                System.out.print(name.charAt(i));

            }

        }

}
