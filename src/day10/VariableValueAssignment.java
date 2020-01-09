package day10;

public class VariableValueAssignment {
    public static void main(String[] args) {
        int offerCount = 3;
        //string message: this line just declaring a variable

        // String message = "something";
        //this line is declaring and assigning the value
        //assigning the value for the first time, also called initializing
        //  message= "something else"; //changing the value/ reassigning

        //String message = "";
        //System.out.println(message);

        //any variable that you declared inside {//also called block} it is only available withinh this block. but not OUTSIDE

        String message = "";

        if (offerCount>2) {
       //WHY IT DID NOT WORK ??     String message = "Great job!!";}

            System.out.println(message);

        //if you don't initialise the value ...
        //having no value is different than having an EMPTY value
    }

}
}
