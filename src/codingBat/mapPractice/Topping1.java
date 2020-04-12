package codingBat.mapPractice;
import java.util.* ;
public class Topping1 {
    //TODO if ice cream is present set it to cherry
    //in all cases set bread to butter


    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }
}