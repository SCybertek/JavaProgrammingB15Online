package day64;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class TableDateFromTextFile {

    public static void main(String[] args) throws IOException {

        List<String> allData = Files.readAllLines(Paths.get("/Users/beglight/IdeaProjects/JavaProgrammingB15Online/src/day64/DataTable.txt") );
        //Here is the data you can use if you want to fill up your List of Map from the text file

        //first step iterate over this List of string:
        List< Map<String,String >> rowMapList = new ArrayList<>();
        // creating LIST OF MAP : // each row is one map 
        
        for ( String eachLine : allData) {
           // String [] slitted = eachLine.split(","); //every line splitted by comma to store in array
            Map<String, String > eachRow = new LinkedHashMap<>();
            eachRow.put("first_name", eachLine.split(",")[0]) ;
            eachRow.put("email", eachLine.split(",")[1]);
            eachRow.put("gender", eachLine.split(",")[2]);

            rowMapList.add(eachRow);
            
        }
        //System.out.println("rowMapList = " + rowMapList);
        rowMapList.forEach(each -> System.out.println("each = " + each));


//look at that :
        // public static List<Map<String, String>> tableDataFromFile(String url) throws IOException{
        //        List<String> file = Files.readAllLines(Paths.get(url));
        //        List<Map<String, String>> data = new ArrayList<>();
        //        List<List<String>> eachValue = new ArrayList<>();
        //        for(int i =1; i<file.size(); i++) {
        //            eachValue.add(Arrays.asList(file.get(i).split(",")));
        //        }
        //        List<String> keys =  Arrays.asList(file.get(0).split(","));
        //        Map<String, String> row = new LinkedHashMap<>();
        //        for(List<String> each : eachValue){
        //            for(int i=0; i<keys.size(); i++) {
        //                row.put(keys.get(i), each.get(i));
        //            }
        //            data.add(new LinkedHashMap<>(row));
        //            row.clear();
        //        }
        //        return data;
        //    }


    }
}
