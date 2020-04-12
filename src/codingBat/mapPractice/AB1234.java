package codingBat.mapPractice;
import java.util.* ;
public class AB1234 {
    public static void main(String[] args) {
        //TODO modify ans return map :
        //map may or may notc ontain values a or b
        //if both are present
        //append 2 string values together and store in key ab
    }
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") ) {
            map.put("ab", map.get("a") + map.get("b") ) ;
        }
        return map;
    }

    //TODO if the keys "a" and "b" are both in the map and have equal values, remove them both.
    public Map<String, String> mapAB2(Map<String, String> map) {
        if ( (map.containsKey("a") && map.containsKey("b") ) && (map.get("a").equals(map.get("b") ) ) ) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
    //TODO if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.

    public Map<String, String> mapAB3(Map<String, String> map) {
        if ( (map.get("a") != null ) && (map.get("b")==null) ){
            map.put("b", map.get("a") ) ;
        }
        if  (( map.get("b") != null )  && (map.get("a")==null) ){
            map.put("a",map.get("b") );
        }
        return map;
    }

    //TODO  if the keys "a" and "b" have values that have different lengths,
    // then set "c" to have the longer value.
    // If the values exist and have the same length, change them both to the empty string in the map.
    //fails as well some tests
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && (map.containsKey("b"))) {
            if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            }
            if (map.get("a").length() < map.get("b").length()) {
                map.put("c", map.get("b"));
            }
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    //TODO Given an array of non-empty strings, create and return a Map<String, String> as follows:
    // for each string add its first character as a key with its last character as the value.

    public Map<String, String> pairs(String[] strings) {
        Map<String,String> map1 = new HashMap<>();
        for ( int x = 0 ; x < strings.length ; x ++) {
            map1.put(strings[x].charAt(0) +"" , strings[x].charAt(strings[x].length()-1) + "" ) ;
        }
        return map1;
    }
}
