package codingBat.mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bully {
    public static void main(String[] args) {

        //TO DO Modify and return the given map as follows:
        // if the key "a" has a value, set the key "b" to have that value,
        // and set the key "a" to have the value "". Basically "b" is a bully,
        // taking the value and replacing it with the empty string.
        //ex: mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
        //System.out.println(mapBully({"a": "candy"}) ) ;
        ;// {"a": "", "b": "candy"}


    }

    public Map<String, String> mapBully(Map<String, String> map) {
        // Map<String, String> map1 = new LinkedHashMap<>(); //we need insertion order in here I think
        //our steps : first take the map and get the key a , and replace the value to ""
        //at the same time replace the value of key b
        if (map.containsKey("a")) {

            map.put("b",map.get("a"));
            map.put("a","");

        }
        return map;

    }
}
