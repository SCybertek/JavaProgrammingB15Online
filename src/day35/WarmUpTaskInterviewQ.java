package day35;

public class WarmUpTaskInterviewQ {
    public static void main(String[] args) {
        // I have an employee ID: "FB -457"
        //give me th emeployee number and store it into a number
        // to do more with primitive TYpes we better have primitive class
        // ( that are alreday exist in java lang package)!!
        ///so no need to import it .. just use ?


        //Integer

        String strNum = "100";
        int num = Integer.parseInt( strNum );
        System.out.println("num = " + num);

        String emplID = "FB-457" ;

        //Integer class coming from java.lang package
        // it is primarily used to wrap up primitive value and
        // treat as an obj
        // what we will focus here is thorugh
       // many useful static method it provides already
         // presentInt is a static method of Integer class
        // It will turn a String that has only numbers and return int result
        // if we have any non-numerical char --> it will throw NumberFormat Exception

       // int id = Integer.parseInt( emplID ); // no complie error .. but error in console since it has number and FB

        //short way:
        //int id = Integer.parseInt(emplID.split("-")[1]);

        String [] empIDsplit = emplID.split("-");
        String idStr = empIDsplit[1];
        int id = Integer.parseInt(idStr);

        System.out.println("id = " + id);


        // I have a string called twoNumbers
        String twoNumbers = "100,600";

        //I want to add them and give the result


        String num1Str = "100";
        String num2Str = "600";
        //I want to add them and print the result 700

        //LOGIC
        // In order to perform arithmatci operation we must have numbers stored in INT
        //so first we need to turm string to int
        //JDK already provide such method and it comes ffrom java lang


        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        System.out.println("sum of num1 and num2 = " + (num1+num2));



    }
}
