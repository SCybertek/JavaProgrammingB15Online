package day63;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class FindingCharacterThatShowedUpAtLeastOnce {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        // // How many unique(non-repeating ) character showed up in above sentence
        //        // Basically we are looking for all the non-repeating character to make up this sentence
        //        // for example if you have AAABBC  -->> ABC
        //
        //        // ONE WAY TO DO IT
        //        // first find a data structure that automatically remove duplicate ( create a HashSet object with type Character)
        //        // iterate over each character in above String
        //        // then add it to the object (HashSet) so it can remove the duplicate for us

        //task here is to show each character only once!!!
        // not finding 1 chacarter that appeared only once and print it


        Set<Character> charSet = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
            //output for HashSet:  [A, C, D, E, G, H, I, K, L, M, N, O, P, R, S, T, Y,  , a, b, c, e, f, g, h, i, j, k, l, ,, n, ., o, p, q, r, s, t, u, w, y]
            //output for LinkedSet : [T, h, e,  , n, w, l, i, k, f, o, r, j, g, c, a, s, q, u, y, t, O, ,, p, b, ., P, L, E, A, S, D, N, R, Y, G, I, H, K, M, C]
            //output for TreeSet : [ , ,, ., A, C, D, E, G, H, I, K, L, M, N, O, P, R, S, T, Y, a, b, c, e, f, g, h, i, j, k, l, n, o, p, q, r, s, t, u, w, y]
        }

        System.out.println("How many character overall?  = " + str.length());
        System.out.println("How many Unique Characters ? charSet.size() = " + charSet.size());
        System.out.println("charSet = " + charSet);


        for (Character each : charSet) {
            System.out.println("each = " + each);
        }


        // //SELF STUDY :
        //        //in order to print each char only once from this string above .. I can use couple loops or we can put into a SET : hashset : no sort no insertion..removing duplicates
        //
        //
        //        Set<Character > charSet = new HashSet<>();
        //
        //        for (int i = 0; i < str.length(); i++) { // iterate over a string
        //            charSet.add(str.charAt(i)); // adding each char into a charSet .. no other conditions needed since hashset will automatically remove duplicates
        //        }
        //        System.out.println("str how many total chars in string= " + str.length());
        //        System.out.println("charSet = " + charSet);
        //        System.out.println("charSet.size() hwo many chars= " + charSet.size());

    }
}
