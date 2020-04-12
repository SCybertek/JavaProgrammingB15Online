package day63;

import java.util.HashMap;
import java.util.*;
public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBBBBBBCCCCRDDD";

        //our logic :
        // FREQUENCY MAP : in here char frequency

        // if I dont have it already then I will add it as 1 in char column : (basic calculation )

        //if I have it my count : then I will increase the existing count by one and replace the value by 1


        Map<Character, Integer> charFreq = new HashMap<>();
//char currentChar = str.charAt(i); we can store as well 

        for (int i = 0; i < str.length(); i++) {
            if (!charFreq.containsKey(str.charAt(i))) {
                System.out.println("Entering for the first time");
                charFreq.put(str.charAt(i), 1);
            } else {
                System.out.println("incrementing the coun dof " + str.charAt(i) + " by one and replacing old count " + charFreq.get(str.charAt(i)) );
                charFreq.replace(str.charAt(i), charFreq.get(str.charAt(i)) + 1); // here  we are updsating count !!
            }


        }
        System.out.println("charFreq = " + charFreq);
    }
}
