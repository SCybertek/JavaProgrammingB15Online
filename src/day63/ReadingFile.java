package day63;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFile {

    public static void main(String[] args) throws Exception {


        List<String > allData =  Files.readAllLines(Paths.get("/Users/beglight/IdeaProjects/JavaProgrammingB15Online/src/day63/employee_data.txt"));
        //we have data that goes like this :
        //ID and name
        //lets populate into a Map
        for (String eachLine : allData){
            System.out.println("eachLine = " + eachLine);
        }
        
        allData.forEach(everyRow -> System.out.println("everyRow = " + everyRow));

        Map<Integer,String > idName = new HashMap<>();
//
//        String line = "1,Lilian";
//        int number = Integer.parseInt(line.split(",")[0]);
//        String name = line.split(",")[1];

//        idName.put(number,name);
//        System.out.println("idName = " + idName);

        for (String eachLine : allData){
            int number = Integer.parseInt(eachLine.split(",")[0]);
            String name = eachLine.split(",")[1];
            idName.put(number,name);
        }

        System.out.println("idName = " + idName);

        System.out.println("idName.get(20) = " + idName.get(20));

       




//
//        Map<Integer,String> idNamePair = new HashMap<>();
//        for (String eachLine : allData) {
//            //System.out.println("eachLine = " + eachLine);
//
//            //String line = "1,Lilian";
//            int id = Integer.parseInt(eachLine.split(",")[0] );
//
//            String name = eachLine.split(",")[1];
//
//            idNamePair.put(id,name);
//        }
//       // System.out.println("idNamePair = " + idNamePair);
//
//        idNamePair.forEach((key, value) -> System.out.println("ID: " + key + " | Name: " + value));

       

        //from this : 1,Lilian to :
        //1 and spearate Lilian

//        String line = "1,Lilian";
//        int id = Integer.parseInt(line.split(",")[0] );
//
//        String name = line.split(",")[1];

      //  Map<Integer,String> idNamePair = new HashMap<>();
//        idNamePair.put(id, name);
//        System.out.println("idNamePair = " + idNamePair); //adding one item
        //now we need to add list of DATA :
        //we take this code and put into a list : got o line 18




        //Lambda expression :
       // allData.forEach(each -> System.out.println("each = " + each));
        
            }
}
