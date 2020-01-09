package thanksgivingTasks;

import java.util.SortedMap;

public class Task12 {
    public static void main(String[] args) {
//        Given a String with at least two characters
//        swamp first character with last character
//        for example
//        Java --> aavJ , Kawap --> pawaK
        //             0123456789
        String swap = "Karnabahar";

        // find the location of last character
        // to swap use replace method

        int locationOFLastCharacter = swap.length()-1;
        char lastChar = swap.charAt(locationOFLastCharacter);


        System.out.println(swap + " : " + swap.replace(swap.charAt(0),lastChar));
    }
}
