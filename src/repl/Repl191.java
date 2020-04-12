package repl;

public class Repl191 {

    //reverse a string 
    public static void main(String[] args) {


        String input = "balkon";
        String reversedInput = "";

        for (int i = input.length()-1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }
        System.out.println(reversedInput);
    }
}