package day14;

public class StringReview {
    public static void main(String[] args) {
        String str ="Pumpkin";
        System.out.println("str = " + str);
        
        ///System.out.println(  str.equals("Pumpkin"));


        //contains:

        //it checks wheather a string exists in another string
        //and return true or false result
        System.out.println(str.contains ("Pumpkin"));
        //true
        boolean gotPumpkin = str.contains("Pumpkin");

        //shortcut to print variable value in nice format use:soutV + enter

        System.out.println("gotPumpkin = " + gotPumpkin);

        //startsWith endsWith
        //check whether a string start with another string -->true or false result
        //check whether a string start with another string --> true or false

        boolean startedWithI = (str.startsWith("I"));
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin") ;
        System.out.println("end With Pumpkin = " + endWithPumpkin);








    }

}
