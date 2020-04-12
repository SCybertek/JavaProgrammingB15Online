package repl;

public class Repl203 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Noon"));
        System.out.println(isPalindrome("Nurses run"));
    }

    public static boolean isPalindrome(String check) {
        //return true if string provided is palindrome
        //- make your conditions case insensitive.  ex: Civic and civic are both palindromes
        //- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.
        //to get rid of the space :
        check = check.replace(" ", "");
        String reverseCheck = "";

        //this code below does not have any condition if string provided has space (more than one word)
        // loop and save into revese string and check if they are equal

        for (int i = check.length() - 1; i >= 0; i--) {
            reverseCheck += check.charAt(i);

        }
        return check.equalsIgnoreCase(reverseCheck);

    }
}
