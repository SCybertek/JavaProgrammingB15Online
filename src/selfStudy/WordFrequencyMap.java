package selfStudy;

import java.util.*;

public class WordFrequencyMap {
    public static void main(String[] args) {


        String str = "Finding Word Frequency Sounds Fun , Because Fun Comes in When you count Words" +
                "But How do I count the Words with what I already know previously" +
                "Do it and find out, Words Words Words";



        // to calculate each word and hwo many it appears:
        // we can use hashMap since it is going to save only unique value pairs

        Map<String,Integer> wordsMap = new HashMap<>();

        //we need to loop through string and add words in here
        //first convert into String array

          String [] strSplitArray= str.split(" ");

        for (int i = 0; i < strSplitArray.length; i++) { //loop through each and every word
            if (!wordsMap.containsKey(strSplitArray[i])) {
                wordsMap.put(strSplitArray[i],1);
            }else {
                wordsMap.replace(strSplitArray[i],wordsMap.get(strSplitArray[i])+1);
            }
        }

        System.out.println("wordsMap frequency of words= " + wordsMap);

        System.out.println("WITH FOR EACH LOOP");

        for(String currentWord : strSplitArray) {
            if ( wordsMap.containsKey(currentWord)==false){
                wordsMap.put(currentWord,1);
            }else {
                wordsMap.put(currentWord, wordsMap.get(currentWord) +1);
            }
        }

        System.out.println("wordsMap frequency of words = " + wordsMap);


    }
}