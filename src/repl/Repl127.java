package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl127 {
    public static void main(String[] args) {


        int [] inhabitants = { 3,6,0,4,3,2,7,1} ;

//        logic:
        // first find out which index has max population
        // for this we have to loop every single city and compare each element of the string
//        int maxPopulation = inhabitants[0];
//        for (int i = 0; i < inhabitants.length; i++) {
//            if (maxPopulation < inhabitants[i]) {
//                maxPopulation = inhabitants[i];
//            }
//        }
//
//
//        System.out.println(maxPopulation);

// now we have to loop again the array until the maxPopulation city
// is down to 0

        int [] check = new int [] { 0, 0,0,0,0,0,0,0 };
        int day = 0;
       do {
           System.out.println("Day" + day ++  + Arrays.toString(inhabitants));
           for (int i = 0; i < inhabitants.length; i++) {
               if (inhabitants[i] == 0) {
                   continue;
               } else {
                   inhabitants[i] /= 2;

               }
               }


       } while (!Arrays.equals(inhabitants,check));

       //lets try doing with arrayList ?



            }
        }






