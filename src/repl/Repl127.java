package repl;

import java.util.Arrays;

public class Repl127 {
    public static void main(String[] args) {


        int [] inhabitants = { 3,6,0,4,3,2,7,1} ;

//        logic:
        // first find out which index has max population
        // for this we have to loop every single city and compare each element of the string
        int maxPopulation = 0;
        for (int i = 0; i < inhabitants.length; i++) {
            if (inhabitants[maxPopulation] < inhabitants[i]) {
                i = maxPopulation;
            }
        }
        //why infinite loop??

        System.out.println(inhabitants[maxPopulation]);
// now we have to loop again the array until the maxPopulation city is down to 0

//        for (int i = 0; i < maxPopulation ; i++) {
//            for (int j = 1; inhabitants[j] != 0; j++) {
//                inhabitants[j] = inhabitants[j] / 2;
//            }



              //  System.out.println(Arrays.toString(inhabitants));
            }
        }
        //System.out.println(Arrays.toString(inhabitants));





