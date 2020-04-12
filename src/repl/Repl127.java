package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl127 {
    public static void main(String[] args) {


        int [] inhabitants = { 3,6,0,4,3,2,7,1} ;
        int [] check = new int [] { 0, 0,0,0,0,0,0,0 };

        int day = 0;

        System.out.println("Day " + day + " "  + Arrays.toString(inhabitants));

       do {

           for (int i = 0; i < inhabitants.length; i++) {
               if (inhabitants[i] != 0)
                   inhabitants[i] /= 2;

               }

        day++;
           System.out.println("Day " + day + " "  + Arrays.toString(inhabitants));


       } while (!Arrays.equals(inhabitants,check));


        System.out.println("---- EXTINCT ----");


            }
        }






