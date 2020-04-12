package day64;

import java.util.*;

public class TableData {
    public static void main(String[] args) {

        /**Represent TAble date using Collection :
         * so you have easy access to the data
         * by row number and column name
         * start with single row
         *
         * YOu want to be able to get the data by its column name
         *
         * Map<String,String> </String,String>
         *
          */

        Map<String ,String > row1 = new LinkedHashMap<>();
        row1.put("first_name","Regan");
        row1.put("email","rboichat0@1688.com") ;
        row1.put("gender","Female");

        Map<String,String> row2 = new LinkedHashMap<>();
        row2.put("first_name", "Carleen" );
        row2.put("email", "cmorillas1@blog.com" );
        row2.put("gender", "Male" );

        //for one row I used one map
        //but I have many rows
        //many of some type--> List<SomeType>

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);
        
        List< Map<String,String >> rowMapList = new ArrayList<>();
        rowMapList.add(row1);
        rowMapList.add(row2);

        System.out.println("rowMapList = " + rowMapList);

//        System.out.println("rowMapList = " + rowMapList);
//        System.out.println("rowMapList.get(1).get(\"email\") = "
           //     + rowMapList.get(1).get("email"));

        //update the Name of 1st row to Hulk

        rowMapList.get(0).replace("first_name","Hulk"); //from regan to Hulk
        System.out.println("rowMapList = " + rowMapList);
        rowMapList.get(0).put("first_name","Jane"); //put in here will update tge value of first name to Jane
        System.out.println("rowMapList = " + rowMapList);




        //answer :
        //
        // List<String> readingEmployeeDataTxt = Files.readAllLines(Paths.get("src/day64/EmployeeData1.txt"));
        //for(String eachLine: readingEmployeeDataTxt){
        //    String[] arr = eachLine.split(",");
        //    Map<String,String> eachRow = new LinkedHashMap<>();
        //    eachRow.put("first name", arr[0]);
        //    eachRow.put("email", arr[1]);
        //    eachRow.put("gender", arr[2]);
        //    rowMapsList.add(eachRow);
    }
}
