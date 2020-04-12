package codingBat.mapPractice;
import java.util.*;
public class Topping2and3 {
    //TODO if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
    // If the key "spinach" has a value, change that value to "nuts".

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream") ) {
            map.put("yogurt",map.get("ice cream") ) ;
        }
        if (map.containsKey("spinach")) {
            map.put("spinach","nuts") ;
        }
        return map;
    }

    //TODO if the key "potato" has a value, set that as the value for the key "fries".
    // If the key "salad" has a value, set that as the value for the key "spinach".

    public Map<String, String> topping3(Map<String, String> map) {
        if ( map.containsKey("potato") ) {
            map.put("fries", map.get("potato") ) ;
        }
        if (map.containsKey("salad") ) {
            map.put("spinach", map.get("salad") );
        }
        return map;
    }
    //alternative this did not work : because it will replcae what if never had fries in the list..we have to use put thats why
//     map.replace("fries", map.get("potato") ) ;
// map.replace("spinach",map.get("salad") ) ;
}
