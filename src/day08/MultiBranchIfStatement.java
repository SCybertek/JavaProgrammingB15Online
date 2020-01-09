package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //pseudo code
        /* given your currentSpeed, speedLimit
        check weather the current speed is more than
        more than 90 --> jail
        more than 80 and less than 90 --> reckless driver

        ---- Start from here ----
        more than 70 --> point taken
        more than 60 and less than 70 --> warning

        if not speeding keep driving
         */
//condition should always start from top to bottom !!

        int currentSpeed = 10;

        if (currentSpeed>90){
            System.out.println("You are speeding!! JAIL time!");
        } else if (currentSpeed> 80) {
            System.out.println("You are speeding! You are reckless driver!");
        } else if (currentSpeed>70 ) {
            System.out.println("You are speeding more than 70 -- POINTS taken!!!");
        //asking whether its less than or equal 70 and more than 60
            //when you come to this point, your speed is already not more than 70
        } else if (currentSpeed> 60) {
            System.out.println("You are speeding, your speed is more than 60 but less than 70");
        } else {
            System.out.println("Keep Driving you are good!!");
        }
    }
}
