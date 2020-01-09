package repl;

public class Repl82 {
    public static void main(String[] args) {
        //            012 = length is 3
        String txt = "foo";
        //your code here

        System.out.println (txt.substring(0,txt.length()-1));
        // burda -1 not -2 because substring does not include the last index but take one before the last index
    }
}
