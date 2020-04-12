package day64;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        //what if we want to have multiple value for one key ?
        //for example groupCode (bugHunter)-- group member names (abc, efg ..)
        //String        List<String>
        //key data type is string value data type is List<String>
        //how to put something in
        Map<String, List<String >> groupMap = new HashMap<>();

        groupMap.put("PowerOf4", Arrays.asList("Sofiya", "Daria","Furkan","Muge")); //unmodifiable
        groupMap.put("BugHunter", Arrays.asList("Maiia","Anastasia","Zaki","Toyly","Zaki"));
        groupMap.put("Achievers", Arrays.asList("Ayse","Rabiyam","Sumeyra"));
        groupMap.put("BugBusters", Arrays.asList("Rukhshona","Fariza","Seyma","Sumeyyra","Huvayda"));

       // System.out.println("groupMap = " + groupMap);


        groupMap.forEach((groupCode, allMembers)-> System.out.println("groupCode= " + groupCode + "\n\t members" + allMembers));

        System.out.println(groupMap.get("BugHunter").get(3)); // first get is MAP method. and second is List method

        //check if this map has Sofiya or not in Powerof4?
        System.out.println(groupMap.get("PowerOf4").contains("Sofiya")); //indexOf will work too
// get method From MAP : contains method is coming from list
        //because the values are List<String> get method will return the entire List


        // we want to add a group entry so we can add or remove members from the group 
        groupMap.put("Justice League", new ArrayList<>(Arrays.asList("Superman","Batman","Akbar")));
        groupMap.get("Justice League").add("Flash");
       // groupMap.get("Justice League").add("")
        System.out.println("groupMap.get(\"Justice League\") = " + groupMap.get("Justice League"));

        //key cannot be  LIST!!!!
        //KEY SHOULD BE SOMETHING IMMUTABLE !!!!! if object cannot be changed it ALWAYS HAS The same hashcode!!
        // if it is not immutable then hashcode will change!!
    }
}
