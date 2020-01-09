package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        /*
        Task 2

        Create string called citizenType
        and create age variable with value  , if >65 then assign a value as senior
        else, not senior
         */

        String citizenType;

        int age = 80; //create age variable

        if (age>65) {
            citizenType = "Senior";
        } else {
            citizenType = "Not Senior";
        }

        System.out.println("The citizen age is "+ age + " ,and he is a "+ citizenType);

        //what can you do inside the each part of If statement inside curly braces
        // you can put multiple System.outs or even variables like we didi in here with citizenType
    }
}
