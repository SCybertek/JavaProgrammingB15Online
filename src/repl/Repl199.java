package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl199 {

    public static void main(String[] args) {

        ArrayList<String> baba = new ArrayList<>(Arrays.asList( "Sofiya","Begli","Apple","Begli","Baby"));
        removeAll(baba,"Begli");
    }

    public static void removeAll(ArrayList<String> wordList, String targetWord) {
        //wordlist should loop and we have to see if there is targetWord
        //thatt word has to be removed

        for (int x = 0; x < wordList.size(); x++) {
            if (wordList.get(x).equals(targetWord)) {
                wordList.remove(x);
                x--; // we have to add this since the size of ArrayList will get smaller after removing method
                // and one element can be skipped if we do not decrease the iteration nujmber
            }
        }
        System.out.println(wordList);
    }

    //while(wordList.contains(targetWord)){
    //wordList.remove(targetWord);
    //}
    //}

    //WoW
    //wordList.removeAll(Arrays.asList(targetWord));
    //        System.out.println(wordList);

}
