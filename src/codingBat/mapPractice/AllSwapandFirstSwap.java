package codingBat.mapPractice;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwapandFirstSwap {


    //TODO We'll say that 2 strings "match" if they are non-empty
    // and their first chars are the same.
    // Loop over and then return the given array of non-empty strings as follows:
    // if a string matches an earlier string in the array, swap the 2 strings in the array.
    // When a position in the array has been swapped, it no longer matches anything.
    // Using a map, this can be solved making just one pass over the array.
    // More difficult than it looks.

    //public String[] allSwap(String[] strings) {
//        Map<String, Integer> myMap = new HashMap<>();
//        for (int x = 0; x < strings.length; x++) {
//            if (!myMap.containsKey(strings[x])) {
//                myMap.put(strings[x], 1);
//            } else {
//                myMap.put(strings[x], myMap.get(strings[x]) + 1);
//            }
//            //???
//
//            //same char should be swapped
//
//
//            String[] myString = new String[strings.length];
//
//            //  for ( int x= 0 ; x < strings.length -1 ; x++ ) {
//            if (strings[x].charAt(0) == strings[x + 1].charAt(0)) {
//                String temp = strings[x];
//                strings[x] = strings[x + 1];
//                strings[x + 1] = temp;

//            }
//
//        }
        // return myString;
        // }


        //TODO We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
        // Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
        // swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap,
        // its later swaps are disabled. Using a map, this can be solved making just one pass over the array.
        // More difficult than it looks.

//    public String[] firstSwap(String[] strings) {
//
//    }
    }


