package codingBat.mapPractice;

import java.util.HashMap;
import java.util.Map;

public class Word0andWordCount {

    //TODO Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
    // always with the value 0. For example the string "hello" makes the pair "hello":0.
    // We'll do more complicated counting later, but for this problem the value is simply 0.


    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for ( String each : strings) {
            map.put(each, 0);
        }

        return map;
    }

    //TODO The classic word-count algorithm:
    // given an array of strings, return a Map<String, Integer> with a key for each different string,
    // with the value the number of times that string appears in the array.
    //this is like frequency example we did earlier in class
    //logic for FREQUENCY :
    //loop through array and count if never appeared then 1
    //if already appeared then + 1

    public Map<String, Integer> wordCount(String[] strings) {
    Map<String,Integer> map1 = new HashMap<>();
    for ( String each : strings) {
        if (!map1.containsKey(each)) {
            map1.put(each, 1);
        } else {
            map1.put(each, map1.get(each) + 1);
        }
    }
        return map1;

    }




}