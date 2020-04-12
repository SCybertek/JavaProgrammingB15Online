package day63;

import java.util.*;

public class FindingCharacterThatShowedUpAtLeastOnce2 {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

       Set<Character> chars = new HashSet<>();



        //Set<Character> chars = new HashSet<>( Arrays.asList('A','A','A','A','A')   );

        // Instead of going through each and every character
        // I want to turn this String into a String array of each character
        String[] eachCharStrArray = str.split("");
        System.out.println("Arrays.toString(eachCharStrArray)  = " + Arrays.toString(eachCharStrArray));

        // then turn it into a List with Arrays.AsList
        List<String> charLst = Arrays.asList(eachCharStrArray);

        // eventually create a HashSet object by copying everything inside this list=
        Set<String> charSet = new HashSet<>(charLst);
        System.out.println("charSet = " + charSet);


        // THE ONE SHOT WAY OF DOING THIS
        Set<String> charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("charSetShortWay = " + charSetShortWay);





       //when we split by “” — we do not loose any character or space right? -- Looks like yes!!
// split by "" is a hack , there is a symbolic "nothing" in between each character of String


    }
}
