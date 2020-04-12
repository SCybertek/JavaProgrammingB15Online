package day63;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {

    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No it is never Ending" ;

        System.out.println(str);
        System.out.println(getFrequencyMap(str));

    }

    public static Map<String,Integer> getFrequencyMap(String str) {

        Map<String,Integer> wordFreMap = new HashMap<>();
        for (String word : str.split(" ") ) {
            //System.out.println("word = " + word);
            if (! wordFreMap.containsKey(word)){
                wordFreMap.put(word,1);
            }else {
                wordFreMap.replace(word,wordFreMap.get(word)+1);
            }
        }
return wordFreMap;
    }
}
