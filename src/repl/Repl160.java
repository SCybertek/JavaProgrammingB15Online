package repl;

public class Repl160 {

    public static void main(String[] args) {

        String [] words = {"java", "code", "python", "rust","code","rust"};
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        for ( int i = 0 ; i < words.length ; i ++) {
            int counter = 0 ;
            for ( int j = 0 ; j < words.length ; j ++) {
                if ( words [i].equals(words [j] ) ) {
                    counter++;
                }
            } if ( counter == 1 ) {
                System.out.println(words[i]);
            }
        }
    }

}
