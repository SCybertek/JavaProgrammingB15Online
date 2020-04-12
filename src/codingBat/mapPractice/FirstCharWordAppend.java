package codingBat.mapPractice;
import java.util.*;
public class FirstCharWordAppend {

    public static void main(String[] args) {

        String[] strings = {"salt", "soda", "toast", "tea"};

    }
    //TODO Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
    // with the value of all the strings starting with that character appended together in the order they appear in the array.

    public Map<String, String> firstChar(String[] strings) {
        Map<String,String> map1 = new LinkedHashMap<>();
        for (String each: strings) {
            String firstChar = "" + each.charAt(0);
            if (!map1.containsKey(firstChar) ) {
                map1.put(firstChar, each) ;
            } else {
                map1.put(firstChar, map1.get(firstChar) + each) ;
            }
        }
        return map1;
    }

    //TODO Loop over the given array of strings to build a result string like this:
    // when a string appears the 2nd, 4th, 6th, etc. time in the array,
    // append the string to the result. Return the empty string if no string appears a 2nd time.

    public String wordAppend(String[] strings) {
        //fails ? why ?
        String result = "";
        for ( int x = 0 ; x < strings.length  ; x ++) {
            for ( int y = 0 ; y < strings.length ; y ++ ) {
                if ( strings[x].equals(strings[y]))  {
                    result += strings[x];
                } else {
                    result= "";

                }
            }

        }
        return result ;
    }



}

