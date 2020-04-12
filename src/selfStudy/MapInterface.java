package selfStudy;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

    public static void main(String[] args) {


        //map : cannot haveduplicates:
        // have two data type : key and value
        //no insertion order in hashmap!
        //MAP IS NOT ITERABLE !! because it does not extends Iterable interface!!

        Map<String,Integer> scoreMap = new HashMap<>();
        System.out.println(scoreMap.size() ); //0 
        
        //adding elements : 
        
        scoreMap.put("Adam", 90);
        scoreMap.put("John", 100);

        System.out.println("scoreMap = " + scoreMap);

        System.out.println(scoreMap.size() ); //3

        //get(object key) ;

        System.out.println(scoreMap.get("Mary") ); //null
        System.out.println(scoreMap.get("Adam") ); //90 
        
        //boolean isEmpty (); 
        System.out.println("scoreMap.isEmpty() = " + scoreMap.isEmpty()); //false
        
        //boolean containsKey(ObjectKey); 

        System.out.println("scoreMap.containsKey(\"John\") = " + scoreMap.containsKey("John"));//true

        //adding duplicate key :
        scoreMap.put("John",100);
        System.out.println("scoreMap = " + scoreMap); //does nothing since it is a duplicate
        scoreMap.put("John",99);
        System.out.println("scoreMap = " + scoreMap);

        //containsValue(Objcet value) ;

        System.out.println("scoreMap.containsValue(100) = " + scoreMap.containsValue(100)); //false since its i no longer there 
        System.out.println("scoreMap.containsValue(99) = " + scoreMap.containsValue(99));

        //v remove(Object key);
        System.out.println("scoreMap.remove(\"Adam\") = " + scoreMap.remove("Adam"));

        System.out.println("scoreMap = " + scoreMap); // no adam anymore


        //second map

        Map<String,Integer> scoreMap2 = new HashMap<>();
        scoreMap2.put("Diana",80);
        scoreMap2.put("Mary",78);
        scoreMap2.put("Beian",56);
        System.out.println("scoreMap2 = " + scoreMap2);
        
        //together: putAll(another map) ; 
        scoreMap.putAll(scoreMap2);
        System.out.println("scoreMap = " + scoreMap);

        //void clear ();
        scoreMap2.clear();
        System.out.println("scoreMap2 = " + scoreMap2);

        //JAVA 8 additiion :

        //putIfAbsent(key and value) ;
        scoreMap.putIfAbsent("Mary",100);
        System.out.println("scoreMap = " + scoreMap);//it checks the key first and then if you have it then it ignores it
        
    }
}
