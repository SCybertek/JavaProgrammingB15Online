package codingBat.mapPractice;
import java.util.*;
public class WordLenandPairs {

    //TODO return a Map<String, Integer> containing a key for every different string in the array,
    // and the value is that string's length.

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String,Integer> map1 = new HashMap<>();
        for ( String each : strings) {
            map1.put(each, each.length() );
        }
        return map1;
    }

}
