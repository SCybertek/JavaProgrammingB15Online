package officeHour;

import java.util.Arrays;

public class Practice_12_19_2 {
    public static void main(String[] args) {
        /* this was INTERVIEW QUESTION:

        1. write a program that can check if a string is build out of the same letters as another string
        Ex: input:
        str1 = "abc";
        str2 = "cba";
        */

        String str1 = "abc";
        String str2 = "cba";

        //can we convert String to Array??? these 2 methods can do that :

        //split()
        //toCharArray()

        char[] arr1 = str1.toCharArray(); //[a,b,c]
        Arrays.sort(arr1); // [a,b,c]

        char[] arr2 = str2.toCharArray(); // [c,b,a]
        Arrays.sort(arr2); // [a,b,c]

        //Array equality
        System.out.println(Arrays.equals(arr1,arr2));

        //can we convert back from array to string?
        //Arrays.toString();

        str1 = Arrays.toString(arr1);
        str2 = Arrays.toString(arr2);


        System.out.println(str1.equals(str2)); //true

        /*

        2. Write a program that will remove all the duplicates from a string
        Do it with Arrays only
        */

        String s1 = "aaabbaaccbbdd"; // expected : abcd
        String s2 = ""; // we ned to initialize to store non duplicated characters

        for (int i = 0; i < s1.length(); i++) {
            String eachChar = ""+s1.charAt(i); // we added "" to convert char to string!!!! WOW

            if (!s2.contains(eachChar))
            s2 +=eachChar; // we only concate the char if that char is not existing in s2
        }
        System.out.println(s2);

        //solution two


        /*
          // solution two
        String fiveMinutes ="abcabcdeedddeeefffffjjjj";
        String[]  EachChar  =   fiveMinutes.split("");
        String result = "";  // to store all non duplicated String objects of the array
        for( String each :  EachChar ){
            if( !result.contains(each) ){
                result += each;
            }
        }
        System.out.println(result);

         */



        /*
        3. given the array of names:
        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
        write a program that can remove all the names named Ahmed from the array
        Ex:
        names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
        System.out.println( Arrays.toString(names) );
        output:
	   			[John, Eric, Hassan]


         */
    }
}
