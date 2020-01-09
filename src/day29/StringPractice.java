package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        // Task :
        // Hero code is Superman and Identity is Clark Kent
        // The initial of the Hero is CK

        // LOGIC 1 : split this String by dash -
        //split result is String

        //  to get 2 pieces of String into a String array
        String[] heroSplitted = hero1.split("-");
        System.out.println("heroSplitted = " + Arrays.toString(heroSplitted));

        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

        // Hero code is Superman and Identity is Clark Kent
        System.out.println("Hero code is "+ heroSplitted[0]+ " and Identity is "+ heroSplitted[1]);

        System.out.println("Hero cod is "+ heroCode + " and Identity is "+ fullName);

        //to get the initial CK
        //I can just use fullName variable to finish this task

       //logic 1: get the fist letter of fullName then get the letter after the space
        //what if this guy has middle name ? then this logic can be tricky
        //solution: insetad of looking for the letter after first space
         //           look for last index of the space then get next char

        //note:  Last character of any String -->> str.charAt( str.length()-1  )
                 //Last element   of any Array  -->>  arr[ arr.length-1  ]

        // logic 2: split by space and get first middle and last name
        //  get the first letter of full name
        //  get the last name using last item index
        //  get the first character then concatenate
        // Clark Kent [ Clark , Kent ] Clark -. C Kent - K

        String [] fullNameSplitted = fullName.split(" ");
        System.out.println("FullName Splitted "+ Arrays.toString(fullNameSplitted));

        //last name will be always the last element of splitted full name
        //no matter the name has middle name or not

        String lastName = fullNameSplitted [ fullNameSplitted.length-1];
        System.out.println("lastName = " + lastName );
        System.out.println("initial of the hero is : "+ fullName.charAt(0)+ lastName.charAt(0));




    }
}
