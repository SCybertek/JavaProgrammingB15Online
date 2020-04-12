package day63;

import java.util.HashSet;
import java.util.* ;

public class MapAddingElements {

    public static void main(String[] args) {
        
        //creating HashMap objects
        // both KEY AND VALUE has entry -- KEY VALUE PAIR
        
        Map<String,Integer> nameAgePair = new HashMap<>();
        
        //adding elements : put 
        
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Muhammed",21);
        nameAgePair.put("Maiia",27);
        nameAgePair.put("Aidar",20);
        nameAgePair.put("Fatih",27);
        nameAgePair.put("Roksana",16);
        // COPY!!:
        //kEY NOT ALLOWING DUPLICATES! : VALUE IS ALLOWING 
        nameAgePair.put("Zehra",7);

        //how do I only add new items if it does not already exists (java 8 addition) // so we do not constanly ask contains or not
        nameAgePair.putIfAbsent("Zehra",10);
        //if already have zehra then it will get ignored!!
        
       

        System.out.println("nameAgePair = " + nameAgePair);
        //output :nameAgePair = {Fatih=27, Muhammed=21, Maiia=27, Aidar=20, Roksana=16, Zehra=7}
        //no order!!: hashmap
        //nameAgePair = {Fatih=27, Muhammed=21, Maiia=27, Aidar=20, Zehra=6}

        System.out.println("nameAgePair.size() = " + nameAgePair.size());
        //how do we get the value according to the KEY?

        //KEY: first element in MAP
        //VALUE: second element in MAP 
        
        //how to get fatihs age ?
        System.out.println("nameAgePair.get(\"fatih\") = " + nameAgePair.get("fatih"));//output is NULL since it is case censitive
        
        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));

        //how to check if the key exists or not 
        System.out.println("nameAgePair.containsKey(\"Roksana\") = " + nameAgePair.containsKey("Roksana"));
        System.out.println("nameAgePair.containsKey(\"Hasan\") = " + nameAgePair.containsKey("Hasan"));
        
        //crud ??? remove - update - delete -remove ..short name for these functions.. not so important

        //put to add new elements
        //replace can be two way : replace by giving Key and new Value
        //or replace  by giving Key and old value. and new value.. if old value is not matching then will not change!!!


//        nameAgePair.replace("Fatih",55);
//        System.out.println("nameAgePair replace method Fatih = " + nameAgePair);

        //updateing the element in the map: using REPLACE! 
        nameAgePair.replace("Fatih",17);
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));

        //if you eneter wrong key and replace value then the teplace method gets ignored.. because of mismatch..
        // if we used put method it would have added a new Fatiih
        nameAgePair.replace("Fatiih",27);
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));

        //updating the value only if the old value equals to aspecific value :
        //changed zehras age to 9 if it was 7
        //if our old value odes not match then it will not change!!
        nameAgePair.replace("Zehra",7,9);
        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));

        //removing entry by the key :
        nameAgePair.remove("Fatih");
        // try not to use get method to check you have the entry or not
        // because if you don't have the key you will get null
        // but you will also get null if the value was actually null -- {Fatih=Null}
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));
        System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));

        //TO CHECK if you have item or not!! : .containsKey  .. DO  NOT USE GET TO CHECK because if you dont have it wil show yo NULL !!



        //updating the element in the map:
        //there is no updating a KEY!!
        //you can delete or remove the KEY..but not modify! 
        //first way : you can use put and replace the value of AGE for example
        //but you have to know that the key exists in the map to be able to update using PUT method 
        //if you dont have it ..it will accidentally ADD new element ..and you did not wanted it 
        
        //another way is : 
        //replace method : you can add new value to map
    }
}
