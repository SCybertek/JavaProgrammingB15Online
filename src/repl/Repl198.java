package repl;

import java.util.ArrayList;

public class Repl198 {

    public static ArrayList<String> combineAl (ArrayList<String> wordList1, ArrayList<String> wordList2) {
        ArrayList<String> allWords = new ArrayList<>();
         allWords.addAll(wordList1);
         allWords.addAll(wordList2);
                return allWords;
    }

}
