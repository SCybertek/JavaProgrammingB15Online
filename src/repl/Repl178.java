package repl;

import java.util.Arrays;

public class Repl178 {
    public static void main(String[] args) {
       
        //logic: 
        //merging strings : 
        // one letter of every string . substring and add the next one 
        
        String s1= "12345";
        String s2 = "abcde";
        //expected result = "1a2b3c4d5e"

        int a = 12;
        int b = 4;

        System.out.println(Math.max (a,b));
        System.out.println(Math.addExact(3,b));





      //  System.out.println(mergeStrings("1234","abc"));
       // System.out.println(mergeStrings("1234","abcd"));
        System.out.println(mergeStrings("123","abcdef"));

     
        
//        String mergeString = "";
//
//        for (int i = 0; i < s1.length() ; i++) {
//            mergeString += s1.substring(i,i+1);
//            for (int j = 0; j < s2.length(); j++) {
//                   if (i==j) {
//                       mergeString += s2.substring(j, j + 1);
//                   }
//                }
//            }
//
//
//        System.out.println("mergeString = " + mergeString);


////
    }
// this down below works for when strings are same length or first is longer
    // but I could not make it work if second string is longer

//    public static String mergeStrings (String s1 , String s2) {
//        String result = "";
//
//        for (int i = 0; i < s1.length() ; i++) {
//            result += s1.substring(i, i + 1);
//            for (int j = 0; j < s2.length(); j++) {
//                if (i == j) {
//                    result += s2.substring(j, j + 1);
//
//            }
//        }
//
//
//        return result;
//    }

    public static String mergeStrings(String one, String two) {

        String newStr = "";
        int max = Math.max(one.length(),two.length());

        for (int i = 0; i <max ; i++) {
            if( i < one.length()){
                newStr += one.charAt(i);
            }
            if(i < two.length()){
                newStr += two.charAt(i);
            }
        }

        return newStr;

    }
}
    
