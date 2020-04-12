package repl;

public class Repl179 {

    public static void main(String[] args) {

        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;

    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
                if ( !unique.contains(str.charAt(i)+ "") ) {
                 unique += str.charAt(i) + "";

                }
            }
        return unique;
        }


    }

