package repl;

import java.util.Arrays;

public class Repl204 {
//isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.
//
//each letter in word1 should appear in word2 exact number of times
//ignore empty spaces
//make your code case insensitive
    public static boolean isAnagram (String word1, String word2) {

        char [] firstWord = word1.toLowerCase().toCharArray();
        char [] secondWord = word2.toLowerCase().toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        return Arrays.equals(firstWord, secondWord);

//        for (int i = 0; i < word1.length(); i++) {
//            for (int j = 0; j < word2.length(); j++) {
//                if ( word1.toLowerCase().charAt(i) == word2.toLowerCase().charAt(j)) {
//                    //how to make it ignore spaces??
//
//
//                    return true;
//                }
//
//            }
//        }
//        return false;






    }
}
