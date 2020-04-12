package day63;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

        String str = "Finding Word Frequency Sounds Fun , Because Fun Comes in When you count Words" +
                "But How do I count the Words with what I already know previously" +
                "Do it and find out, Words Words Words" ;

//how many words we have :
        String [] allWords = str.split(" ");
        System.out.println("wordCount = " + allWords.length ); // because it is array not SIZE

        //LOGIC:
        //word frequency : we want to solve this using the map
        //because it can have unit KEY and we can use it for unique words :
        // first create Map objcet HashMap implementation :

        Map<String,Integer> wordFreqMap = new HashMap<>();

        // Loop through the word array

        for (String each: allWords) {
            if (wordFreqMap.containsKey(each) == false) { //if we dont have it : also  : !wordFreqMap.containsKey(each)
                wordFreqMap.put(each,1) ;
            } else {
                //int newCount = wordFreqMap.get(each) + 1;
                wordFreqMap.replace(each, wordFreqMap.get(each) + 1  ) ;
            }
        }
        System.out.println("wordFreqMap = " + wordFreqMap);


        // check if we already have the word in the key or not
        // if we do no t have the jey, it means we are entering for the first time
        // so the count will be 1 , add using put method
        //else it means we already have it in the key , we get existing count using that key
        //and replace old count value by new count value by incrementing by one



    }
}
