package codingBat.mapPractice;

import java.util.Map;

public class Share {
    public static void main(String[] args) {
        //TODO : if the key a has the value
        //set b to have the same value
        //remove the c
        //and leave the rest unchanged !


    }

    public Map<String ,String  > mapShare ( Map<String ,String > map) {
        map.remove("c");
        if ( map.containsKey("a")) {
            map.put("b",map.get("a"));
        }


        return map;
    }
}
