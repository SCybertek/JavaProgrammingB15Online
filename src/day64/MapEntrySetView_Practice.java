package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView_Practice {

    public static void main(String[] args) {

        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","Female");
        employeeMap.put("Winfred","Male");
        employeeMap.put("Jereme","Male");
        employeeMap.put("Glad","Female");
        employeeMap.put("Desirae","Female");
        employeeMap.put("Kakalina","Female");
        employeeMap.put("Bertrando","Male");
        employeeMap.put("Ajay","Female");
        employeeMap.put("Brigitte","Female");
        employeeMap.put("Derk","Male");
        employeeMap.put("Orlando","Male");
        employeeMap.put("Selle","Female");
        employeeMap.put("Marika","Female");
        employeeMap.put("Griffy","Male");
        employeeMap.put("Shanon","Female");
        employeeMap.put("Clerkclaude","Male");
        employeeMap.put("Rickard","Male");
        employeeMap.put("Job","Male");
        employeeMap.put("Aida","Female");
        employeeMap.put("Alonzo","Male");

        //task 1:
        // get the entry set view : // we need both entries at the same time
        //because Map does have get method only to get value accoriding to the key! but in here you get Key according to your Value..going other way arround
        // get the name of all the female from the map

        Set<Map.Entry<String, String>> allNames = employeeMap.entrySet();
        for ( Map.Entry<String, String > each : allNames) {
             if (each.getValue().equals("Female") )  {
                System.out.println("each female is = " + each.getKey());
            }
        }
        
        //task 2: update the Female to Queen and Male to King 
        
        for ( Map.Entry<String,String> eachName : allNames) {
            if (eachName.getValue().equals("Female")) {
                eachName.setValue("Queen");
            } else {
                eachName.setValue("King");
            }
        }
        System.out.println("employeeMap = " + employeeMap); // this is Map or we could do allNames as well
       // System.out.println("allNames = " + allNames); //this is Set

        //can we use replace mtheod? YES but it goes for one entry !!
        //we can use String replace method :
        //each.getValue().replace("Male", "King");!!!!!
    }
}
