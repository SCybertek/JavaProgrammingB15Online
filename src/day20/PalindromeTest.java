package day20;

public class PalindromeTest {

    public static void main(String[] args) {

        //if your reverse a String if it does not change
        //it is called palindrome
        //check if a word is polindrome
        //if its true test passsed
        //or fail

        //level, kayak, elle, madam, aziza
//                     0123456789     9876543210
        String name = "Nurses run"; //nur sesruN
        String reversedName = "";

        for (int x = name.length()-1; x >= 0; x--) {

            reversedName += name.charAt(x);

        }
        System.out.println("name = "+ name);
        System.out.println("reversedName = " + reversedName);

        //check whether reversed name is equal without case sensitivity

        //boolean condition =

        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed");
        } else {
            System.out.println("Palindrome test has failed");
        }

//homeword!!: make this porgram not caring about the space!!!!
        //interview: reverse a string and test whether the string is equal
        // usereplace.. we didi it with replaceing $ * etc
    }
}
